package cn.smallbyte.msoauth2jwtserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MsOauth2JwtServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsOauth2JwtServerApplication.class, args);
	}

}
