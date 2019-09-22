package com.arifng.springjunit;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import reactor.core.scheduler.Scheduler;
import reactor.core.scheduler.Schedulers;

import java.util.concurrent.Executors;

@SpringBootApplication
public class SpringJunitApplication {
	@Value("${spring.datasource.maximum-pool-size}")
	private int connectionPoolSize;

	public static void main(String[] args) {
		SpringApplication.run(SpringJunitApplication.class, args);
	}

	@Bean
	public Scheduler scheduler() {
		return Schedulers.fromExecutor(Executors.newFixedThreadPool(connectionPoolSize));
	}
}
