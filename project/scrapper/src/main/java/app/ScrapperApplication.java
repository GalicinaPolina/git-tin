package app;

import configuration.RecordScrapper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@EnableConfigurationProperties(RecordScrapper.class)
public class ScrapperApplication {
public static void main(String[] args) {
        var ctx = SpringApplication.run(ScrapperApplication.class, args);
        RecordScrapper config = ctx.getBean(RecordScrapper.class);
        System.out.println(config);
        }
        }

