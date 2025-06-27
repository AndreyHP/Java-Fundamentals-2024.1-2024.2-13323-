package org.Inventario;

import java.util.Scanner;

import static org.Inventario.Main.scanner;

public class ProductTester {
    static void addItem(Inventario inventario){
        Scanner scanner = new Scanner(System.in);


        String nome;
        double price;
        int Qnt;
        int code;
        String priceinput;

        System.out.println("Nome do Item");
        nome = scanner.nextLine();
        System.out.println("Preço do Item");
        priceinput = scanner.nextLine();
        if (priceinput.contains(",")){
            priceinput = priceinput.replace(',', '.');
        }
        price = Double.parseDouble(priceinput);
        System.out.println("Quantidade do Item");
        Qnt = scanner.nextInt();
        System.out.println("Codigo do Item");
        code = scanner.nextInt();
        item i = new item(nome,price,Qnt,code);

        inventario.addItem(i);


    }

    static void removeItem(Inventario inventario){

        int itemCode;
        int itemQnt;

        System.out.println("Codigo do Item");
        itemCode = scanner.nextInt();
        System.out.println("Qnt do Item");
        itemQnt = scanner.nextInt();

        for (int i = 0; i < inventario.items.size(); i++) {
            int bufferCode = inventario.items.get(i).getCode();
            if (bufferCode == itemCode) {
                inventario.items.get(i).Qnt -= itemQnt;

                if (inventario.items.get(i).Qnt < 0) {
                    inventario.items.get(i).Qnt = 0;
                }
                System.out.println("Updated item: " + inventario.items.get(i).name + " - Quantity: " + inventario.items.get(i).Qnt);
                return;
            }
        }
        System.out.println("Item not found.");
    }

    static void displayInventory(Inventario inventario){

        for (int i = 0; i < inventario.items.size(); i++) {
            System.out.println("Nome: "+ inventario.items.get(i).name);
            System.out.println("Preço: "+ inventario.items.get(i).price);
            System.out.println("Quantidade: "+ inventario.items.get(i).Qnt);
            System.out.println("Codigo: "+ inventario.items.get(i).code);
        }
    }
}
