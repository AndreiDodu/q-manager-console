package com.andreidodu.qm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class QuestionnaireManagerApplication implements CommandLineRunner {

	@Autowired
	private CommandProcessor commandProcessor;

	public static void main(String[] args) {
		SpringApplication.run(QuestionnaireManagerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		this.commandProcessor.run();
	}

}
