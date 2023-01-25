package test;

import domain.Customer;

public class CustomerTest {

    public static void main(String args[]) {
        Customer myCustomer = new Customer();
        myCustomer.setID(0);
        myCustomer.setIsNew(false);
        myCustomer.setTotal(0);
        myCustomer.displayCustomerInfo();
    }
}
