package config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

import com.example.demo.Laptop;
import com.javaa.Alien;
import com.javaa.Computer;
import com.javaa.Desktop;

@Configuration
@ComponentScan("com.javaa")
public class AppConfig {

//	@Bean
//	public Alien alien(Computer com) {  // @Qualifier("desktop") 
//		Alien obj = new Alien();
//		obj.setAge(25);
//		obj.setCom(com);
//		return obj;
//	}
//
//	// @Bean(name= {"desktop1","desk","Machine"})
//	// @Scope("prototype")
//	@Bean
//	public Desktop desktop() {
//		return new Desktop();
//	}
//
//	@Bean
//	@Primary
//	public Laptop laptop() {
//		return new Laptop();
//	}
}
