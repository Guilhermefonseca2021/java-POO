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
}