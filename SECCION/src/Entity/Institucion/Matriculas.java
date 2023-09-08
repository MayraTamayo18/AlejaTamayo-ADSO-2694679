/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity.Institucion;
import Utils.FunctionNumeric;
import Utils.FunctionString;

/**
 *
 * @author Maira Alejandra
 */
public class Matriculas extends Nota {
 
    
    private String nombre; 
    private Double totalPagar; 
    private Byte CantidadUnidades;
    private Double porcentajeDescuento;
    private Nota nota; 
    private Byte reprobadas; 
    
    final Double costePreparatoria= 180.0; 
    final Double costeProfesional= 300.0; 
    

    public String getNombre() {
        return nombre;
    }

    public  void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getTotalPagar() {
        return totalPagar;
    }

    private void setTotalPagar(Double totalPagar) {
        this.totalPagar = totalPagar;
    }

    private Byte getCantidadUnidades() {
        return CantidadUnidades;
    }

    private void setCantidadUnidades(Byte CantidadUnidades) {
        this.CantidadUnidades = CantidadUnidades;
    }

    private Double getPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    private void setPorcentajeDescuento(Double porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
    }

    public Byte getReprobadas() {
        return reprobadas;
    }

    public void setReprobadas(Byte reprobadas) {
        this.reprobadas = reprobadas;
    }
    
    

    public  void  GenerarFactura () {
         this.CapturarDatos();
        if(super.getTipo().equals("preparatoria")){
            this.FacturaPreparatoria();
            this.setTotalPagar((costePreparatoria*(this.getCantidadUnidades()/5)*(1-this.getPorcentajeDescuento())));
        }else{
           this.FacturaProfesional(); 
           this.setTotalPagar((costeProfesional*(this.getCantidadUnidades()/5)*(1-this.getPorcentajeDescuento())));
        }
   
    }
    public void CapturarDatos(){
        //Objeto de la clase FunctionNumeric
    FunctionNumeric fn = new FunctionNumeric();
    
    //Objeto de la clase FunctionString
    FunctionString fs = new FunctionString();
    
    this.setNombre(fs.InputScanner("digite el nombre del estudiante:  "));
    
        do {     
            super.setTipo(fs.InputScanner("digite preparatoria / profesional:  "));
         
        } while (!(super.getTipo().equals("preparatoria") || super.getTipo().equals("profesional")));
        super.setPromedio(fn.InputDoubleNumericRangeScanner("Digite el promedio:  ", 0.0, 10.0));
        
        if(super.getPromedio()<7&& super.getTipo().equals("preparatoria")){
            this.setReprobadas(fn.InputIntegerNumericRangeScanner("digite la cantidad de materias reprobadas 0/6:  ", 0.0, 6.0).byteValue());
            
        }
    
}
    
    public void FacturaPreparatoria(){
        if(super.getPromedio()>=9.5){
            this.setPorcentajeDescuento(0.25);
            this.setCantidadUnidades((byte)55);
        }else if(super.getPromedio()>=9.0){
            this.setPorcentajeDescuento(0.1);
            this.setCantidadUnidades((byte)50);
        }else if(super.getPromedio()>7.0){
            this.setPorcentajeDescuento(0.0);
            this.setCantidadUnidades((byte)50);     
        }else if(super.getPromedio()<=7.0 && this.getReprobadas()<=3){
            this.setPorcentajeDescuento(0.0);
            this.setCantidadUnidades((byte)45);
        }else if(super.getPromedio()<=7.0 && this.getReprobadas()>3){
            this.setPorcentajeDescuento(0.0);
            this.setCantidadUnidades((byte)40);
        }
    }
    
    public void FacturaProfesional(){
        if(super.getPromedio()>=9.5){
            this.setPorcentajeDescuento(0.20);
            this.setCantidadUnidades((byte)55);
        }else if(super.getPromedio()<9.5){
            this.setPorcentajeDescuento(0.0);
            this.setCantidadUnidades((byte)55);
    }
}
}






    
        
    




