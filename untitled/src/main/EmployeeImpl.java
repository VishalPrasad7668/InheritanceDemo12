package main;

import data.Address;
import data.Employee;

public class EmployeeImpl {
    public static void main(String[] args) {
        Address address = new Address(410,"kolar Road","Bhopal","India",462021);
        Employee obj = new Employee("Vaibhav","05-11-1983",38,address);
        obj.display();
        //set address - we have to call the constructor of address class
        Address updateAddress = new Address(510,"Kolar Road", "Bhopal","India",462021);
        obj.setAddress(updateAddress);
        System.out.println("employee Display");
        obj.display();
        //to only update the house no, what should we do?
        //get the address
        // using that reference
        //using that reference update house number
        Address currentAddress = obj.getAddress();
    }
}
