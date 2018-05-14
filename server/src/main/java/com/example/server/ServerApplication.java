package com.example.server;

import com.example.server.dao.UserRepositiry;
import com.example.server.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ServerApplication implements CommandLineRunner {
	@Autowired
	private UserRepositiry userRepositiry;

	public static void main(String[] args) {
		SpringApplication.run(ServerApplication.class, args);
	}

	@Override
	public void run(String... strings) throws Exception {
		userRepositiry.save(new User("Valera", "Ivanov"));
		userRepositiry.save(new User("Kolya", "Petrov"));
		userRepositiry.save(new User("Ivan", "Ivanov"));
	}
}
