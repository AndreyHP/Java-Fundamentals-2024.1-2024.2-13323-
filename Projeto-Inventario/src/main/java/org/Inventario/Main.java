package org.Inventario;


import java.io.IOException;
import java.util.Scanner;

import static org.Inventario.ProductTester.addItem;
import static org.Inventario.ProductTester.displayInventory;


public class Main {

    static Inventario inventario = new Inventario();

    public static void main(String[] args) throws IOException {
        askUser();
    }

    static void askUser(){

        Scanner scanner = new Scanner(System.in);


        System.out.println("adcionar novo item? Sim(1) Não(2)");
        int addNewItem = scanner.nextInt();

        if (addNewItem == 1){
            addItem(inventario);
            displayInventory(inventario);
            askUser();
        }

        scanner.close();
    }

}