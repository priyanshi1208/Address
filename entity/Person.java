package com.bridgelabz.addressbook.entity;

public class Person {
    private String first_name,last_name,city,state,email;
    private String zip;
    private String phone_number;


    public Person( String first_name, String last_name, String city, String state, String email, String zip, String phone_number) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.city = city;
        this.state = state;
        this.email = email;
        this.zip = zip;
        this.phone_number = phone_number;
    }

    public void getFirst_name() {
        System.out.print("Column 1 First Name:"+first_name+" ");
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public void getLast_name() {
        System.out.print("Column 2 Last Name:"+last_name+" ");
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public void getCity() {
        System.out.print("Column 3 City:"+city+" ");
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void getState() { System.out.print("Column 4 State:"+state+" "); }

    public void setState(String state) {
        this.state = state;
    }

    public void getEmail() {
        System.out.print("Column 5 Email:"+email+" ");
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void getZip() {
        System.out.print("Column 6 Zip:"+zip+" ");
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public void getPhone_number() {
        System.out.print("Column 7 Phone Number:"+phone_number+" ");
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }
}
