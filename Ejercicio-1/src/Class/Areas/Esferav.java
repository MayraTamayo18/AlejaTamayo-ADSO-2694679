/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class.Areas;

/**
 *
 * @author Maira Alejandra
 */
public class Esferav extends Volumen {
    
    private Double pi; 
    private  Double radio;

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
    
    @Override 
    public Double Volumen(){
       double volumen; 
       volumen = (4/3*this.getPi()*Math.pow(radio, 3)); 
       this.setVolumen(volumen); 
       
      return this.getVolumen(); 
      
    }
    
    
}
