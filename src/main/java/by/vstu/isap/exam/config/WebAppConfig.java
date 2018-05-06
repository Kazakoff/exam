package by.vstu.isap.exam.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@EnableWebMvc
@ImportResource("classpath:spring-jpa.xml")
// 66
@ComponentScan("by.vstu.isap.exam")
public class WebAppConfig extends WebMvcConfigurerAdapter {

}
