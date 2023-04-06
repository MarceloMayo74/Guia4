/*
 * Crea una aplicación que nos pida un número por teclado y con una función se lo pasamos por parámetro
 * para que nos indique si es o no un número primo, debe devolver true si es primo, sino false.
 */
package ejercicio04;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el número que desea saber si es primo");
        int num = sc.nextInt();
        if (esPrimo(num)) {
            System.out.println("El número es Primo");
        } else {
            System.out.println("El número no es Primo");
        }
    }

    public static boolean esPrimo(int num) {
        int contador = 0;
        for (int i = 1; i < num + 1; i++) {
            if (num % i == 0) {
                contador++;
            }
        }
        if (contador == 2) {
            return true;
        } else {
            return false;
        }
    }
}
