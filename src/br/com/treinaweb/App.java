package br.com.treinaweb;
import br.com.treinaweb.classes.Caregiver;
import br.com.treinaweb.classes.Client;
import br.com.treinaweb.classes.Service;

public class App {
    public static void main(String[] args) {
        // var joao = new Diarista();
        var caregiver = new Caregiver("Joao da Silva", "(83) 91232-3424", "R. Francisco Almeida Campos Sales", "423.324.234-75");
        
        System.out.println("Name: " + caregiver.getName());
        System.out.println("Phone: " + caregiver.getPhone());
        System.out.println("PixKey: " + caregiver.getPixKey());
        caregiver.call(caregiver.getName());

        
        var client = new Client("Maria Beneta", "(84) 938435-4342", "R. Bonaparte Nobrega Mundes", 1500);

        System.out.println("Name " + client.getName());
        System.out.println("Phone: " + client.getPhone());
        System.out.println("Balance " + client.getBalance());

        var service = new Service();
        service.setHours(15);
        System.out.println(service.getHours());
    }
}