/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

/**
 *
 * @author Maira Alejandra
 */
public class Circulo  implements Figura{
    private double radio; 
    
    public Circulo(double radio){
        this.radio = radio; 
    }
    @Override
    public Double CalcularArea(){
        return Math.PI * radio * radio; 
    }
}
