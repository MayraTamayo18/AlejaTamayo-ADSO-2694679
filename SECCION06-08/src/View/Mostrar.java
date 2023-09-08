/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;
import Utils.FunctionNumeric;
import Utils.FunctionString;
import Utils.Ejercicios; 

/**
 *
 * @author Maira Alejandra
 */
public class Mostrar {
    public static void main(String[] args) {
        FunctionString fs = new FunctionString();
        FunctionNumeric fn = new FunctionNumeric();
        Ejercicios Ej = new Ejercicios(); 
        
       // fn.InputNumericRangeScanner("Digite la nota: ",90.0,100.0);
      //fn.InputNumericPositivoScanner("digite su numero");
     //fn.InputNumericNegativoScanner("digite su numero");
     //fn.InputNumericaEnteroRangeScanner("Digite la nota: ",90.0,100.0); 
     //fn.InputNumericaPositivoScanner("ingrese su numero"); 
     //fn.InputNumericaNegativaScanner("ingrese su numero");
     
     //1. ejercicio 
     //double fahrenheit = Ej. InputCelsiusaFharenheit("ingresar");
     //System.out.println("la perperatura en grados fahrenheit es:  " +fahrenheit);
     
     // 2.ejercicio
     //double kelvi = Ej.inputCelsiusKelvi("ingresar");
     //System.out.println("la perperatura en grados kelvi es:  " +kelvi);
     
     // 3.ejercicio
     //double Celsius= Ej.InputFahrenheitCelsius("ingresar");
     //System.out.println("la perperatura en grados Celsius es:  " +Celsius);
     
     // 4.ejercicio
     //double kelvin= Ej.inputFahrenheitKelvin("ingresar");
     //System.out.println("la perperatura en  grados kelvin es:  " +kelvin);
     
       // 5.ejercicio
      //double Fahrenheit= Ej.inputKelvinFahrenheit("ingresar");
      //System.out.println("la perperatura en grados Fahrenheit es:  " +Fahrenheit);
      
      // 6.ejercicio
      double Celsius= Ej.inputKelvinCelsius("ingresar");
      System.out.println("la perperatura en grados Celsius es:  " +Celsius);
    }
}
    

