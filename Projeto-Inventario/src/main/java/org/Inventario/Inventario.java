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
             System.out.println(item.name);
             System.out.println(item.price);
             System.out.println(item.Qnt);
             System.out.println(item.code);
         }
     }
}
