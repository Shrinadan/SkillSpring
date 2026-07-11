package com.shri.config;

import java.net.http.HttpRequest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@EnableWebSecurity
@Configuration
public class SecurityConfig {

	@Bean
	public UserDetailsService userDetailsService(){

	UserDetails admin = User
	.withUsername("shri")
	.password("{noop}1234")
	.roles("ADMIN")
	.build();

	UserDetails user = User
	.withUsername("ram")
	.password("{noop}1111")
	.roles("USER")
	.build();

	return new InMemoryUserDetailsManager(admin, user);

	}
	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

	http
	.authorizeHttpRequests(auth -> auth
	.requestMatchers("/hii").hasRole("ADMIN")
	.requestMatchers("/no").hasRole("USER")
	.anyRequest().authenticated()
	)
	.httpBasic(Customizer.withDefaults());

	return http.build();

	}
		
		
		
	}

