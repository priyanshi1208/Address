package com.bridgelabz.addressbook.services;

import com.bridgelabz.addressbook.entity.Person;
import java.util.*;
public class CrudOperationAddress implements ICrudOperation {
    Person person=null;
    List<Person> personList=new ArrayList<>();
    @Override
    public void addContact( Person person) {
        this.person=person;
        personList.add(person);
    }


}


