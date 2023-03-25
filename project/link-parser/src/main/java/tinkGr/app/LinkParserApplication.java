package tinkGr.app;

import configuration.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(RecordBot.class)
public class LinkParserApplication {
    public static void main(String[] args) {
        var ctx = SpringApplication.run(LinkParserApplication.class, args);
        RecordBot config = ctx.getBean(RecordBot.class);
        System.out.println(config);
    }
}