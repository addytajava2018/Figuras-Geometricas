package com.company;

import java.util.Scanner;

public class Cuadrado extends Figura {
    private int lado;
    Scanner sc;

    {
        sc = new Scanner(System.in);
    }

    public Cuadrado(String color, int lado) {
        super(color);
        this.lado = lado;
    }

    public double perimetro() {
        return 4 * lado;
    }

    @Override
    public double area() {
        return Math.pow(lado, 2);
    }

    public void mostrar() {
        System.out.println("Op:1 -> AREA");
        System.out.println("Op:2 -> PERIMETRO");
        int op = Integer.parseInt(sc.nextLine());
        if (op == 1) {
            System.out.println("El area del cuadrado es: " + area());
        } else {
            /*preguntar del color*/
            System.out.println("El perimetro del cuadrado es: " + perimetro());
        }
    }
}
