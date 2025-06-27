package org.Inventario;


import java.io.IOException;
import java.util.Scanner;

import static org.Inventario.ProductTester.*;



public class Main {

    static Inventario inventario = new Inventario();

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        askUser();
        scanner.close();
    }

    static void askUser(){


        System.out.println("adcionar novo item?(1) remover item?(2) Exibir Inventario(3) Descontinuar(4) Sair(0)");
        int addNewItem = scanner.nextInt();

        switch (addNewItem){
            case 1: {
                addItem(inventario);
                displayInventory(inventario);
                askUser();
                break;
            }

            case 2: {
                removeItem(inventario);
                askUser();
                break;
            }

            case 3: {
                displayInventory(inventario);
                askUser();
                break;
            }

            case 4: {

            }

            case 0: {
                break;
            }
        }

    }

}