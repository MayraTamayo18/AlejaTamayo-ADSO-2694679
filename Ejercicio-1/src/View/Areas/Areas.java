/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View.Areas;

import Class.Areas.Triangulo;
import Class.Areas.Cuadrado; 
import Class.Areas.Pentagono; 
import Class.Areas.Retangulo; 
import Class.Areas.Rombo;
import Class.Areas.Circulo;
import Class.Areas.Trapecio; 
import Class.CapturaNumero;
import Class.Areas.Cubov;
import Class.Areas.Esferav;
import Class.Areas.Cilindrov; 
import Class.Areas.Conov; 

/**
 *
 * @author Maira Alejandra
 */
public class Areas {
    
     public static void main(String[] args) {
        //objeto para capturar datos 
        CapturaNumero x = new CapturaNumero();
        
        //hallar area del triangulo 
    Triangulo  triangulo = new Triangulo();
    x.setMensaje("Digite el valor de la base del triangulo");
    triangulo.setBase(x.Capturar());
    x.setMensaje("Digite el valor de la altura del trinagulo");
    triangulo.setAltura(x.Capturar());
    System.out.println("el area del triangulo es: "+triangulo.Area());
        
        // hallar area de un  Cuadrado 
    Cuadrado cuadrado  = new Cuadrado();
    x.setMensaje("Digite el valor de el primer lado del cuadrado ");
    cuadrado.setLado1(x.Capturar());
    x.setMensaje("Digite el valor de  el segundo lado del cuadrado");
    cuadrado.setLado2(x.Capturar());
    System.out.println("el area del cuadrado es:  "+cuadrado.Area());
    
    // hallar area de un pentagono 
    Pentagono pentagono  = new Pentagono ();
    x.setMensaje("Digite el valor de la apotema  del pentagono");
    pentagono.setApotema(x.Capturar());
    x.setMensaje("Digite el valor de el perimetro del pentagono");
    pentagono.setPerimetro(x.Capturar());
    System.out.println("el area del pentagono  es:  "+pentagono.Area());
    
    // hallar area de un rectangulo 
    Retangulo rectangulo  = new Retangulo();
    x.setMensaje("Digite el valor de la base del rectangulo ");
    rectangulo.setBase(x.Capturar());
    x.setMensaje("Digite el valor de la altura del rectangulo");
    rectangulo.setBase(x.Capturar());
    System.out.println("el area del cuadrado es:  "+rectangulo.Area());
    
      // hallar area de un rombo
    Rombo rombo  = new Rombo();
    x.setMensaje("Digite el valor de la primera diagonal  del rombo ");
    rombo.setDiagonal1(x.Capturar());
    x.setMensaje("Digite el valor de la segunda diagonal de rombo ");
    rombo.setDiagonal2(x.Capturar());
    System.out.println("el area del cuadrado es:  "+rombo.Area());
    
    
    // hallar area de un circulo
    Circulo  circulo  = new Circulo();
    x.setMensaje("Digite el numero pi  ");
    circulo.setPi(x.Capturar());
    x.setMensaje("Digite el valor de el radio de el circulo  ");
    circulo.setRadio(x.Capturar());
    System.out.println("el area  del circulo  es:  "+circulo.Area());
      
    // hallar area de un Trapecio
     Trapecio trapecio = new Trapecio();
    x.setMensaje("Digite el valor de la logitud de la primera base  ");
    trapecio.setBase1(x.Capturar());
    x.setMensaje("Digite el valor de la logitud de la segunda base  ");
    trapecio.setBase2(x.Capturar());
    System.out.println("el area  del trapecio  es:  "+trapecio.Area());
    
    
    //hallar volumen de cubo 
    Cubov  cubo = new Cubov();
    x.setMensaje("Digite el valor de la base de el cubo  ");
    cubo.setBase(x.Capturar());
    x.setMensaje("Digite el valor de la profundidad de el cubo  ");
    cubo.setProfundidad(x.Capturar());
    x.setMensaje("Digite el valor de la altura de el cubo  ");
    cubo.setAltura(x.Capturar());
    System.out.println("el area  del trapecio  es:  "+cubo.Volumen());
    
    //hallar volumen de la esfera
     Esferav esfera = new Esferav();
    x.setMensaje("Digite el valor del numero pi  ");
    esfera.setPi(x.Capturar());
    x.setMensaje("Digite el valor el radio de la esfera ");
    esfera.setRadio(x.Capturar());
    System.out.println("el area  del trapecio  es:  "+esfera.Volumen());
    
    //hallar volumen de el cilindro
     Cilindrov cilindro = new Cilindrov();
    x.setMensaje("Digite el valor del numero pi  ");
    cilindro.setPi(x.Capturar());
    x.setMensaje("Digite el valor el radio de la esfera ");
    cilindro.setRadio(x.Capturar());
    x.setMensaje("Digite el valor de la altura ");
    cilindro.setAltura(x.Capturar());
    System.out.println("el area  del trapecio  es:  "+cilindro.Volumen());
    
    
    //hallar volumen de la cono
     Conov cono = new Conov();
    x.setMensaje("Digite el valor del numero pi  ");
    cono.setPi(x.Capturar());
    x.setMensaje("Digite el valor el radio de la esfera ");
    cono.setRadio(x.Capturar());
     x.setMensaje("Digite el valor de la altura ");
    cilindro.setAltura(x.Capturar());
    System.out.println("el area  del trapecio  es:  "+cono.Volumen());
}
}

