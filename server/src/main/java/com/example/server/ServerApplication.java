package com.example.server;

import com.example.server.dao.UserRepositiry;
import com.example.server.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ServerApplication{
	@Autowired
	private UserRepositiry userRepositiry;

	public static void main(String[] args) {
		SpringApplication.run(ServerApplication.class, args);
	}
}
