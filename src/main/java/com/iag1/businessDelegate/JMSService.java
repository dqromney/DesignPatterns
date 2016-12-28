package com.iag1.businessDelegate;

public class JMSService implements BusinessService {

    public void doProcessing() {
        System.out.println("Processing task by invoking JMS Service");
    }
}