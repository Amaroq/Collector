package com.nikepulow.collector;

import org.springframework.boot.SpringApplication;

public class TestCollectorApplication {

	public static void main(String[] args) {
		SpringApplication.from(CollectorApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
