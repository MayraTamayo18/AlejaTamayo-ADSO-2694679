/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utils;

/**
 *
 * @author Maira Alejandra
 */
public class Ejercicios {
    private Double numero;

    public Double getNumero() {
        return numero;
    }

    public void setNumero(Double numero) {
        this.numero = numero;
    }
    
    public Double InputNumericScanner(String mensaje) {
        InputEjercicios(mensaje, 1);
        return this.getNumero();
    }

    public Double InputNumericJOptionPane(String mensaje) {
        InputEjercicios(mensaje, 2);
        return this.getNumero();
    }
    
    private void InputEjercicios(String mensaje, int tipo) {
        Boolean validar = false;
        FunctionString Ej = new FunctionString();

        //Validar que se ingrese el dato correcto 
        while (validar == false) {
            try {
                if(tipo==1){
                    this.setNumero(Double.parseDouble(Ej.InputScanner(mensaje)));
                }else{
                    this.setNumero(Double.parseDouble(Ej.InputJOptionPane(mensaje)));
                }
                validar = true;
            } catch (Exception e) {
                if (tipo==1) {
                    Ej.ShowScanner("Ha ingresado un dato no válido. ");
                }else{
                    Ej.ShowJOptionPane("Ha ingresado un dato no válido. ");
                }
            }
        }        
    }
    
    
//EJERCISIOS 06/08/2023      
        
        //1. grados celsius a grados fharenheit
      public Double InputCelsiusaFharenheit(String mensaje){
            InputEjercicios(mensaje, 1);
          double fahrenheit = (this.getNumero()*9 / 5)+32;
          this.setNumero(fahrenheit);
          return fahrenheit; 
      }

      //2. grados celsius a kelvin 
      
      public Double inputCelsiusKelvi(String mensaje){
           InputEjercicios(mensaje, 1);
           double kelvi= (this.getNumero()+273.15); 
           this.setNumero(kelvi);
           return kelvi; 
         }
           
       //3. grados fahrenheit a grados celsius
       public Double InputFahrenheitCelsius(String mensaje){
            InputEjercicios(mensaje, 1);
          double Celsius = (this.getNumero()-32)* 5 / 9;
          this.setNumero(Celsius);
          return Celsius;
      }
       
       //4 grados fahrenheit a kelvin
         public Double inputFahrenheitKelvin(String mensaje){
            InputEjercicios(mensaje, 1);
          double Kelvin = (this.getNumero()-32)/1.8+273.15;
          this.setNumero(Kelvin);
          return Kelvin;
      }
       //5 grados kelvin a fahrenheit
         public Double inputKelvinFahrenheit(String mensaje){
            InputEjercicios(mensaje, 1);
          double Fahrenheit = (this.getNumero()-273.15)*1.8+32;
          this.setNumero(Fahrenheit);
          return Fahrenheit;
      }
         //6 grados kelvin a celsius
          public Double inputKelvinCelsius(String mensaje){
            InputEjercicios(mensaje, 1);
          double Celsius = (this.getNumero()-273.15);
          this.setNumero(Celsius);
          return Celsius;
}
}