/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class.Areas;

/**
 *
 * @author Maira Alejandra
 */
public class Pentagono extends Area {
    
    private Double apotema; 
    private Double perimetro; 
    
    public Double getApotema(){
        return apotema; 
    }
    
    public void setApotema(Double apotema){
        this.apotema = apotema;  
    }
    
    public Double getPerimetro(){
        return perimetro; 
    }
    
    public void setPerimetro(Double perimetro){
        this.perimetro = perimetro; 
    }
    
    @Override 
    public Double Area(){
       double area; 
       area = (this.getApotema()*getPerimetro())/2; 
       this.setArea(area); 
       
      return this.getArea(); 
    
}
}