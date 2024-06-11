package com.sakshi.demo;

public class Customer {

    public static void main(String[] args) {
        Bank obj = new Bank(5000); // obj has one lock ---- customer want to withdraw 5000rs so we are passing here

        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obj);

        t1.setName("Raju");
        t2.setName("Sunita");

        Bank obj2 = new Bank(5000); //obj 2 has 1 lock

        Thread t3 = new Thread(obj2);
        Thread t4 = new Thread(obj2);

        t3.setName("Rahul");
        t4.setName("Anita");

        t1.start();
        t2.start();
        t3.start();
        t4.start();

    }
}