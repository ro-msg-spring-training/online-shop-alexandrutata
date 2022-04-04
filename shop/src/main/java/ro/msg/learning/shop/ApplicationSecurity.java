package ro.msg.learning.shop;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class ApplicationSecurity extends WebSecurityConfigurerAdapter {
    // @Override
    // public void configure(WebSecurity web) throws Exception {
    // web.ignoring().antMatchers("/**");
    // }

    // @Override
    // public void configure(WebSecurity web) throws Exception {
    //     web.ignoring()
    //             // Spring Security should completely ignore URLs starting with /resources/
    //             .antMatchers("/resources/**");
    // }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/test/**").hasRole("USER")
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
            .withUser("user").password("{noop}password").roles("USER")
                .and()
            .withUser("admin").password("{noop}password").roles("USER", "ADMIN");
    }

}