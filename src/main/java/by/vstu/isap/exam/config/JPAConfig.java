package by.vstu.isap.exam.config;

import javax.sql.DataSource;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@Configuration
@EnableJpaRepositories("by.vstu.isap.exam.repository")
	@EnableTransactionManagement
	@PropertySource("classpath:db.properties")
	
public class JPAConfig {

	    @Value("${driver}") String driverClassName;
	    @Value("${url}") String url;
	    @Value("${user}") String username;
	    @Value("${pass}") String password;
	    
	    @Bean(name = "dataSource")
	    public DataSource getDataSource() {
	        DriverManagerDataSource dataSource = new DriverManagerDataSource();

	        dataSource.setDriverClassName(driverClassName);
	        dataSource.setUrl(url);
	        dataSource.setUsername(username);
	        dataSource.setPassword(password);
	        return dataSource;
	    }
	    
	    @Bean (name = "entityManagerFactory")
	    public LocalContainerEntityManagerFactoryBean getEntityManagerFactoryBean()
	    {
	    	LocalContainerEntityManagerFactoryBean emfb = new LocalContainerEntityManagerFactoryBean();
	    	emfb.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
	    	emfb.setDataSource(getDataSource()); 
	    	emfb.setPackagesToScan("by.vstu.isap.exam.entity" );
	    	return emfb;
	    }
	    
	    @Bean (name = "transactionManager")
	    public JpaTransactionManager getJpaTransactionManager()
	    {
	    	return new JpaTransactionManager();
	    }
	    
	    
	}