package cn.smallbyte.msoauth2server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MsOauth2ServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsOauth2ServerApplication.class, args);
	}

}
