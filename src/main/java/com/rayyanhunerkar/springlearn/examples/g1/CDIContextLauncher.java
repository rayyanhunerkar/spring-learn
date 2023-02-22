package com.rayyanhunerkar.springlearn.examples.g1;

import jakarta.inject.Inject;
import jakarta.inject.Named;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

//@Component
@Named
class BusinessService {
    DataService dataService;

//    @Autowired
    @Inject
    public void setDataService(DataService dataService) {
        System.out.println("Setter injection");
        this.dataService = dataService;
    }

    public DataService getDataService() {
        System.out.println("Getting data service");
        return dataService;
    }

}

//@Component
@Named
class DataService {

}


@Configuration
@ComponentScan
public class CDIContextLauncher {

    public static void main(String[] args) {

        try (var context =
                     new AnnotationConfigApplicationContext
                             (CDIContextLauncher.class)) {
            Arrays.stream(context.getBeanDefinitionNames())
                    .forEach(System.out::println);

            System.out.println(context.getBean(BusinessService.class).getDataService());
        }
    }
}
