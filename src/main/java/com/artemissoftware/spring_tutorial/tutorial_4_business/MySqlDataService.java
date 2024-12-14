package com.artemissoftware.spring_tutorial.tutorial_4_business;

import org.springframework.stereotype.Repository;

@Repository
public class MySqlDataService implements DataService{
    @Override
    public int[] retrieveData() {
        return new int[] { 1,2,3,4,5,6,7};
    }
}
