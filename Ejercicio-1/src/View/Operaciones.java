/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import Class.Potencia;
import Class.Suma;
import Class.Resta;
import Class.Division;
import Class.Multiplicacion;
import javax.swing.JOptionPane;

/**
 *
 * @author Maira Alejandra
 */
public class Operaciones {
    
    public static void main(String[] args){
        
        Potencia potencia = new Potencia();
        potencia.setNum1(2.0);
        potencia.setNum2(4.0);
        JOptionPane.showMessageDialog(null, "la potencia es: " + potencia.GenerarResultado());
    
        Suma suma = new Suma();
        suma.setNum1(2.0);
        suma.setNum2(2.0);
        JOptionPane.showMessageDialog(null, "la suma esa: " + suma .GenerarResultado());
        
        Resta resta = new Resta();
        resta.setNum1(3.0);
        resta.setNum2(2.0);
         JOptionPane.showMessageDialog(null, "la Resta esa: " + resta .GenerarResultado());
         
          Division division = new Division();
        division.setNum1(3.0);
        division.setNum2(2.0);
         JOptionPane.showMessageDialog(null, "la Resta esa: " + division.GenerarResultado());
         
         Multiplicacion multiplicacion = new Multiplicacion(); 
         multiplicacion.setNum1(4.0);
         multiplicacion.setNum2(6.0);
         JOptionPane.showMessageDialog(null, "la Resta esa: " + division.GenerarResultado());
         
         
         
      
        
        
    }
}
