package com.rayyanhunerkar.springlearn.examples.f1;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Configuration
@ComponentScan
public class PrePostAnnotationsContextLauncher {
    public static void main(String[] args) {

        try (var context =
                     new AnnotationConfigApplicationContext
                             (PrePostAnnotationsContextLauncher.class)) {
            Arrays.stream(context.getBeanDefinitionNames())
                    .forEach(System.out::println);
        }
    }
}


@Component
class SomeClass {
    private final SomeDependency someDependency;

    public SomeClass(SomeDependency someDependency) {
        super();
        this.someDependency = someDependency;
        System.out.println("SomeClass is created");
    }

    @PostConstruct
    public void initialize() {
        someDependency.getReady();
    }

    @PreDestroy
    public void cleanup() {
        someDependency.cleanup();
    }

}


@Component
class SomeDependency {
    public void getReady() {
        System.out.println("SomeDependency is ready");
    }

    public void cleanup() {
        System.out.println("SomeDependency is cleaned up");
    }
}
