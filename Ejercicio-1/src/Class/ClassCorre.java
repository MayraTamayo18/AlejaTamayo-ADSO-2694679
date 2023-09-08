/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

/**
 *
 * @author Maira Alejandra
 */
public class ClassCorre {
    private Double tiempoLu;
    private Double tiempoMi;
    private Double timepoVi;
    private Double Promedio;

    public Double getTiempoLu() {
        return tiempoLu;
    }
    
    public void setTiempoLu(Double tiempoLu) {
        this.tiempoLu = tiempoLu;
    }


    public Double getTiempoMi() {
        return tiempoMi;
    }
    
    public void setTiempoMi(Double tiempoMi) {
        this.tiempoMi = tiempoMi;
    }

    public Double getTimepoVi() {
        return timepoVi;
    }
    
    public void setTimepoVi(Double timepoVi) {
        this.timepoVi = timepoVi;
    }


    public Double getPromedio() {
        return Promedio;
    }


    private void setPromedio(Double Promedio) {
        this.Promedio = Promedio;
    }
    
 
    
    public Double Mostrar(){
        this.setPromedio((this.getTiempoLu()+this.getTiempoMi()+this.getTimepoVi())/3);
        return this.getPromedio();
    }

    // metodo que retorna el dia que mas tardo 
    
    public String DiaMayor(){
        String mensaje=""; 
        Double diaMayor=0.0; 
        
        if(this.getTiempoLu()>diaMayor){
            diaMayor=this.getTiempoLu(); 
        }
        if(this.getTiempoMi()>diaMayor){
            diaMayor=this.getTiempoMi();
        }
        if(this.getTimepoVi()>diaMayor){
            diaMayor=this.getTimepoVi();
        }
        
        mensaje="El dia que más se tardo fue:  "+diaMayor;
        return mensaje; 
    }
        //Método que muestra cúal fue el día que menos tardp.
    public void DiaMenor(){
        Double diaMenor=9999999.0;
        String mensaje;
        
         if(this.getTiempoLu()<diaMenor){
            diaMenor=getTiempoLu();
        }
        
        if(this.getTiempoMi()<diaMenor){
            diaMenor=getTiempoMi();
        }
        
        if(this.getTimepoVi()<diaMenor){
            diaMenor=getTimepoVi();
        }
        
        mensaje = "El día más rapido fue: "+diaMenor;
        
        System.out.println(mensaje);
    }
    }
    
    
    

