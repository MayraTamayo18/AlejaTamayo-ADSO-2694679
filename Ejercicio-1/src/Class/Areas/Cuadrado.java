/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class.Areas;

/**
 *
 * @author Maira Alejandra
 */
public class Cuadrado  extends Area{
    
    private Double lado1; 
    private Double lado2; 
    
    public Double getLado1(){
        return lado1; 
    }
    
    public void setLado1 (Double lado1){
        this.lado1 = lado1;
    }
    
    public Double getLado2(){
        return lado2; 
    }
    
    public void setLado2(Double lado2){
        this.lado2 = lado2; 
        
    }
    
    @Override
    
    public Double Area(){
        double area; 
        area= (this.getLado1()*getLado2()); 
        
        this.setArea(area);
        
        return this.getArea(); 
        
        
    }
}
    
    
    

