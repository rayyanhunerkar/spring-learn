package com.rayyanhunerkar.springlearn.examples.c1;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MongoDBDataService implements DataService {
    @Override
    public int[] retrieveAllData() {
        return new int[]{11, 22, 33, 44, 55};
    }
}