package com.iag1.businessDelegate;

public class EJBService implements BusinessService {

    public void doProcessing() {
        System.out.println("Processing task by invoking EJB Service");
    }
}