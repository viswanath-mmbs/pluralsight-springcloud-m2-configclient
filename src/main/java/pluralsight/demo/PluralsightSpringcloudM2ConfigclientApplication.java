package pluralsight.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class PluralsightSpringcloudM2ConfigclientApplication {

	public static void main(String[] args) {
		SpringApplication.run(PluralsightSpringcloudM2ConfigclientApplication.class, args);
	}

}
