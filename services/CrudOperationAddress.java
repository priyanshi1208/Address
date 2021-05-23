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

    @Override
    public void editContact(int list_No,int column_No,String edited_Detail) {
        System.out.println(edited_Detail);
        System.out.println(list_No);
        System.out.println(column_No);
        if(Objects.isNull(person)){
            System.out.println("No address to edit");
        }
        else{
            switch(column_No)
            {
                case 1:{
                    personList.get(list_No-1).setFirst_name(edited_Detail);
                    break;
                }
                case 2:{
                    personList.get(list_No-1).setLast_name(edited_Detail);
                    break;
                }
                case 3:{
                    personList.get(list_No-1).setCity(edited_Detail);
                    break;
                }
                case 4:{
                    personList.get(list_No-1).setEmail(edited_Detail);
                    break;
                }
                case 5:{
                    personList.get(list_No-1).setState(edited_Detail);
                    break;
                }
                case 6:{
                    personList.get(list_No-1).setZip(edited_Detail);
                    break;
                }
                case 7:{
                    personList.get(list_No-1).setPhone_number(edited_Detail);
                    break;
                }
                default:{
                    System.out.println("do nothing");
                }
            }
        }
        show();
    }
}


