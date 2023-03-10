/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.hw2;
import java.util.Scanner;

/**
 *
 * @author valera
 */
public class HW2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Работу выполнил Гринченко Валерий, РИБО-01-21, Вариант №1");
        System.out.println("Выбирайте Легковой автомобиль или Грузовой автомобиль");
        System.out.println("0 - Легковой автомобиль, 1 - Грузовой автомобиль: ");
        int i = scan.nextInt();
            if (i==0){
                System.out.println("Введите максимальную скорость: ");
                int maxspeed = scan.nextInt();
                System.out.println("Вместимость (человек): ");
                int vmestimost = scan.nextInt();
                System.out.println("Тип кузова: ");
                String tipkuzova = scan.next();
                System.out.println("Вес машины (кг): ");
                int ves = scan.nextInt();
                System.out.println("Марка: ");
                String marka = scan.next();
                Car car1 = new Car(maxspeed, vmestimost, tipkuzova, ves, marka);
                Autoservise autoservice1 = new Autoservise();
                autoservice1.modify(car1);
                System.out.println("Цвет: ");
                String color = scan.next();
                System.out.println("Стоимость: ");
                int price = scan.nextInt();
                Pass car2 = new Pass(price, color, maxspeed, vmestimost, tipkuzova, ves, car1.toString());
                System.out.println(car2.toString());
            } else{
                System.out.println("Введите максимальную скорость: ");
                int maxspeed = scan.nextInt();
                System.out.println("Вместимость (человек): ");
                int vmestimost = scan.nextInt();
                System.out.println("Тип кузова: ");
                String tipkuzova = scan.next();
                System.out.println("Вес машины (кг): ");
                int ves = scan.nextInt();
                System.out.println("Марка: ");
                String marka = scan.next();
                Car car1 = new Car(maxspeed, vmestimost, tipkuzova, ves, marka);
                Autoservise autoservice1 = new Autoservise();
                autoservice1.modify(car1);
                System.out.println("Высота: ");
                int visota = scan.nextInt();
                System.out.println("Грузоподъемность: ");
                int gruzopod = scan.nextInt();
                Truck car3 = new Truck(gruzopod, visota, maxspeed, vmestimost, tipkuzova, ves, car1.toString());
                System.out.println(car3.toString());
            }
    }
}
