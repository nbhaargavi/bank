package org.example;

import java.util.logging.Level;
import java.util.logging.*;

class Account {
    Logger l=Logger.getLogger("kitty");
    private String accntholdername;
    private int id;
    private double balance;
    
    Account(String accntname, int newid, double newbalance) {
        accntholdername = accntname;
        id = newid;
        balance = newbalance;
    }

    public double getBalance() {
        return balance;
    }

    public double withdraw(int amount)
    {
        if (amount > balance) {
        l.info("u dont have enough money to withdraw");
        }
        else {
           balance = balance - amount;
        return balance;
        }
        return amount;
    }

    double deposit(int amount) {
         balance = balance + amount;
        return balance;
    }

    public static void main(String[] args) {
        Logger l=Logger.getLogger("kitty");

        Account account1 = new Account("bhaargavi", 1122, 20000);
        l.log(Level.INFO,() ->"Account Holder name:" + " " + account1.accntholdername);
        l.log(Level.INFO,() ->"Account ID:" + " " + account1.id);
        l.log(Level.INFO,() ->"Initial Balance:" + account1.getBalance());
        l.log(Level.INFO,() ->"Balance after Withdraw:" + " " + account1.withdraw(2500));
        l.log(Level.INFO,() ->"Balance after deposit" + " " + account1.deposit(3000));
    }
}
