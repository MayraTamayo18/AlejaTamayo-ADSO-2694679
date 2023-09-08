/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity.conversionMoneda;
import Utils.FunctionNumeric;
import Utils.FunctionString; 
import Entity.Abstract.SuperEntity; 

/**
 *
 * @author Maira Alejandra
 */
public class ConversionMoneda extends SuperEntity {
    


    private Double pesoLocal;

    private Double pesoDestino;

    //Objeto de la clase FunctionNumeric
    FunctionNumeric fn = new FunctionNumeric();

    public Double getPesoLocal() {
        return pesoLocal;
    }

    public void setPesoLocal(Double pesoLocal) {
        this.pesoLocal = pesoLocal;
    }

    public Double getPesoDestino() {
        return pesoDestino;
    }

    public void setPesoDestino(Double pesoDestino) {
        this.pesoDestino = pesoDestino;
    }
    
    //Objeto de la clase FunctionString
    FunctionString fs = new FunctionString();
    
// ejercicio 1
    public void pesoColombianodolares() {        
     this.setPesoLocal(fn.InputDoubleNumericScanner("Digite el peso colombiano: "));
    this.setPesoDestino(this.getPesoLocal() * 0.0024); 
    fs.ShowScanner("La conversión de " + this.getPesoLocal() + " pesos colombianos a dólares es " + this.getPesoDestino() + "\n");
    }
    
 public void pesoColombianoBolivares() {        
     this.setPesoLocal(fn.InputDoubleNumericScanner("Digite el peso colombiano: "));
    this.setPesoDestino(this.getPesoLocal() *0.0073); 
    fs.ShowScanner("La conversión de " + this.getPesoLocal() + " pesos colombianos a bolivares es " + this.getPesoDestino() + "\n");
    }
 
