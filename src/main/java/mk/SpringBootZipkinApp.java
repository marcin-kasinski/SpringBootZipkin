package mk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import zipkin.server.EnableZipkinServer;


@SpringBootApplication
@EnableZipkinServer
public class SpringBootZipkinApp {
	public static void main(String[] args) {
		SpringApplication.run(SpringBootZipkinApp.class, args);
		}
	

	
	
}
