/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

/**
 *
 * @author Maira Alejandra
 */
public class Potencia extends NumeroReal {
    
    @Override 
    public Double GenerarResultado(){
        this.setResul(Math.pow(super.getNum1(), super.getNum2()));
        return super.getResul();
    }
    
    
}
