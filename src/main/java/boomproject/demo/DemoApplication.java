package boomproject.demo;

import boomproject.demo.demo.DemoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Import;

@Import(DemoConfiguration.class)
@SpringBootApplication
public class DemoApplication {
    private static ApplicationContext applicationContext;
    public static void main(String[] args) {
        applicationContext = SpringApplication.run(DemoApplication.class, args);
        String[] allBeanNames = DemoApplication.applicationContext.getBeanDefinitionNames();
        Object demoTestService = DemoApplication.applicationContext.getBean("demoTestService");
        System.out.println(demoTestService);
        for (String beanName : allBeanNames) {
            System.out.println(beanName);
        }
    }
}
