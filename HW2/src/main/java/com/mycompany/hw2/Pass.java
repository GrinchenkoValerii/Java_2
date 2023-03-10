/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hw2;

/**
 *
 * @author valera
 */
public class Pass extends Car {
    private int price;
    private String color;

    public Pass(int price, String color, int maxspeed, int vmestimost, String tipkuzova, int ves, String marka) {
        super(maxspeed, vmestimost, tipkuzova, ves, marka);
        this.price = price;
        this.color = color;
    }
    
    public void bistrodrive (){
        System.out.println("Машина едет быстро");
    }
    
    public void drift (){
        System.out.println("Машина дрифтит");
    }
    
    public void taxi (){
        System.out.println("Машина - такси");
    }
    
    @Override
    public String toString() {
        return "Легковой автомобиль {" + "максимальная скорость = " + getmaxspeed() + ", вместимость (человек) = " + getvmestimost() + ", тип кузова = " + gettipkuzova() + ", марка = " + getmarka() + ", вес машины (кг) = " + getves() + ", цена = " + price + ", цвет = " + color + '}';
    }
}
