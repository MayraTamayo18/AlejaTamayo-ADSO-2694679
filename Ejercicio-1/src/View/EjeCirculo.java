/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;
import Class.Circulo; 
import Class.Figura;

/**
 *
 * @author Maira Alejandra
 */
public class EjeCirculo {
     public static void main(String[] args) {
        double radio = 5.0; 
        Figura figura = new Circulo(radio); 
        double area = figura.CalcularArea(); 
         System.out.println("el área del círculo con radio  "+ radio +" es: "+area); 
    }
}
