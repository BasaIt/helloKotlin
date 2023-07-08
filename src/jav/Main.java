package jav;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Addres addres = new Addres("Moscow", "RedStreeet", "25");
        Addres addres1 = new Addres("Moscow", "RedStreeet", "25");
        if (addres.equals(addres1)){
            System.out.println("Равны");
        }else {
            System.out.println("Не равны");
        }
        System.out.println(addres.hashCode());
        System.out.println(addres1.hashCode());
    }
}
