package com.flipkart.client;

import com.flipkart.business.CustomerBusiness;

public class CustomerClientApp {
    public static void main(String[] args) {
        CustomerBusiness service = new CustomerBusiness();
        service.createCustomer();
        System.out.println("update customer " +service.updateCustomer(1001));
    }
}