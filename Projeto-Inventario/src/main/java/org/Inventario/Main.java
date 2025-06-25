package org.Inventario;


import java.io.IOException;
import java.util.Scanner;




public class Main {
    public static void main(String[] args) throws IOException {
        Inventario inventario = new Inventario();
        Scanner scanner = new Scanner(System.in);

        String nome;
        double price;
        int Qnt;
        int code;

        nome = scanner.nextLine();
        price = scanner.nextDouble();
        Qnt = scanner.nextInt();
        code = scanner.nextInt();
        item i = new item(nome,price,Qnt,code);

        inventario.addItem(i);

        inventario.printItems();





        scanner.close();
    }
}