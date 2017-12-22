package com.hpwenxue.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
/**
 * this class is a security  Configuration; security 配置类 
 * @author allen
 * @website   sousou.io
 * @date 2017年10月14日
 */
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{
	@Override
	protected void configure(HttpSecurity http) throws Exception{
		http.authorizeRequests().antMatchers("/login.html","/index.html","/*","/index","/login").permitAll()
		.antMatchers("/admin/*").hasRole("admin").and()
		.formLogin().loginPage("/login.html").failureUrl("/login-error");
	}
	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception{
		auth.inMemoryAuthentication().withUser("lwl").password("123").roles("admin");
	}
}
