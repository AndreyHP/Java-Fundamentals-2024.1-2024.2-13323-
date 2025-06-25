package org.Inventario;

import java.util.ArrayList;

public class Inventario {
    ArrayList<item> items;

    public Inventario(){
        items = new ArrayList<>();
    }

     void addItem(item i){
        items.add(i);
     }

     void printItems(){
         for (item item : items) {
             System.out.println("Nome: "+item.name);
             System.out.println("Preço: "+item.price);
             System.out.println("Quantidade: "+item.Qnt);
             System.out.println("Codigo: "+item.code);
         }
     }
}
