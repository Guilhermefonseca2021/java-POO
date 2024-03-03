package br.com.treinaweb.classes;

import br.com.treinaweb.interfaces.IBalance;

public abstract class User implements IBalance {
    private String name;
    private String phone;
    private String address;
    private double balance;
    public User(String name, String phone, String address) {
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.balance = 0.0;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public double getBalance() {
        return balance;
    }
    protected void setBalance(double balance) {
        this.balance = balance;
    }
}
