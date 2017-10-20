package server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import youtube.YoutubeConfiguration;

@SpringBootApplication()
@ComponentScan(basePackages = {"./controller"})
@Import(YoutubeConfiguration.class)
public class Application {

        public static void main(String[] args)
        {
            SpringApplication.run(Application.class, args);
        }
    }
