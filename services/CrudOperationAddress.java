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

    @Override
    public void deleteContact(int list_no) {
        if(Objects.isNull(person))
            System.out.println("No Address to delete");
        else {
            personList.get(list_no);
            System.gc();
            System.runFinalization();
            System.out.println("Data Deleted");
            show();
        }
    }
    @Override
    public void show() {
        int count=0;
        if(Objects.isNull(person))
            System.out.println("No Contacts to Display");
        else {
            for ( Person person:personList) {
                System.out.print((++count)+" ");
                person.getFirst_name();
                person.getLast_name();
                person.getCity();
                person.getState();
                person.getEmail();
                person.getZip();
                person.getPhone_number();
                System.out.println();
            }
        }
    }
}


