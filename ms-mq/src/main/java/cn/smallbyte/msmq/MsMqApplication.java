package cn.smallbyte.msmq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MsMqApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsMqApplication.class, args);
	}

}
