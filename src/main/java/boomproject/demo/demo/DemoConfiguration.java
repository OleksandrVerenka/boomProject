package boomproject.demo.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DemoConfiguration {

    @Value("${isDev}")
    private boolean isDev;


    @Bean
    public Logger logger() {
        if(isDev) {
            return new ConsoleLoggerImpl();
        } else {
            return new ClassicLoggerImpl();
        }
    }
}
