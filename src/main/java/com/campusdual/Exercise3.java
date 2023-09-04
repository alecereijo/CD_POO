package com.campusdual;

public class Exercise3 {
    public static void main(String[] args) {
        // Ejemplo de un método en Java
        int num1 = 5;
        int num2 = 3;
        int suma = sumar(num1, num2);
        System.out.println("La suma es: " + suma);

        // Ejemplo de una función en Java
        double radio = 3.0;
        double areaDelCirculo = calcularAreaCirculo(radio);
        System.out.println("El área del círculo es: " + areaDelCirculo);

        // Ejemplo de un procedimiento en Java
        imprimirMensaje();
    }

    // Método que suma dos números y devuelve el resultado
    public static int sumar(int numero1, int numero2) {
        int resultado = numero1 + numero2;
        return resultado;
    }

    // Función que calcula el área de un círculo y devuelve el resultado
    public static double calcularAreaCirculo(double radio) {
        double area = Math.PI * Math.pow(radio, 2);
        return area;
    }

    // Procedimiento que imprime un mensaje en la consola
    public static void imprimirMensaje() {
        System.out.println("Esto es un procedimiento");
    }

}
