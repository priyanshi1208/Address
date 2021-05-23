package com.bridgelabz.addressbook.services;

import com.bridgelabz.addressbook.entity.Person;

public interface ICrudOperation {
    void addContact(Person person);
    void deleteContact(int list_no);
    void show();
}


