package net.safae.springmvc.security;

import org.springframework.context.annotation.*;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.*;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfig {

    @Bean // Hashage
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    //@Bean
    public UserDetailsService userDetailsService() {
        return new UserDetailsService() {
            @Override
            public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
                return null;
            }
        };
    }

    @Bean
    public InMemoryUserDetailsManager userDetailsManager() {
        PasswordEncoder encoder = passwordEncoder();
        return new InMemoryUserDetailsManager(
        User.withUsername("safae").password(encoder.encode("1234")).roles("USER").build(),
        User.withUsername("user").password(encoder.encode("1234")).roles("USER").build(),
        User.withUsername("admin").password(encoder.encode("1234")).roles("USER", "ADMIN").build());
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        return http
                .formLogin(fl->fl.loginPage("/login").permitAll())
                //.csrf(csrf->csrf.disable()) // -> Pour l'authentification Stateless, car on utilise un Local Storage et pas des Cookies.
                // Sans csrf : On aura une faille csrf, donc on risque de supprimer par exemple un utilisateur
                // avec la session de l'admin sans le savoir, en recevant un mail ayant cette action.
                .csrf(Customizer.withDefaults())
                //.authorizeHttpRequests(ar->ar.requestMatchers("/user/**").hasRole("USER"))
                //.authorizeHttpRequests(ar->ar.requestMatchers("/admin/**").hasRole("ADMIN"))
                //.authorizeHttpRequests(ar->ar.anyRequest().permitAll())
                .authorizeHttpRequests(ar->ar.requestMatchers("/public/**", "/webjars/**", "/css/**")
                        .permitAll())
                .authorizeHttpRequests(ar->ar.anyRequest().authenticated())
                .exceptionHandling(eh->eh.accessDeniedPage("/notAuthorized"))
                .build();
    }
}

// TO CHECK : h2 db, any keyword issues, templates in markdown for GitHub ReadMe
