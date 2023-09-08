/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class.Areas;

/**
 *
 * @author Maira Alejandra
 */
public class Cilindrov extends Volumen{
    
    private Double radio; 
    private Double altura; 
    private Double pi; 
    
    public Double getRadio() {
        return radio;
    }
    
    public void setRadio(Double radio) {
        this.radio = radio;
    }
    public Double getPi() {
        return pi;
    }


    public void setPi(Double pi) {
        this.pi =pi;
    }

    public Double getAltura() {
        return altura;
    }


    public void setAltura(Double altura) {
        this.altura = altura;
    }
    
    @Override 
    public Double Volumen(){
       double volumen; 
       volumen = (this.getPi()*Math.pow(radio, 2)*this.getAltura()); 
       this.setVolumen(volumen); 
       
      return this.getVolumen(); 
      
    }
    
}
