package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Figura f;
        int or;
        String color;
        int or2;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Op:1 -> Circulo");
            System.out.println("Op:2 -> Cuadrado");
            System.out.println("Op:3 -> Rectangulo");
            System.out.println("Op:0 -> Terminar");
            or = Integer.parseInt(sc.nextLine());
            if (or == 0) break;
            switch (or) {
                case 1:
                    System.out.println("Ingrese el color del circulo");
                    color = sc.nextLine();
                    System.out.println("Ingrese el radio del circulo");
                    or = Integer.parseInt(sc.nextLine());
                    f = new Circulo(or, color);
                    f.mostrar();
                    break;
                case 2:
                    System.out.println("Ingrese el color del cuadrado");
                    color = sc.nextLine();
                    System.out.println("Ingrese el lado del cuadrado");
                    or = Integer.parseInt(sc.nextLine());
                    f = new Cuadrado(color, or);
                    f.mostrar();
                    break;
                case 3:
                    System.out.println("Ingrese el color del rectangulo");
                    color = sc.nextLine();
                    System.out.println("Ingrese la base del rectangulo");
                    or = Integer.parseInt(sc.nextLine());
                    System.out.println("Ingrese la altura del rectangulo");
                    or2 = Integer.parseInt(sc.nextLine());
                    f = new Rectangulo(color, or, or2);
                    f.mostrar();
                    break;

            }
        } while (true);

    }
}
