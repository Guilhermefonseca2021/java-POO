package br.com.treinaweb.classes;

public class Client extends User {
    public double balance;
    public Client(String name, String phone, String address, double balance) {
        super(name, phone, address);  
        this.balance = balance;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
}