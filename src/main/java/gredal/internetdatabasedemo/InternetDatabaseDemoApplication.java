package gredal.internetdatabasedemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InternetDatabaseDemoApplication {

    public static SpringApplication springApplication;

    public static void main(String[] args) {
        springApplication = new SpringApplication(InternetDatabaseDemoApplication.class);
        springApplication.run(args);
    }
}
