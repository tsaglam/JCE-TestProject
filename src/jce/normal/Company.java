package jce.normal;

import java.util.List;

/**
 * This is a class for testing purposes of the Java code ecorification.
 */
public class Company {
    private Person ceo;
    private List<Customer> customers;
    private List<Person> employees;

    public Person getCeo() {
        return ceo;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public List<Person> getEmployees() {
        return employees;
    }

    public void setCeo(Person ceo) {
        this.ceo = ceo;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }

    public void setEmployees(List<Person> employees) {
        this.employees = employees;
    }
}
