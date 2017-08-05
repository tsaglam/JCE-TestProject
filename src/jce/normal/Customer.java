package jce.normal;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * This is a class for testing purposes of the Java code ecorification.
 */
public class Customer extends Person implements BusinessPerson {
    private int customerID;
    private List<Integer> orders;

    @Override
    public void generateReport(Date day) {
        System.out.println("Customer " + getFullName() + " with ID " + customerID);
        if (orders != null) {
            System.out.println("has " + orders.size() + " orders (on " + day + "):");
            for (Integer orderID : orders) {
                System.out.println("   order " + orderID);
            }
        }

    }

    public int getCustomerID() {
        return customerID;
    }

    public List<Integer> getOrders() {
        return orders;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public void setOrders(List<Integer> orders) {
        this.orders = orders;
    }

    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setFirstName("John");
        customer.setLastName("Doe");
        customer.setCustomerID(123456789);
        List<Integer> orders = Arrays.asList(new Integer[] { 1234, 4567, 7890 });
        customer.setOrders(orders);
        customer.generateReport(new Date());
        System.out.println(customer.getInitials());
    }
}
