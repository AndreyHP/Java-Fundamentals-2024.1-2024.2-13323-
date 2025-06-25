package org.Inventario;


import java.io.IOException;
import java.util.Scanner;




public class Main {
    public static void main(String[] args) throws IOException {
        askUser();
    }

    static void addItem(){
        Scanner scanner = new Scanner(System.in);
        Inventario inventario = new Inventario();

        String nome;
        double price;
        int Qnt;
        int code;

        System.out.println("Nome do Item");
        nome = scanner.nextLine();
        System.out.println("Preço do Item");
        price = scanner.nextDouble();
        System.out.println("Quantidade do Item");
        Qnt = scanner.nextInt();
        System.out.println("Codigo do Item");
        code = scanner.nextInt();
        item i = new item(nome,price,Qnt,code);

        inventario.addItem(i);

        inventario.printItems();
        

        askUser();
    }

    static void askUser(){
        Scanner scanner = new Scanner(System.in);


        System.out.println("adcionar novo item? Sim(1) Não(2)");
        int addNewItem = scanner.nextInt();

        if (addNewItem == 1){
            addItem();
        }

        scanner.close();
    }
}