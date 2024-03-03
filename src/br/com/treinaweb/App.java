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
        caregiver.deposit(100);
        caregiver.withdraw(50);
        System.out.println("Balance: " + caregiver.getBalance());

        
        var client = new Client("Maria Beneta", "(84) 938435-4342", "R. Bonaparte Nobrega Mundes", 1500);

        System.out.println("Name " + client.getName());
        System.out.println("Phone: " + client.getPhone());
        client.deposit(250);
        client.withdraw(120);
        System.out.println("Balance " + client.getBalance());

        var caregiver2 = new Caregiver("Lula canario", "(83) 91232-3424", "R. Francisco Almeida Campos Sales", "423.324.234-75");
        var client2 = new Client("Velma Aldebaran", "(84) 938435-4342", "R. Bonaparte Nobrega Mundes", 1500);

        client2.deposit(100);
        client2.transfer(caregiver2, 50);
        
        System.out.println(client2.getBalance());
        System.out.println(caregiver2.getBalance());

        caregiver2.transfer(client2, 20);
        
        System.out.println(client2.getBalance());
        System.out.println(caregiver2.getBalance());

        //  every all class heritage object. with method toString.
        System.out.println(client);
        System.out.println(caregiver);

        var caregiver3 = new Caregiver("Lula canario", "(83) 91232-3424", "R. Francisco Almeida Campos Sales", "423.324.234-75");
        System.out.println(caregiver3.equals(caregiver2));

        var service = new Service();
        service.setData("01/01/2022");
        service.setHours(10);
        service.setClient(client2);
        service.setCaregiver(caregiver2);

        System.out.println(service.getData());
        System.out.println(service.getHours());
        System.out.println(service.getCaregiver().getName());
        System.out.println(service.getClient().getName());
        // abstract class cannot be instansed = var user = new User("Joao da Silva", "(83) 91232-3424", "R. Francisco Almeida Campos Sales");
    }
}