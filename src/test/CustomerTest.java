package test;

import domain.Customer;

public class CustomerTest {

    public static void main(String args[]) {
        Customer myCustomer = new Customer();
        myCustomer.setID(15);
        myCustomer.setIsNew(true);
        myCustomer.setTotal(45);
    }
}
