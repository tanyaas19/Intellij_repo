package com.flipkart.bean;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Customer {
    private int customerId;
    private String customerName;
    private String customerAddress;
    private int phoneNumber;

}