package app;

import configuration.RecordLink;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(RecordLink.class)
public class LinkParserApplication {
    public static void main(String[] args) {
        var ctx = SpringApplication.run(LinkParserApplication.class, args);
        RecordLink config = ctx.getBean(RecordLink.class);
        System.out.println(config);
    }
}