 public void pesoColombianoSoles() {        
     this.setPesoLocal(fn.InputDoubleNumericScanner("Digite el peso colombiano: "));
    this.setPesoDestino(this.getPesoLocal() * 0.00091); 
    fs.ShowScanner("La conversión de " + this.getPesoLocal() + " pesos colombianos a soles es " + this.getPesoDestino() + "\n");
    }
 
public void pesoColombianoPesetas() {        
     this.setPesoLocal(fn.InputDoubleNumericScanner("Digite el peso colombiano: "));
    this.setPesoDestino(this.getPesoLocal() * 0.036784934); 
    fs.ShowScanner("La conversión de " + this.getPesoLocal() + " pesos colombianos a pesetas es " + this.getPesoDestino() + "\n");
    }
public void pesoColombianoFrancos() {        
     this.setPesoLocal(fn.InputDoubleNumericScanner("Digite el peso colombiano: "));
    this.setPesoDestino(this.getPesoLocal() *0.00021); 
    fs.ShowScanner("La conversión de " + this.getPesoLocal() + " pesos colombianos a franco es " + this.getPesoDestino() + "\n");
    }

//ejercicio 2

public void DolaresPesosColombianos() {        
     this.setPesoLocal(fn.InputDoubleNumericScanner("Digite su dolar : "));
    this.setPesoDestino(this.getPesoLocal() *4.140); 
    fs.ShowScanner("La conversión de " + this.getPesoLocal() + " Dolar  a pesos colombianos  es " + this.getPesoDestino() + "\n");
    }

public void DolaresBolivares() {        
     this.setPesoLocal(fn.InputDoubleNumericScanner("Digite su dolar : "));
    this.setPesoDestino(this.getPesoLocal() *30.07); 
    fs.ShowScanner("La conversión de " + this.getPesoLocal() + " Dolar  a Bolivares  es " + this.getPesoDestino() + "\n");
    }

public void DolaresSoles() {        
     this.setPesoLocal(fn.InputDoubleNumericScanner("Digite su dolar : "));
    this.setPesoDestino(this.getPesoLocal() *3.67); 
    fs.ShowScanner("La conversión de " + this.getPesoLocal() + " Dolar  a soles es:  " + this.getPesoDestino() + "\n");
    }

public void DolaresPesetas() {        
     this.setPesoLocal(fn.InputDoubleNumericScanner("Digite su dolar : "));
    this.setPesoDestino(this.getPesoLocal() *151.155); 
    fs.ShowScanner("La conversión de " + this.getPesoLocal() + " Dolar  a pesetas es:  " + this.getPesoDestino() + "\n");
    }
public void DolaresFrancos() {        
     this.setPesoLocal(fn.InputDoubleNumericScanner("Digite su dolar : "));
    this.setPesoDestino(this.getPesoLocal() *0.87); 
    fs.ShowScanner("La conversión de " + this.getPesoLocal() + " Dolar  a francos es:  " + this.getPesoDestino() + "\n");
    }

// ejercicio 3

public void BolivaresPesosColombianos() {        
     this.setPesoLocal(fn.InputDoubleNumericScanner("Digite su bolivar : "));
    this.setPesoDestino(this.getPesoLocal() *137.85); 
    fs.ShowScanner("La conversión de " + this.getPesoLocal() + " bolivares  a pesos colombianos  es " + this.getPesoDestino() + "\n");
    }
public void BolivaresDolares() {        
     this.setPesoLocal(fn.InputDoubleNumericScanner("Digite su bolivar : "));
    this.setPesoDestino(this.getPesoLocal() *0.033); 
    fs.ShowScanner("La conversión de " + this.getPesoLocal() + " bolivares  a Dolares  es " + this.getPesoDestino() + "\n");
    }

public void BolivaresSoles() {        
     this.setPesoLocal(fn.InputDoubleNumericScanner("Digite su bolivar : "));
    this.setPesoDestino(this.getPesoLocal() *0.12); 
    fs.ShowScanner("La conversión de " + this.getPesoLocal() + " bolivares  a soles  es " + this.getPesoDestino() + "\n");
    }
public void BolivaresPesetas() {        
     this.setPesoLocal(fn.InputDoubleNumericScanner("Digite su dolar : "));
    this.setPesoDestino(this.getPesoLocal() *0.0000000512566); 
    fs.ShowScanner("La conversión de " + this.getPesoLocal() + " bolivares  a pesetas  es " + this.getPesoDestino() + "\n");
    }
public void BolivaresFrancos() {        
     this.setPesoLocal(fn.InputDoubleNumericScanner("Digite su bolivar : "));
    this.setPesoDestino(this.getPesoLocal() *0.029); 
    fs.ShowScanner("La conversión de " + this.getPesoLocal() + " bolivar  a francos es:  " + this.getPesoDestino() + "\n");
    }

// ejercicio 4

public void SolesPesosColombianos() {        
     this.setPesoLocal(fn.InputDoubleNumericScanner("Digite su soles : "));
    this.setPesoDestino(this.getPesoLocal() *1.130); 
    fs.ShowScanner("La conversión de " + this.getPesoLocal() + " soles  a pesos colombianos  es " + this.getPesoDestino() + "\n");
    }
public void SolesDoleres() {        
     this.setPesoLocal(fn.InputDoubleNumericScanner("Digite su soles : "));
    this.setPesoDestino(this.getPesoLocal() *0.27); 
    fs.ShowScanner("La conversión de " + this.getPesoLocal() + " soles  a pesos dolares  es " + this.getPesoDestino() + "\n");
    }
public void SolesBolivares() {        
     this.setPesoLocal(fn.InputDoubleNumericScanner("Digite su soles : "));
    this.setPesoDestino(this.getPesoLocal() *8.20); 
    fs.ShowScanner("La conversión de " + this.getPesoLocal() + " soles  a pesos Bolivares  es " + this.getPesoDestino() + "\n");
    }
public void SolesPesetas() {        
     this.setPesoLocal(fn.InputDoubleNumericScanner("Digite su soles : "));
    this.setPesoDestino(this.getPesoLocal() *0000); 
    fs.ShowScanner("La conversión de " + this.getPesoLocal() + " soles  a pesos pesetas  es " + this.getPesoDestino() + "\n");
    }


}
