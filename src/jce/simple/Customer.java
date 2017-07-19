package jce.simple;

import java.util.Date;

/**
 * This is a class for testing purposes of the Java code ecorification.
 */
public class Customer extends Person implements BusinessPerson {
    private int customerID;

    @Override
    public void generateReport(Date day) {
        System.out.println(day + ": Customer " + getFullName() + " has the ID " + customerID);
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setFirstName("John");
        customer.setLastName("Doe");
        customer.setCustomerID(123456789);
        customer.generateReport(new Date());
    }
}
