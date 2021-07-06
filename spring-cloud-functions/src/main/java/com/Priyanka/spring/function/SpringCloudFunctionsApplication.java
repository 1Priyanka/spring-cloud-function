package com.Priyanka.spring.function;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

@SpringBootApplication
public class SpringCloudFunctionsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudFunctionsApplication.class, args);
	}

//	Bean annotation using to call for anywhere to use this function

	@Bean
	public Function<String,String>toUpperCase(){
		return (value) -> new StringBuilder(value).toString().toUpperCase();
	}
	public Supplier<String> getMessage(){
		return () -> "Welcome to cloud function learned tutorial";

	}
	public Consumer<String> writeMessage(){
		return (value) -> System.out.println(value);
	}
}
