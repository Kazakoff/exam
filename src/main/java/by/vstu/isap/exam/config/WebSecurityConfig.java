package by.vstu.isap.exam.config;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@EnableGlobalMethodSecurity(prePostEnabled = true)
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity http) {
 try {
	http
	 .httpBasic()
	 .and()
	 .authorizeRequests()
	 .antMatchers("/api/group/**", "/api/student/**")
	 .permitAll()
	 .and()
	 .csrf().disable();
} catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	}
	
	
	@Bean
	public UserDetailsService userDetailsService() {
		InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
						manager.createUser(User.withUsername("user").password("password").roles(
"ADMIN").build());
		return manager;
	}

}