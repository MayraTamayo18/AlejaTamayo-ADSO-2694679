/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utils;

/**
 *
 * @author Maira Alejandra
 */
public class FunctionNumeric {
    
      private Double numero;
      private int  entero; 

    public int getEntero() {
        return entero;
    }

    public void setEntero(int entero) {
        this.entero = entero;
    }
      
      

    private Double getNumero() {
        return numero;
    }

    private void setNumero(Double numero) {
        this.numero = numero;
    }

    
    public Double InputNumericScanner(String mensaje) {
        InputNumeric(mensaje, 1);
        return this.getNumero();
    }

    public Double InputNumericJOptionPane(String mensaje) {
        InputNumeric(mensaje, 2);
        return this.getNumero();
    }
    
      public int  InputNumericaScanner(String mensaje) {
        InputNumerica(mensaje, 1);
        return this.getEntero();
    }

    
 // reales
    private void InputNumeric(String mensaje, int tipo) {
        Boolean validar = false;
       FunctionString fs = new FunctionString();

        //  Validar que se ingrese el dato correcto para reales  
        while (validar == false) {
            try {
                if(tipo==1){
                    this.setNumero(Double.parseDouble(fs.InputScanner(mensaje)));
                }else{
                    this.setNumero(Double.parseDouble(fs.InputJOptionPane(mensaje)));
                }
                validar = true;
            } catch (Exception e) {
                if (tipo==1) {
                    fs.ShowScanner("Ha ingresado un dato no válido. ");
                }else{
                    fs.ShowJOptionPane("Ha ingresado un dato no válido. ");
                }
            }
        }        
    }
    
// rango de reales
    public Double InputNumericRangeScanner(String mensaje, Double min, Double max) {
        do {            
            InputNumeric(mensaje,1);
        } while (this.getNumero() < min || this.getNumero() > max);
        
        return this.getNumero();
    }
      
//  para reales positivos
    public Double InputNumericPositivoScanner(String mensaje) {
          do {            
              
            InputNumeric(mensaje,1);
        } while (this.getNumero() <=0);
        
        return this.getNumero();
    }
    
//  para reales negativos
      public Double InputNumericNegativoScanner(String mensaje) {
          do {            
            InputNumeric(mensaje,1);
        } while (this.getNumero () >=0 );
        
        return this.getNumero();
    }
      
      
       // enteros 
      private void InputNumerica(String mensaje, int tipo) {
        Boolean validar = false;
       FunctionString fs = new FunctionString();

        //Validar que se ingrese el dato correcto enteros 
        while (validar == false) {
            try {
                if(tipo==1){
                    this.setNumero(Double.parseDouble(fs.InputScanner(mensaje)));
                }else{
                    this.setNumero(Double.parseDouble(fs.InputJOptionPane(mensaje)));
                }
                validar = true;
            } catch (Exception e) {
                if (tipo==1) {
                    fs.ShowScanner("Ha ingresado un dato no válido. ");
                }else{
                    fs.ShowJOptionPane("Ha ingresado un dato no válido. ");
                }
            }
        }        
    }
      
 //  rango para enteros
        public Double InputNumericEnteroRangeScanner(String mensaje, Double min, Double max) {
        do {            
            InputNumeric(mensaje,1);
        } while (this.getNumero() < min || this.getNumero() > max);
        
        return this.getNumero();
    }
      
 
// enteros positivos
       public int InputNumericaPositivoScanner(String mensaje) {
          do {            
              
            InputNumeric(mensaje,1);
        } while (this.getEntero()<0);
        
        return this.getEntero();
    }

// enteros negativos      
        public int InputNumericaNegativaScanner(String mensaje) {
          do {            
              
            InputNumeric(mensaje,1);
        } while (this.getEntero()>0);
        
        return this.getEntero();
    }     
}
    

