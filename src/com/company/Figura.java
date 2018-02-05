package com.company;

abstract public class Figura {
    private String color;

    public Figura(String color) {
        this.color = color;
    }

    abstract public double area();

    abstract public double perimetro();

    public abstract void mostrar();
}
