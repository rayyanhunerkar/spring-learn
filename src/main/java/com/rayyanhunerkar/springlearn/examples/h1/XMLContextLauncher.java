package com.rayyanhunerkar.springlearn.examples.h1;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

@Configuration
@ComponentScan
public class XMLContextLauncher {

    public static void main(String[] args) {

        try (var context =
                     new ClassPathXmlApplicationContext
                             ("contextConfiguration.xml")) {
            Arrays.stream(context.getBeanDefinitionNames())
                    .forEach(System.out::println);
        }
    }
}
