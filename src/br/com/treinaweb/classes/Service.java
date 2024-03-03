package br.com.treinaweb.classes;

public class Service {
    private String data;
    private Client client;
    private Caregiver caregiver;
    // we cannot change values private directly, only by functions.
    private int hours;
    public void setHours(int hours) {
        if(hours < 1 || hours > 12) {
            System.out.println("We cannot have you less than 1hours and more than 12hours.");
        } else {
            this.hours = hours;
        }
    }
    public int getHours() {
        return hours;
    }
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Caregiver getCaregiver() {
        return caregiver;
    }

    public void setCaregiver(Caregiver caregiver) {
        this.caregiver = caregiver;
    }
}
