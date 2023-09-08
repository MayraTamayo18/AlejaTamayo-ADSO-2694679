/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class.Areas;

/**
 *
 * @author Maira Alejandra
 */
public class Conov extends Volumen{
    
    private Double pi; 
    private Double radio; 
    private Double Altura;

    public Double getPi() {
        return pi;
    }

    public void setPi(Double pi) {
        this.pi = pi;
    }
    
    public Double getRadio() {
        return radio;
    }
    
     public void setRadio(Double radio) {
        this.radio = radio;
    }


    public Double getAltura() {
        return Altura;
    }
    public void setAltura(Double Altura) {
        this.Altura = Altura;
    }
    
   @Override 
    public Double Volumen(){
       double volumen; 
       volumen = (this.getPi()*Math.pow(radio, 2)*this.getAltura()/3); 
       this.setVolumen(volumen); 
       
      return this.getVolumen(); 
      
    }  
    
}
