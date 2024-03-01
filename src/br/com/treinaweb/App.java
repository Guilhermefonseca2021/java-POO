package br.com.treinaweb;
import br.com.treinaweb.classes.Caregiver;
import br.com.treinaweb.classes.Client;

public class App {
    public static void main(String[] args) {
        // var joao = new Diarista();
        var caregiver = new Caregiver("Joao da Silva", "(83) 91232-3424", "R. Francisco Almeida Campos Sales", "423.324.234-75");
        
        System.out.println("Name: " + caregiver.name);
        System.out.println("Phone: " + caregiver.name);
        System.out.println("Address: " + caregiver.address);
        System.out.println("PixKey: " + caregiver.pixKey);
        caregiver.call(caregiver.name);

        
        var client = new Client("Maria Beneta", "(84) 938435-4342", "R. Bonaparte Nobrega Mundes", 1500);

        System.out.println("Name " + client.name);
        System.out.println("Phone: " + client.name);
        System.out.println("Address " + client.address);
        System.out.println("Balance " + client.balance);
    }
}