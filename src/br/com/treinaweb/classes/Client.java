package br.com.treinaweb.classes;

public class Client extends User {
    public Client(String name, String phone, String address, double balance) {
        super(name, phone, address);  
    }
    @Override
    public void deposit(double value) {
        var currentBalance = this.getBalance();
        var newBalance = currentBalance + value + (value * 0.1);
        this.setBalance(newBalance);
    }
    @Override
    public void withdraw(double value) {
        var currentBalance = this.getBalance();
        var newBalance = currentBalance - value;
        this.setBalance(newBalance);
    }
}