/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class.Areas;

/**
 *
 * @author Maira Alejandra
 */
public class Rombo extends Area {
    
   private  Double diagonal1; 
   private Double diagonal2; 
    
    public Double getDiagonal1(){
        return diagonal1; 
    }
    
    public void setDiagonal1(Double diagonal1 ){
    this.diagonal1 = diagonal1; 
}
    public Double getDiagonal2(){
        return diagonal2; 
    }
    
public void setDiagonal2(Double diagonal2){
    this.diagonal2 = diagonal2; 
}

@Override 

public Double Area(){
       double area; 
       area = (this.getDiagonal1()*getDiagonal2())/2; 
       this.setArea(area); 
       
      return this.getArea(); 
      
   }
}
    
