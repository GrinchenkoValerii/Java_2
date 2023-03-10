/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hw2;

/**
 *
 * @author valera
 */
public class Truck extends Car{
    private int gruzopod;
    private int visota;

    public Truck(int gruzopod, int visota, int maxspeed, int vmestimost, String tipkuzova, int ves, String marka) {
        super(maxspeed, vmestimost, tipkuzova, ves,  marka);
        this.gruzopod = gruzopod;
        this.visota = visota;
    }
    
    public void gruz (){
        System.out.println("Машина грузит груз");
    }
    
    public void podnimaet (){
        System.out.println("Машина поднимает гузов");
    }
    
    public void opuskaet (){
        System.out.println("Машина опускает кузов");
    }
    
    @Override
    public String toString() {
        return "Грузовой автомобиль {" + "максимальная скорость = " + getmaxspeed() + ", вместимость (человек) = " + getvmestimost() + ", тип кузова = " + gettipkuzova() + ", марка = " + getmarka() + ", вес машины (кг) = " + getves() + ", грузоподъемность = " + gruzopod + ", высота = " + visota + '}';
    }
}
