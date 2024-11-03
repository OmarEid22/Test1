package test1;

public class Customer {
    private String name;
    private double balance;

    public Customer(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }
    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public double getBalance() {

        return balance;
    }

    public void setBalance(double balance) {

        this.balance = balance;
    }
    public boolean canAfford(double amount) {

        return balance >= amount;
    }

    public void deductAmount(double amount) {

        this.balance -= amount;
    }

}
