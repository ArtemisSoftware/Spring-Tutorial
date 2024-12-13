package com.artemissoftware.spring_tutorial.tutorial_4_business;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MongoDbDataService implements DataService {
    @Override
    public int[] retrieveData() {
        return new int[] { 11,12,23,34,75,66,57};
    }
}
