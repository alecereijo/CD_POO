package com.campusdual;

public class Exercise7 {
    public static void main(String[] args) {

        //primeros 15 numero naturales
        for (int i =1; i <= 15; i++){
            System.out.println(i);
        }
        //sumar los 100 primero numeros
        int suma = 0;

        for (int i = 1; i <= 100; i++) {
            suma += i;
        }

        System.out.println("La suma de los primeros 100 números es: " + suma);

    }
}
