package spring.cloud.config.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class Application {
    static {
        System.setProperty("spring.application.name", "config-server");

        System.setProperty("mybatis.config-location", "classpath:mybatis.xml");
        System.setProperty("mybatis.mapper-locations", "classpath:mybatis/**/*.xml");
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}