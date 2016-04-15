package com.alwaysmoveforward.oauth.common.encryption;


import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.Properties;

/**
 * Created by acorrea on 4/12/2016.
 */
@Configuration
public class DataSourceEncryption
{
    @Autowired
    private AESConfiguration aesConfiguration;

    @Value("${spring.datasource.driver-class-name}")
    private String databaseDriverClassName;

    @Value("${spring.datasource.url}")
    private String datasourceUrl;

    @Value("${spring.datasource.username}")
    private String encryptedDatabaseUsername;

    @Value("${spring.datasource.password}")
    private String encyrptedDatabasePassword;

    @Value ("${alwaysmoveforward.datasource.isencrypted}")
    private Boolean isEncrypted;

    @Bean
    public DataSource datasource() throws IOException
    {
        org.apache.tomcat.jdbc.pool.DataSource ds = new org.apache.tomcat.jdbc.pool.DataSource();
        ds.setDriverClassName(databaseDriverClassName);
        ds.setUrl(datasourceUrl);

        if(this.isEncrypted)
        {
            AESManager aesManager = new AESManager(aesConfiguration);
            this.encryptedDatabaseUsername = aesManager.Encrypt(this.encryptedDatabaseUsername);
            ds.setUsername(aesManager.Decrypt(encryptedDatabaseUsername));
            this.encyrptedDatabasePassword = aesManager.Encrypt(this.encyrptedDatabasePassword);
            ds.setPassword(aesManager.Decrypt(encyrptedDatabasePassword));
        }
        else
        {
            ds.setUsername(encryptedDatabaseUsername);
            ds.setPassword(encyrptedDatabasePassword);
        }

        return ds;
    }
}