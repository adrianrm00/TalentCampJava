package Ejercicios;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca su nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Introduzca su edad: ");
        int edad = sc.nextInt();
        sc.nextLine();

        System.out.print("Introduzca su ciudad: ");
        String ciudad = sc.nextLine();

        System.out.print("Introduzca su frase favorita: ");
        String frase = sc.nextLine();

        String fraseFinal = "Hola, " + nombre + ", su edad es " + edad + ".\nSu lugar de nacimiento es " + ciudad + ".\nY su frase favorita es " + frase;

        System.out.println(fraseFinal);

    }
}
