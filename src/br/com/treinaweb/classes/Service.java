package br.com.treinaweb.classes;

public class Service {
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
}
