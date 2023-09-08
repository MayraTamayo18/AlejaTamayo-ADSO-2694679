/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;
import  Entity.Institucion.Matriculas; 
import Utils.FunctionNumeric;
import Utils.FunctionString;


/**
 *
 * @author Maira Alejandra
 */

public class MatriculaView {
    
      public static void main(String[] args) {

    FunctionNumeric fn = new FunctionNumeric(); 
    FunctionString fs = new FunctionString();
    //objeto sobre objeto para el n de estudiantes
         Matriculas m [ ] = new Matriculas[fn.InputIntegerNumericPositiveScanner("ingrese cuantos estudiantes desean ingresar: ")];
         for( int i= 0; i<m.length; i++){
             m[i] = new Matriculas(); 
             m[i].GenerarFactura();
         }
         for(int i= 0; i< m.length;i++){
         fs.ShowScanner(m[i].getNombre()+" $" + m[i].getTotalPagar().toString());
             
         }    
    
      
      }
    
}
