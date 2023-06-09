/*
 * Crea una aplicación que a través de una función nos convierta una cantidad de euros introducida por teclado a otra moneda,
 * estas pueden ser a dólares, yenes o libras. La función tendrá como parámetros, la cantidad de euros y la moneda a convertir
 * que será una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio (void).
 * El cambio de divisas es:
 * 0.86 libras es un 1 €
 * 1.28611 $ es un 1 €
 * 129.852 yenes es un 1 €
 */
package ejercicio03;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Por favor ingrese un monto a convertir");
        double monto = leer.nextDouble();
        System.out.println("""
                           MENU
                           1. Peso
                           2. Dolar
                           3. Yen
                           4. Libra""");
        String opcion = leer.next();
        convertir(monto, opcion);
    }

    public static void convertir(double monto, String opcion) {
        double d;
        switch (opcion) {
            case "1" -> {
                d = monto * 209;
                System.out.println(" equivale a " + d + " pesos ");
            }
            case "2" -> {
                d = monto * 1.28;
                System.out.println("equivale a " + d + " dolar ");
            }
            case "3" -> {
                d = monto * 144.87;
                System.out.println("equivale a " + d + " yanes ");
            }
            case "4" -> {
                d = monto * 0.86;
                System.out.println("equivale a" + d + "libras");
            }
        }
    }
}
