package com.class2;

import com.class2.model.Customer;

public class Main {
    public static void main(String[] args) {
        CustomerController customerController = new CustomerController();
        try {
           customerController.getAll();

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
