// Captura.java
package javaapplication8;

import java.util.Scanner;
import javaapplication8.Interface;

public  class Captura implements Interface{
    private double[] numeros;
    private int Cantidad;
    private double num;
    private String mensaje;
    
        public double getNumero() {
        return num;
    }

        //Encapsulamiento 
    public void setNumero(double numero) {
        this.num= numero;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public Captura() {
        numeros = new double[100]; // Puedes ajustar el tamaño máximo del vector según tus necesidades
        Cantidad = 0;
    }

    //es la sobre escritura 
    @Override
    public void agregarNumero(double numero) {
        numeros[Cantidad] = numero;
        Cantidad++;
    }

    @Override
    public int Pares() {
        int pares = 0;
        for (int i = 0; i < Cantidad; i++) {
            if (numeros[i] % 2 == 0) {
                pares++;
            }
        }
        return pares;
    }

    @Override
    public int Impares() {
        int impares = 0;
        for (int i = 0; i < Cantidad; i++) {
            if (numeros[i] % 2 != 0) {
                impares++;
            }
        }
        return impares;
    }

    @Override
    public int Negativos() {
        int negativos = 0;
        for (int i = 0; i < Cantidad; i++) {
            if (numeros[i] < 0) {
                negativos++;
            }
        }
        return negativos;
    }

    @Override
    public int contarCeros() {
        int ceros = 0;
        for (int i = 0; i < Cantidad; i++) {
            if (numeros[i] == 0) {
                ceros++;
            }
        }
        return ceros;
    }

    @Override
    public int Positivos() {
        int positivos = 0;
        for (int i = 0; i < Cantidad; i++) {
            if (numeros[i] > 0) {
                positivos++;
            }
        }
        return positivos;
    }
    @Override
    public double NumMasAlto() {
        double max = numeros[0];
        for (int i = 1; i < Cantidad; i++) {
            if (numeros[i] > max) {
                max = numeros[i];
            }
        }
        return max;
    }

    @Override
    public double NumMasBajo() {
        double min = numeros[0];
        for (int i = 1; i < Cantidad; i++) {
            if (numeros[i] < min) {
                min = numeros[i];
            }
        }
        return min;
    }

    @Override
    public void mostrarVector() {
        System.out.print("Datos (");
        for (int i = 0; i < Cantidad; i++) {
            if (i == Cantidad - 1) {
                System.out.print(numeros[i]);
            } else {
                System.out.print(numeros[i] + ", ");
            }
        }
        System.out.println(")");
    }


}
