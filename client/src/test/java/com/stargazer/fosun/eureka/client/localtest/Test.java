package com.stargazer.fosun.eureka.client.localtest;

public class Test implements ClsA {
    @Override
    public String getName() {
        return null;
    }

    public static void main(String[] args) {
        Test a = new Test();
        if(a instanceof ClsB){
            System.out.println("is instance of ClsB");
        }else if(a instanceof BeanFactory){
            System.out.println("is instance of BeanFactory");

        }
    }
}
