/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import Class.CapturaNumero; 

/**
 *
 * @author Maira Alejandra
 */
public class Tienda {
    
    public static void main(String[] args){
        // Los Aprendices de la ficha 79 fin de semana, desea sober el porcentaje
        // de los que aprobaron
        // se sabe que aprueba con 70 o más
        
        Integer cantidad, i, contarApr, contarDes; 
        Double porApr, porDes, nota;
        
        CapturaNumero cap= new CapturaNumero(); 
        
        cap.setMensaje("Digite la capacidad de Aprendices:  ");
        cantidad = cap.Capturar().intValue(); 
        
        i=0;
        contarApr=0;
        contarDes=0; 
        while (i<cantidad){
            nota=0.0;
            i++;
            do{
                cap.setMensaje("Digite nota del aprendiz "+i+": ");
                nota = cap.Capturar(); 
            } while (nota<=0 || nota >100);
            
            if(nota>=70){
                contarApr++;
            }else{
                contarDes++;
            }
        }
        
        porApr = (double)(contarApr*100/cantidad);
        porDes = (double)(contarDes*100/cantidad);
        
        System.out.println("De "+cantidad+" aprobó %"+porApr);
        System.out.println("De "+cantidad+" desaprobó %"+porDes);
        
    }
    
}
