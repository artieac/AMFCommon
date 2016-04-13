package com.alwaysmoveforward.oauth;

import com.alwaysmoveforward.oauth.common.encryption.DataSourceEncryption;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OAuthApplication {

	@Autowired
	DataSourceEncryption dataSourceEncryption;

	public static void main(String[] args) {
		SpringApplication.run(OAuthApplication.class, args);
	}
}
