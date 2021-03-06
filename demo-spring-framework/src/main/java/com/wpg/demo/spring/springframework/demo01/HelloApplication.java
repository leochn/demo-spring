package com.wpg.demo.spring.springframework.demo01;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author ChangWei Li
 * @version 2017-08-25 09:25
 */
@Configuration
@ComponentScan
@Slf4j
class HelloApplication {

    public static void main(String[] args) throws InterruptedException {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(HelloApplication.class);

        log.debug("Springframework container refresh successfully !");

        MessagePrinter messagePrinter = applicationContext.getBean(MessagePrinter.class);
        messagePrinter.printMessage();

        log.debug("Springframework container destroy successfully !");
    }

}
