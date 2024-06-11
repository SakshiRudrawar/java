package com.sakshi.demo;

public class Bank extends Thread 
{
    static int bal = 5000;
    int withdraw;

    Bank(int withdraw) 
    {
        this.withdraw = withdraw;
    }

    public static synchronized void Withdraw(int withdraw) {
        String name = Thread.currentThread().getName();

        if (withdraw <= bal) {
            System.out.println(name + " withdraw money..");
            bal = bal - withdraw;
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public void run() {
        Withdraw(withdraw); // static method hai to directly call karenge
    }
}












