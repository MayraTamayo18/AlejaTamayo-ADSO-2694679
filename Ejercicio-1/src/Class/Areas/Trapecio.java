/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class.Areas;

/**
 *
 * @author Maira Alejandra
 */
public class Trapecio extends Area{
    
    private Double base1;
    private Double base2;
    private Double altura;

    public Double getBase1() {
        return base1;
    }
    
    public void setBase1(Double base1) {
        this.base1 = base1;
    }


    public Double getBase2() {
        return base2;
    }
    
    public void setBase2(Double base2) {
        this.base2 = base2;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }
    
    @Override 
    public Double Area(){
       double area; 
       area = (this.getBase1()+this.getBase2()*this.getAltura())/2; 
       this.setArea(area); 
       
      return this.getArea(); 
      
    }
    
}
