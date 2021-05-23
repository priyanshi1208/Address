package com.bridgelabz.addressbook.controller;
import com.bridgelabz.addressbook.entity.Person;
import com.bridgelabz.addressbook.services.CrudOperationAddress;
import java.util.*;
public class AddressBookInput {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        CrudOperationAddress address=new CrudOperationAddress();
        int x=0;
            System.out.println("Press A to add new Data,  Press E to edit Data,  Press D to Delete Data");
            char options = scanner.next().charAt(0);
            switch (options) {
                case 'A': {
                    System.out.println("Enter name of addressbook");
                    String addressbook_name=scanner.next();
                    System.out.println("Enter First Name");
                    String first_name = scanner.next();
                    System.out.println("Enter Last Name");
                    String last_name = scanner.next();
                    System.out.println("Enter City");
                    String city = scanner.next();
                    System.out.println("Enter State");
                    String state = scanner.next();
                    System.out.println("Enter Email");
                    String email = scanner.next();
                    System.out.println("Enter Zip Code");
                    String zip = scanner.next();
                    System.out.println("Enter Phone Number");
                    String phone_number = scanner.next();
                    address.addContact(new Person(first_name, last_name, city, state, email, zip, phone_number));
                    address.show();
//                    System.out.println("Press 1 to continue , Press 0 to exit");
//                    x=scanner.nextInt();
                    break;
                }

                case 'D': {
                    System.out.println("Enter the Row you want to delete");
                    int list_no=scanner.nextInt();
                    address.deleteContact(list_no);
//                    System.out.println("Press 1 to continue , Press 0 to exit");
//                    x=scanner.nextInt();
                    break;
                }
                case 'E': {
                    address.show();
                    System.out.println("Press S.no of the list you want to edit");
                    int list_No=scanner.nextInt();
                    System.out.println("Press the column number you want to edit");
                    int column_N0=scanner.nextInt();
                    System.out.println("Enter the new detail");
                    String edited_Detail= scanner.next();
                    address.editContact(list_No,column_N0,edited_Detail);
//                    System.out.println("Press 1 to continue , Press 0 to exit");
//                    x=scanner.nextInt();
                    break;
                }
            }

    }

}

