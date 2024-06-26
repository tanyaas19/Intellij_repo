package com.flipkart.business;

import com.flipkart.bean.Customer;

import java.util.List;

public class CustomerBusiness implements Inter{
    List<Customer> customers;
    public void createCustomer() {
        Customer customer = new Customer();
        customers.add(customer);
        System.out.println("First customer");
    }
    public boolean updateCustomer(int customerId) {
        System.out.println("Customer updated by id -> " + customerId);
        return true;
    }
    public boolean deleteCustomer(int customerId) {
        System.out.println("Customer deleted by id -> " + customerId);
        return true;
    }
    public Customer getCustomer(int customerId) {
        System.out.println("Customer retrieved by id -> " + customerId);
        for(Customer customer:customers){
            if(customer.getCustomerId() == customerId){return customer;}
        }

    }
}