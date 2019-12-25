package com.pp.mongodbrest.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * 
 * @author PRATHAMESH PAWAR
 *
 */
@SpringBootApplication
@EnableMongoRepositories("com.pp.mongodbrest.repository")
@ComponentScan("com.pp.mongodbrest")
public class  MongoDbRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(MongoDbRestApplication.class, args);
	}
}
