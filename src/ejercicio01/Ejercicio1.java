/*Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar, restar, multiplicar y dividir.
 *La aplicación debe tener una función para cada operación matemática y deben devolver sus resultados para imprimirlos en el main.
 */
package ejercicio01;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese el primer numero");
        int a = sc.nextInt();
        System.out.println("ingrese el segundo numero");
        int b = sc.nextInt();
        System.out.println("MENÚ");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        int opcion = sc.nextInt();
        switch (opcion) {
            case 1 -> {
                int c = suma(a, b);
                System.out.println("La suma de ambos es: " + c);
            }
            case 2 -> {
                int d = resta(a, b);
                System.out.println("La resta de ambos es: " + d);
            }
            case 3 -> {
                int e = multiplicacion(a, b);
                System.out.println("La multiplicacion de ambos es: " + e);
            }
            case 4 -> {
                double f = division(a, b);
                System.out.println("La division de ambos es: " + f);
            }
        }
    }

    public static int suma(int a, int b) {
        int c = a + b;
        return c;
    }

    public static int resta(int a, int b) {
        int d = a - b;
        return d;
    }

    public static int multiplicacion(int a, int b) {
        int e = a * b;
        return e;
    }

    public static double division(int a, int b) {
        double f = a / b;
        return f;
    }
}
