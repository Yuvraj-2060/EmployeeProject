package com.MultiThreading.Basics.ThreadSynchronization;

class Bank_Account {
    private double balance;

    public Bank_Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public synchronized void deposit(double amount) {
        System.out.println("Depositing " + amount + "₹");

        double newBalance = balance + amount;
        try {
            Thread.sleep(100);
        } catch (InterruptedException ex) {
            System.err.println(ex.getMessage());
        }
        balance = newBalance;
        System.out.println("Balance after depositing : " + balance + "₹");
    }

    public synchronized void withdraw(double amount) {
        System.out.println("Withdrawing " + amount + "₹");

        if(amount > balance) {
            System.out.println("Insufficient Balance. Please deposit first");
            try {
                wait(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        if(amount > balance) {
            System.out.println("Still Insufficient Balance. Try again later");
            return;
        }
        double newBalance = balance - amount;
        try {
            Thread.sleep(100);
        } catch (InterruptedException ex) {
            System.err.println(ex.getMessage());
        }
        System.out.println("Withdrawn " + amount + "₹");
        balance = newBalance;
        System.out.println("Balance after withdrawing : " + balance + "₹");
    }
}

public class ThreadSynchronizationBy_Runnable {
    public static void main(String[] args) {
        Bank_Account account = new Bank_Account(0);

        // lambda expressions for implementing Runnable interface
        Runnable withdrawRunnable = () -> account.withdraw(5000);
        Runnable runnable1 = () -> account.deposit(5000);
        Runnable runnable2 = () -> account.deposit(2000);

        Thread withdrawThread = new Thread(withdrawRunnable);
        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);

        withdrawThread.start();
        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
            withdrawThread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Final Account Balance : " + account.getBalance());
    }
}

