package es.abelfgdeveloper.managements;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@EnableEurekaClient
@ComponentScan("com.abelfgdeveloper")
@SpringBootApplication
public class ManagementsServiceApplication {

  public static void main(String[] args) {
    SpringApplication.run(ManagementsServiceApplication.class, args);
  }
}
