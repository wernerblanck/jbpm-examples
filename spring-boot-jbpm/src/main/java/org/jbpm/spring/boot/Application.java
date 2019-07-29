package org.jbpm.spring.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ComponentScan
@EnableAutoConfiguration(exclude = HibernateJpaAutoConfiguration.class)
@ImportResource(value = {"classpath:config/jee-tx-context.xml",
    "classpath:config/jpa-context.xml", "classpath:config/jbpm-context.xml", "classpath:config/security-context.xml",})
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
