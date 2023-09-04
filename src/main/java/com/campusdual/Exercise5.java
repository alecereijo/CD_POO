package com.campusdual;

public class Exercise5 {
    //comprobar si un numero es positivo o negativo
    //comprobar si un numero es multiplo de otro
    //comprobaar que un numero es menor que otro
    public static void main(String[] args) {
        int numero =5;
        int numeromultiplo=6;
        int value1 = 10;
        int value2=8;
        if (numero > 0){
            System.out.println("El numero es positivo");
        }else {
            System.out.println("El numero es negativo");
        }


        if (numeromultiplo % value2==0 ){
            System.out.println("son multiplos");
        }else {
            System.out.println("no son multiplos");
        }


        if (value2 <value1){
            System.out.println("El numero es menor");
        }else {
            System.out.println("El numero es mayor");
        }
    }
}
