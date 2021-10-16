package com.king.example_validation.DAO;

import com.king.example_validation.model.People;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PeopleDAO {
    private List<People> peopleList;

    public void addPeople(People people){
        if(peopleList==null){
            peopleList = new ArrayList<>();
        }

        people.setId(peopleList.size()+1);

        peopleList.add(people);
    }

    public List<People> getPeopleList() {
        return peopleList;
    }
}