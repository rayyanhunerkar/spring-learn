package com.rayyanhunerkar.springlearn.examples.d1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Configuration
@ComponentScan
public class LazyInitializerSpringContextLauncher {

    public static void main(String[] args) {

        try (var context =
                     new AnnotationConfigApplicationContext
                             (LazyInitializerSpringContextLauncher.class)) {
            context.getBean(classB.class).doSomething();
        }
    }
}

@Component
class classA {
}

@Component
@Lazy
class classB {
    private final classA classA;

    public classB(classA classA) {
        System.out.println("classA is set");
        this.classA = classA;
    }

    public void doSomething() {
        System.out.println("classB is doing something");
    }
}
