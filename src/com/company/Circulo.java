package com.company;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

public class Circulo extends Figura {
    private int radio;
    Scanner sc;

    {
        sc = new Scanner(System.in);
    }

    public Circulo(int radio, String color) {
        super(color);
        this.radio = radio;
    }

    public double perimetro() {
        return 2 * Math.PI * radio;

    }

    public double area() {
        return Math.PI * Math.pow(radio, 2);
    }

    public void mostrar() {
        System.out.println("Op:1 -> AREA");
        System.out.println("Op:2 -> PERIMETRO");
        int op = Integer.parseInt(sc.nextLine());
        if (op == 1) {
            System.out.println("El area del circulo es: " + area());
        } else {
            /*preguntar del color*/
            System.out.println("El perimetro del circulo es: " + perimetro());
        }


    }
}
