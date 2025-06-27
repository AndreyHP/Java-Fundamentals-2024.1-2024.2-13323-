package org.Inventario;

public class item {
    String name;
    double price;
    int Qnt;
    int code;


    public item(String name, double price, int Qnt, int code){
        this.name = name;
        this.price = price;
        this.Qnt = Qnt;
        this.code = code;
    }

    public int getCode(){
        return code;
    }

}
