package com.flipkart.business;

import com.flipkart.bean.Customer;

public interface Inter{
    public void createCustomer();
    public boolean updateCustomer(int customerId);
    public boolean deleteCustomer(int customerId);
    public Customer getCustomer(int customerId);

}
