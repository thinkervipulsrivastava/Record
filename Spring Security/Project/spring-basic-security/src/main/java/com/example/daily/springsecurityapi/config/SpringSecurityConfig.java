package com.example.daily.springsecurityapi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;

@Configuration
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {


    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication().withUser("Vipul").password("password").roles("ADMIN");
        auth.inMemoryAuthentication().withUser("Srivastava").password("passoword").roles("USER");
    }

    // security for ALL API
 /*   @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable();
        http.authorizeRequests().anyRequest().fullyAuthenticated().and().httpBasic();
    }*/

    // security based on url


/*    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests().antMatchers("/rest/**").fullyAuthenticated().and().httpBasic();
    }*/

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests().antMatchers("/rest/**").hasAnyRole("ADMIN").anyRequest().fullyAuthenticated().and().httpBasic();
    }

    @Bean
    public static NoOpPasswordEncoder passwordEncoder () {
        return (NoOpPasswordEncoder) NoOpPasswordEncoder.getInstance();
    }
}
