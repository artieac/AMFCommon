package com.alwaysmoveforward.oauth.common.encryption;

import org.apache.log4j.Logger;
import org.apache.tomcat.util.codec.binary.Base64;
import org.omg.IOP.ExceptionDetailMessage;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

/**
 * Created by acorrea on 4/11/2016.
 */
public class AESManager
{
    private static final Logger logger = Logger.getLogger(AESManager.class);

    private static final int NumberOfIterations = 54321;

    public AESManager(AESConfiguration aesConfiguration)
    {
        this(aesConfiguration.getEncryptionKey(), aesConfiguration.getEncryptionSalt());
    }

    /// <summary>
    /// AES Encryption Manager constructor
    /// </summary>
    /// <param name="key">the key used to encrypt/decrypt</param>
    /// <param name="salt">the salt used to encrypt/decrypt</param>
    public AESManager(String _key, String _salt)
    {
        this.setKey(_key);
        this.setSalt(_salt);
    }

    /// <summary>
    /// Gets the encryption Key
    /// </summary>
    private String key;
    public String getKey() { return this.key; }
    private void setKey(String value) { this.key = value;}

    /// <summary>
    /// Gets the encryption Salt
    /// </summary>
    private String salt;
    public String getSalt() { return this.salt;}
    private void setSalt(String value) { this.salt = value;}

    /// <summary>
    /// Encrypt some plaintext
    /// </summary>
    /// <param name="plainText">The unencrypted plaintext</param>
    /// <returns>An encrypted string</returns>
    public String Encrypt(String plainText)
    {
        return this.Encrypt(this.getKey(), this.getSalt(), plainText);
    }

    /// <summary>
    /// Encrypt some plaintext given a key, a salt and some plaintext
    /// </summary>
    /// <param name="encryptionKey">an encryption key</param>
    /// <param name="encryptionSalt">an encryption salt</param>
    /// <param name="plainText">The unencrypted plaintext</param>
    /// <returns>An encrypted string</returns>
    private String Encrypt(String encryptionKey, String encryptionSalt, String plainText)
    {
        String retVal = "";

        if (plainText != null && !plainText.isEmpty())
        {
            try
            {
                IvParameterSpec aesSalt = new IvParameterSpec(encryptionSalt.getBytes());
                PBEKeySpec pbeKeySpec = new PBEKeySpec(encryptionKey.toCharArray(), encryptionSalt.getBytes(StandardCharsets.UTF_8), AESManager.NumberOfIterations, 256);
                SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1");
                SecretKey tempKey = secretKeyFactory.generateSecret(pbeKeySpec);
                SecretKey aesKey = new SecretKeySpec(tempKey.getEncoded(), "AES");

                Cipher encryptionCipher = Cipher.getInstance("AES/CTS/PKCS5Padding");
                encryptionCipher.init(Cipher.ENCRYPT_MODE, aesKey, aesSalt);

                byte[] encryptedBytes = encryptionCipher.doFinal(plainText.getBytes(StandardCharsets.UTF_16));
                retVal = Base64.encodeBase64String(encryptedBytes);
            }
            catch(Exception e)
            {
                logger.error(e);
            }
        }

        return retVal;
    }

    /// <summary>
    /// Decrypt some encrypted text
    /// </summary>
    /// <param name="encryptedText">Encrypted string</param>
    /// <returns>Decrypted string</returns>
    public String Decrypt(String encryptedText)
    {
        return this.Decrypt(this.getKey(), this.getSalt(), encryptedText);
    }

    /// <summary>
    /// Decrypt some encrypted text with a key and salt
    /// </summary>
    /// <param name="encryptionKey">Encryption Key</param>
    /// <param name="encryptionSalt">Encryption Salt</param>
    /// <param name="encryptedText">Encrypted string</param>
    /// <returns>Decrypted string</returns>
    private String Decrypt(String encryptionKey, String encryptionSalt, String encryptedText)
    {
        String retVal = "";

        if (encryptedText != null && !encryptedText.isEmpty())
        {
            try
            {
                IvParameterSpec aesSalt = new IvParameterSpec(encryptionSalt.getBytes());
                PBEKeySpec pbeKeySpec = new PBEKeySpec(encryptionKey.toCharArray(), encryptionSalt.getBytes(StandardCharsets.UTF_8), AESManager.NumberOfIterations, 256);
                SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1");
                SecretKey tempKey = secretKeyFactory.generateSecret(pbeKeySpec);
                SecretKey aesKey = new SecretKeySpec(tempKey.getEncoded(), "AES");

                Cipher encryptionCipher = Cipher.getInstance("AES/CTS/PKCS5Padding");
                encryptionCipher.init(Cipher.DECRYPT_MODE, aesKey, aesSalt);

                byte[] decryptedBytes = encryptionCipher.doFinal(Base64.decodeBase64(encryptedText));
                retVal = new String(decryptedBytes, StandardCharsets.UTF_16);
            }
            catch(Exception e)
            {
                logger.error(e);
            }
        }

        return retVal;
    }
}
