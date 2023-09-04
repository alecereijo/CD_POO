package com.campusdual;

public class Encapsular {
    private int actualFuel= 10;
    // Agregamos un setter para actualizar el valor del atributo
    public void setActualFuel(int fuel) {
        if (fuel >= 0) {
            this.actualFuel = fuel;
        } else {
            System.out.println("Error: No puedes establecer un valor negativo para el combustible.");
        }
    }

    public int getActualFuel() {
        return actualFuel; // Agregamos un getter para obtener el valor del atributo
    }

    public void showDetails() {
        System.out.println("La capacidad actual es de " + this.actualFuel + " litros.");
    }

    public static void main(String[] args) {
        Encapsular en = new Encapsular();
        en.showDetails();
        System.out.println("Actualización de la capacidad");
        en.setActualFuel(-8); // Utilizamos el setter en lugar de acceder directamente
        en.showDetails();

        // Ejemplo de cómo obtener el valor
        int fuelValue = en.getActualFuel();
        System.out.println("El valor actual de combustible es: " + fuelValue);
    }
}
