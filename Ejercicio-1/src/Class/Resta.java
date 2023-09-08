/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

/**
 *
 * @author Maira Alejandra
 */
public class Resta extends NumeroReal{
    
    @Override 
    public Double GenerarResultado(){
        this.setResul(super.getNum1()-super.getNum2());
        return super.getResul();
    }
    
}
