package com.spring.vault;

import com.spring.vault.configuration.Credentials;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@EnableConfigurationProperties(Credentials.class)
public class VaultApplication implements CommandLineRunner {

	private static Logger log = LoggerFactory.getLogger(VaultApplication.class);

	private final Credentials credentials;

	public VaultApplication(Credentials credentials) {
		this.credentials = credentials;
	}


	public static void main(String[] args) {
		ConfigurableApplicationContext configurableApplicationContext = SpringApplication.run(VaultApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		log.info("Username: " + credentials.getUsername());
	}
}
