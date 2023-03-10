package com.mycompany.hw2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author valera
 */
public class Car {
    private int maxspeed;
    private int vmestimost;
    private String tipkuzova;
    private int ves;
    private String marka;

    public Car(int maxspeed, int vmestimost, String tipkuzova, int ves, String marka) {
        this.maxspeed = maxspeed;
        this.vmestimost = vmestimost;
        this.tipkuzova = tipkuzova;
        this.ves = ves;
        this.marka = marka;
    }
    
    public void drive (){
        System.out.println("Машина едет");
    }
    
    public void reversedrive (){
        System.out.println("Машина едет задним ходом");
    }
    
    public void stand (){
        System.out.println("Машина стоит");
    }
    
    public int getmaxspeed() {
        return maxspeed;
    }

    public int getvmestimost() {
        return vmestimost;
    }

    public String gettipkuzova() {
        return tipkuzova;
    }
    
    public String getmarka() {
        return marka;
    }

    public int getves() {
        return ves;
    }

    public void setmarka(String marka) {
        this.marka = marka;
    }
    
    @Override
    public String toString(){
        return marka;
    }
}
