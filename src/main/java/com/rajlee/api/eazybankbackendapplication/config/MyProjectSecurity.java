package com.rajlee.api.eazybankbackendapplication.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class MyProjectSecurity {

    // This method is just for custom configuration , with only one user form application properties
    @Bean
    SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests()
                .requestMatchers("/myAccount","/myBalance","/myCards","/myLoans").authenticated()
                .requestMatchers("/contact","/notices").permitAll()
                .and().formLogin()
                .and().httpBasic();
                return http.build();
    }

    // Approach 1 :This method is implemented for multiple users is there , this is not for production environment
//    @Bean
//    InMemoryUserDetailsManager userDetailsService(){
//        UserDetails admin = User.withDefaultPasswordEncoder()
//                .username("priyanshu")
//                .password("prishu")
//                .authorities("admin")
//                .build();
//        UserDetails user = User.withDefaultPasswordEncoder()
//                .username("sonali")
//                .password("12345")
//                .authorities("read")
//                .build();
//        return new InMemoryUserDetailsManager(admin,user);
//    }

    //Approach2 : similarly for above bean there is another method to write
    @Bean
    InMemoryUserDetailsManager userDetailsService(){
        UserDetails admin = User.withUsername("priyanshu").password("prishu").authorities("admin").build();
        UserDetails user = User.withUsername("sonali").password("12345").authorities("read").build();
        return new InMemoryUserDetailsManager(admin,user);
    }

    @Bean
    public PasswordEncoder passwordEncoder(){
        return NoOpPasswordEncoder.getInstance();
    }
}
