package cn.smallbyte.ekcenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EkCenterApplication {

	public static void main(String[] args) {
		SpringApplication.run(EkCenterApplication.class, args);
	}

}
