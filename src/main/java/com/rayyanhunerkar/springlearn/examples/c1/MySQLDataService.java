package com.rayyanhunerkar.springlearn.examples.c1;

import org.springframework.stereotype.Component;

@Component
public class MySQLDataService implements DataService {
    @Override
    public int[] retrieveAllData() {
        return new int[]{1, 2, 3, 4, 5};
    }
}
