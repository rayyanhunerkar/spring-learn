package com.rayyanhunerkar.springlearn.examples.c1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class BusinessRealWorldSpringContextApplication {

    public static void main(String[] args) {

        try (var context =
                     new AnnotationConfigApplicationContext
                             (BusinessRealWorldSpringContextApplication.class)) {

            System.out.println(context.getBean(BusinessCalculationService.class).findMax());
        }
    }
}
