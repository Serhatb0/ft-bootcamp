package com.biricik.ftBootcamp.config;

import java.util.Locale;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import com.github.javafaker.Faker;

@Component
public class FakerConfig {

	@Bean
	public Faker getFaker() {
		return new Faker(new Locale("tr-TR"));
	}
}
