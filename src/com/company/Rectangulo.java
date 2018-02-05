package com.company;

import java.util.Scanner;

public class Rectangulo extends Figura {
    private int base;
    private int altura;
    Scanner sc;

    {
        sc = new Scanner(System.in);
    }

    public Rectangulo(String color, int base, int altura) {
        super(color);
        this.altura = altura;
        this.base = base;
    }

    public double perimetro() {
        return (base * 2) + (altura * 2);
    }

    public void mostrar() {
        System.out.println("Op:1 -> AREA");
        System.out.println("Op:2 -> PERIMETRO");
        int op = Integer.parseInt(sc.nextLine());
        if (op == 1) {
            System.out.println("El area del Rectangulo es: " + area());
        } else {
            /*preguntar del color*/
            System.out.println("El perimetro del Rectangulo es: " + perimetro());
        }
    }

    public double area() {
        return this.base * this.altura;
    }


}
