package com.rayyanhunerkar.springlearn.examples.a1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;


@Configuration
@ComponentScan
public class DependencyInjectionLauncher {
    public static void main(String[] args) {
        try (var context =
                     new AnnotationConfigApplicationContext
                             (DependencyInjectionLauncher.class)) {
            System.out.println(context.getBean(YourBusiness.class));
        }
    }
}

@Component
class YourBusiness {
    Dependency1 dependency1;
    Dependency2 dependency2;

    public YourBusiness(Dependency1 dependency1, Dependency2 dependency2) {
        super();
        System.out.println("Dependency1 is set");
        this.dependency1 = dependency1;
        System.out.println("Dependency2 is set");
        this.dependency2 = dependency2;
    }
}

@Component
class Dependency1 {
}

@Component
class Dependency2 {
}
