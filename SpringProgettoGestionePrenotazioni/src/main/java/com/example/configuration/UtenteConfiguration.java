package com.example.configuration;

import java.util.Locale;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.github.javafaker.Faker;
import com.example.model.User;

@Configuration
public class UtenteConfiguration {

	@Bean
	@Scope("prototype")
	public User faker() {
		Faker fake= Faker.instance(new Locale("it-IT"));
		User fakeUser=new User();
		fakeUser.setNome(fake.name().firstName());
		fakeUser.setCognome(fake.name().lastName());
		fakeUser.setUsername(fakeUser.getNome().toLowerCase()+"."+fakeUser.getCognome().toLowerCase());
		fakeUser.setEmail(fakeUser.getUsername()+"@icloud.com");
		return fakeUser;
	}
}