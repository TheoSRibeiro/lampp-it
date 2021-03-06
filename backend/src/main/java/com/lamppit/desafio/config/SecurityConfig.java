package com.lamppit.desafio.config;

import java.util.Arrays;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;


@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter{
	


    private static final String[] PUBLIC_MATCHERS_GET = {
        "/projetos/**"
    };

    private static final String[] PUBLIC_MATCHERS_POST = {
        "/projetos/**"
    };
    
    private static final String[] PUBLIC_MATCHERS_DELETE = {
            "/projetos/**"
        };

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        
        http.headers().frameOptions().disable();
        

        http.cors().and().csrf().disable(); //desabilitar a secao do usuario
        http.authorizeRequests()
            .antMatchers(HttpMethod.POST, PUBLIC_MATCHERS_POST).permitAll()
            .antMatchers(HttpMethod.GET, PUBLIC_MATCHERS_GET).permitAll()
            .antMatchers(HttpMethod.DELETE, PUBLIC_MATCHERS_DELETE).permitAll()
            .anyRequest().authenticated();
    }

    @Bean
    CorsConfigurationSource corsConfigurationSource(){
        
        CorsConfiguration configuration = new CorsConfiguration().applyPermitDefaultValues();
        configuration.setAllowedMethods(Arrays.asList("POST", "GET", "PUT", "DELETE", "OPTIONS"));
        final UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", configuration);
        return source;
    }
    
    
}
