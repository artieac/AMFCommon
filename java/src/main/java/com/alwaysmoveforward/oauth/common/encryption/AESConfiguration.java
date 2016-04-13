package com.alwaysmoveforward.oauth.common.encryption;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * Created by acorrea on 4/13/2016.
 */
@Component
public class AESConfiguration
{
    @Value("${alwaysmoveforward.aes.encryptionkey}")
    private String encryptionKey;
    public String getEncryptionKey() { return this.encryptionKey;}

    @Value("${alwaysmoveforward.aes.encryptionsalt}")
    private String encryptionSalt;
    public String getEncryptionSalt() { return this.encryptionSalt;}
}
