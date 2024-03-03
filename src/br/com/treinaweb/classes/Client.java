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
    @Override 
    // the name of the objct from class
    public String toString() {
        return "Client: " + this.getName();
    }
    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        return super.equals(obj);
    }
    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return super.hashCode();
    }
    

}