package com.kitvision.workflow.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.kitvision.workflow.service.UserService;
/**
 * 
 * @author mohamed
 *  
 * This class hold all the security configuration of the application
 */
@EnableWebSecurity
@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter{

	/**
	 * @ the user service feild that will get autowired by spring DI
	 */
	@Autowired
	private UserService userService;
	/**
	 * 
	 * This function override the WebSecurityConfigurerAdapter function,
	 *  and hold the access configuration for each url and login page configuration.
	 *  
	 * @param HttpSecurity 
	 * @exception Exception
	 */
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
			.authorizeRequests()
			.antMatchers("/registration").permitAll()
			.anyRequest().authenticated()
			.and()
			.formLogin();
	}
	/**
	 * 
	 * This function manage how user should be authenticated and passwordEncoder.
	 * Note the user will be authenticated throw userDetailsService .
	 * 
	 * 
	 * @param AuthenticationManagerBuilder 
	 * @exception Exception
	 */
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(userService)
		.passwordEncoder(passwordEncoder());
	}
	/**
	 * How the passwored should be encoder.
	 * BCrypt spring provides.
	 * 
	 * @return PasswordEncoder
	 */
	@Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
