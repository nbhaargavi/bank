package org.example;
class Account {
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

    public double withdraw(int amount) {
        if (amount > balance) {
            System.out.println("u dont have enough money to withdraw");
        } else {
            return balance = balance - amount;
        }
        return amount;
    }

    double deposit(int amount) {
        return balance = balance + amount;
    }

    public static void main(String[] args) {

        Account account1 = new Account("bhaargavi", 1122, 20000);
        System.out.println("Account Holder name:" + " " + account1.accntholdername);
        System.out.println("Account ID:" + " " + account1.id);
        System.out.println("Initial Balance:" + account1.getBalance());
        System.out.println("Balance after Withdraw:" + " " + account1.withdraw(2500));
        System.out.println("Balance after deposit" + " " + account1.deposit(3000));
    }
}