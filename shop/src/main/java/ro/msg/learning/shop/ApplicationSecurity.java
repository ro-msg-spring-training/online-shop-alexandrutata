package ro.msg.learning.shop;

import org.apache.tomcat.util.security.MD5Encoder;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.Md4PasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class ApplicationSecurity extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/test/**").authenticated()
                //.antMatchers("/suppliers/**").authenticated()
                .antMatchers("/", "/**").permitAll()
            .and()
                .formLogin()
            .and()
                .csrf().disable()
                .headers().frameOptions().disable();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        // enable in memory based authentication with a user named "user" and "admin"
        auth.inMemoryAuthentication()
            //this is actually password
            .withUser("user").password("{bcrypt}$2a$12$0EeWhZy1/31EI.B1lta6lO.equHb.L0SEUYs2ry7FjfYPwLwaHGqy").roles("USER")
                .and()
            .withUser("admin").password("{noop}password").roles("USER", "ADMIN");
    }

}