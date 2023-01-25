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
            logger.log("u dont have enough money to withdraw");
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
        logger.log("Account Holder name:" + " " + account1.accntholdername);
        logger.log("Account ID:" + " " + account1.id);
        logger.log("Initial Balance:" + account1.getBalance());
        logger.log("Balance after Withdraw:" + " " + account1.withdraw(2500));
        logger.log("Balance after deposit" + " " + account1.deposit(3000));
    }
}