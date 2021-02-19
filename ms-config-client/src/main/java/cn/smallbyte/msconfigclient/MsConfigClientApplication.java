package cn.smallbyte.msconfigclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MsConfigClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsConfigClientApplication.class, args);
	}

}
