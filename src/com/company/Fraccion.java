package com.company;

public class Fraccion {
    int numerador;
    int denominador;


    public Fraccion(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public Fraccion sumar(Fraccion a) {
        int cont1 = (a.numerador * this.denominador) + (a.denominador * this.numerador);
        int cont2 = this.denominador * a.denominador;

        Fraccion f = new Fraccion(cont1, cont2);
        return f;

    }
    public Fraccion restar(Fraccion a) {
        int cont1 = a.denominador * this.numerador-a.numerador * this.denominador;
        int cont2 = this.denominador * a.denominador;

        Fraccion f = new Fraccion(cont1, cont2);
        return f;

    }


    public void mostrar() {
       System.out.print(numerador+"/"+denominador);
    }
}
