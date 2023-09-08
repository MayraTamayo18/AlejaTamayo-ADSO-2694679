package javaapplication8;

import java.util.Scanner;
import javaapplication8.Captura;
public class JavaApplication8 {

    


    public static void main(String[] args) { //punto de entrada del programa 
        Scanner scanner = new Scanner(System.in);
        Captura numerosReales = new Captura() {};

        int continuar;
        do {
            System.out.print("Ingrese un número real: ");
            double numero = scanner.nextDouble();
            numerosReales.agregarNumero(numero);

            System.out.print("¿Quieres seguir agregando más números? (1: Sí / 0: No): ");
            continuar = scanner.nextInt();
        } while (continuar != 0);

        System.out.println("--- Resultados ---");
        numerosReales.mostrarVector();
        System.out.println("Cantidad de números pares: " + numerosReales.Pares());
        System.out.println("Cantidad de números impares: " + numerosReales.Impares());
        System.out.println("Cantidad de números negativos: " + numerosReales.Negativos());
        System.out.println("Cantidad de ceros: " + numerosReales.contarCeros());
        System.out.println("Cantidad de números positivos: " + numerosReales.Positivos());
        System.out.println("Número más alto: " + numerosReales.NumMasAlto());
        System.out.println("Número más bajo: " + numerosReales.NumMasBajo());

        scanner.close();
    }
}
