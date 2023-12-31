/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;
import java.util.Scanner; 

/**
 *
 * @author Maira Alejandra
 */
public class NotasClass {
   
 
    public void materia() {
        
       Scanner sc = new Scanner(System.in);
        System.out.println("Digite el nombre de la materia:");
        String nombreMateria = sc.next();

        // 
        int cantidadTrabajos;
        do {
            System.out.println("Escriba la cantidad de trabajos (debe ser mayor que cero):");
            cantidadTrabajos = sc.nextInt();
        } while (cantidadTrabajos <= 0);

        double valNotaTrabajos = 0;

        for (int i = 0; i < cantidadTrabajos; i++) {
            System.out.println("Escriba el valor de la nota del trabajo " + (i + 1) + ":");
            int notaTrabajo = sc.nextInt();
            valNotaTrabajos += notaTrabajo;
        }

        // 
        int cantidadExamenes;
        do {
            System.out.println("Escriba la cantidad de exámenes (debe ser mayor que cero):");
            cantidadExamenes = sc.nextInt();
        } while (cantidadExamenes <= 0);

        double valNotaExamenes = 0;

        for (int i = 0; i < cantidadExamenes; i++) {
            System.out.println("Escriba el valor de la nota del examen " + (i + 1) + ":");
            int notaExamen = sc.nextInt();
            valNotaExamenes += notaExamen;
        }

        System.out.println("Escriba el porcentaje de las notas de los trabajos (0-100):");
        double porcNotasTrabajos = sc.nextDouble() / 100;
        if (porcNotasTrabajos < 0 || porcNotasTrabajos > 1) {
            System.out.println("Porcentaje inválido, debe estar en el rango de 0 a 100.");
            return; 
        }

        System.out.println("Escriba el porcentaje de las notas de los exámenes (0-100):");
        double porcNotasExamenes = sc.nextDouble() / 100;
        if (porcNotasExamenes < 0 || porcNotasExamenes > 1) {
            System.out.println("Porcentaje inválido, debe estar en el rango de 0 a 100.");
            return; 
        }

        double promedioTrabajos = valNotaTrabajos / cantidadTrabajos;
        double promedioExamenes = valNotaExamenes / cantidadExamenes;

        double promedio1 = promedioTrabajos * porcNotasTrabajos;
        double promedio2 = promedioExamenes * porcNotasExamenes;
        double result = promedio1 + promedio2;

        System.out.println("la nota definitiva de  " + nombreMateria + " es: " + result); 
    }
}

