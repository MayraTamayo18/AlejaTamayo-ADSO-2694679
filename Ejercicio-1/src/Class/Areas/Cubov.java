/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class.Areas;

/**
 *
 * @author Maira Alejandra
 */
public class Cubov extends Volumen{
    
    private Double base; 
    private Double profundidad;
    private Double altura; 

    public Double getBase() {
        return base;
    }
    
    public void setBase(Double base) {
        this.base = base;
    }

    public Double getProfundidad() {
        return profundidad;
    }
    
    public void setProfundidad(Double profundidad) {
        this.profundidad = profundidad;
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
       volumen = (this.getBase()*this.getProfundidad()*this.getAltura()); 
       this.setVolumen(volumen); 
       
      return this.getVolumen(); 
      
    }
    
    
}
