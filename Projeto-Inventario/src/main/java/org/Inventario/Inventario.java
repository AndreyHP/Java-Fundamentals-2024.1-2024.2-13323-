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


}
