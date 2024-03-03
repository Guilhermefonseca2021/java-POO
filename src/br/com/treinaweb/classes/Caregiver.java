package br.com.treinaweb.classes;

public class Caregiver extends User {
    public String pixKey;

    public Caregiver(String name) {
        super(name, null, null);
    }
    // our constructor, we need pass our atributes to be created
    public Caregiver(String name, String phone, String address, String pixKey) {
        super(name, phone, address);
        this.pixKey = pixKey;
    }

    public void call(String newClient) {
        System.out.println("Calling to " + newClient);
    }
    public String getPixKey() {
        return pixKey;
    }
    public void setPixKey(String pixKey) {
        this.pixKey = pixKey;
    }
    
    @Override // subscribe the method from interface(another local), anotation.
    public void deposit(double value) {
        var currentBalance = this.getBalance();
        var newBalance = currentBalance + value;
        this.setBalance(newBalance);
    }
    @Override
    public void withdraw(double value) {
        var currentBalance = this.getBalance();
        var newBalance = currentBalance - value;
        this.setBalance(newBalance);
    }
}