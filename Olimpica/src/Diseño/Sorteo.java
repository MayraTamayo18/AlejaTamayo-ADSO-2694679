/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Diseño;
import java.util.ArrayList;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Maira Alejandra
 */
public class Sorteo extends javax.swing.JFrame {

    public Sorteo() {
      initComponents();
        this.setLocationRelativeTo(this);
         SetImageLabel(jLabel2, "src/Imagen/IC1.png");
         SetImageLabel(jLabel3, "src/Imagen/sorteo.png");
         SetImageLabel(jLabel4, "src/Imagen/Premios.png");
         
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtganador = new javax.swing.JTextPane();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(250, 177, 69));

        jLabel1.setText("el ganador es: ");

        jScrollPane1.setViewportView(txtganador);

        jButton1.setText("Regresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Girar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(151, 151, 151))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(220, 220, 220))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(162, 162, 162))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(349, 349, 349))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(74, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Principal encuesta =new Principal();
        
        encuesta.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       ArrayList palabras = new ArrayList();
       
         palabras.add("nombre: johan Mauricio, apellido: calderon , telefono: 3123456346, Barrio: el pinal ");
         palabras.add("nombre: Juan Jose , apellido: Pérez García , telefono: 3123456789, Barrio: calle 3 N° 9-60 ");
         palabras.add("nombre: María Angelica , apellido: Rodríguez López, telefono: 3674912740, Barrio: calle 6 N° 7-10 ");
         palabras.add("nombre: Carlos, apellido: Martínez González , telefono: 3102039404 , Barrio: calle 5  N° 9-10");
         palabras.add("nombre: Laura, apellido: López Pérez , telefono: 3201569256, Barrio: calle 8  N° 1-43  ");
         palabras.add("nombre: Andrés, apellido: Sánchez  Rodríguez , telefono: 3106243681, Barrio: calle 7 N° 12-34 ");
         palabras.add("nombre:Ana , apellido: González Martínez , telefono: 3201364893 , Barrio: calle 2  N° 1-57");
         palabras.add("nombre:David , apellido: Fernández López, telefono: 31293652749 , Barrio: calle 4  N° 4-56  ");
         palabras.add("nombre:Carmen , apellido: Pérez Martínez, telefono: 3128375106, Barrio:  calle 7 N° 10-40");
         palabras.add("nombre:Luis , apellido: García Rodríguez , telefono:3201634817 , Barrio: calle 8 N° 9-70");
         palabras.add("nombre:Isabel , apellido: Torres González , telefono:3102538159 , Barrio: calle 10 N° 90-56 ");
         palabras.add("nombre:Pablo , apellido: Ramírez López , telefono: 3132653890, Barrio: calle 12 N° 43-80 ");
         palabras.add("nombre: Maria Isabel , apellido: Perdomo Castro , telefono:3124528369, Barrio: calle 23 N°89-56 ");
         palabras.add("nombre: Ana Milena, apellido: Perdomo Perdomo, telefono: 3142467467 , Barrio:  calle 11 N°34-67");
         palabras.add("nombre: Sergio , apellido: Hernández  , telefono: 3201639457 , Barrio:  calle  19  N° 12-45 ");
         palabras.add("nombre: Silvia, apellido: Pérez, telefono: 3102678394 , Barrio: calle 13  N°22-67 ");
         palabras.add("nombre:José , apellido: Jiménez , telefono: 3127836910 , Barrio: calle  16 N°56-78 ");
         palabras.add("nombre:Carolina , apellido: González Sánchez, telefono: 3206751489, Barrio: 19  N° 12-45 ");
         palabras.add("nombre:Carlos , apellido: García López , telefono: 3120256382 , Barrio: calle 20 N° 23-4 ");
         palabras.add("nombre:Fernando, apellido: López González, telefono:3125273891 , Barrio: calle 21 N° 67-9 ");
         palabras.add("nombre: Susana, apellido: Sánchez García , telefono: 3201725378 , Barrio: calle 4 N° 17-88 ");
         palabras.add("nombre: Laura , apellido: Martínez López , telefono: 3201735648, Barrio: calle 2 N° 1-80");
         palabras.add("nombre: Daniel , apellido: García García , telefono: 13253850637 , Barrio: calle 8 N° 4-9 ");
         palabras.add("nombre: Raquel, apellido: López Polanco, telefono: 32194628302, Barrio:calle 10 N° 13-14");
         palabras.add("nombre: Miguel, apellido: Sánchez Duran, telefono: 1234567890, Barrio: calle 11 N° 14-15");
         palabras.add("nombre: Patricia, apellido: Rodríguez Artunduaga, telefono: 3102635479, Barrio: calle 33 N° 4-8 ");
         palabras.add("nombre: Elena , apellido: Martínez  Morales, telefono: 32917325945, Barrio: calle 9 N° 9-9");
         palabras.add("nombre: Sofía , apellido: González Ampar , telefono: 3120162538 , Barrio: calle 15 N° 6-1 ");
         palabras.add("nombre: Luis , apellido: Perdomo Castro, telefono: 3132637819 , Barrio: calle 2 N° 5-67");
         palabras.add("nombre: Adriana , apellido: Covaleda Fierro, telefono: 3145257892 , Barrio: calle 77 N° 89-9 ");
         palabras.add("nombre: Diego , apellido: Trujillo Perdomo , telefono: 31263819357 , Barrio: calle 55 N° 14-66");
         palabras.add("nombre: Paula , apellido: Tamayo Fierro , telefono: 356839065 , Barrio: calle 34 N° 12-48");
         palabras.add("nombre: Javier, apellido: Morea Trujillo, telefono: 3102645389 , Barrio: calle 1 N° 23-74"); 
         palabras.add("nombre: Isabel , apellido: Flores lizarazo , telefono: 3127253678 , Barrio: calle 88 N° 2-44 ");  
         palabras.add("nombre:Juan David, apellido: Montialegre collazos, telefono: 3201725378 , Barrio: calle 45 N° 25-50");       
         palabras.add("nombre:Maria Andrea , apellido: Gonzales Moreno , telefono: 3201725378, Barrio: calle 18 N° 4-5 ");
         palabras.add("nombre:Natalia , apellido: Vargas Peña , telefono: 3220152789, Barrio: calle 18 N° 3-8"); 
         palabras.add("nombre:Ricardo , apellido: Quintero Epia , telefono:  3102738491, Barrio: calle 2 N° 54-75 ");
         palabras.add("nombre:Ximena, apellido: Cheverry Cabrera, telefono: 3129468104 , Barrio: calle 19 N° 33-8 ");
         palabras.add("nombre: Mayra, apellido: Cordoba , telefono: 312839167 , Barrio: calle 20 N° 15-12 ");
         palabras.add("nombre: Angie, apellido: Peña García , telefono: 1283652794 , Barrio: calle 30 N° 11-79");
         palabras.add("nombre: mara lucia , apellido: Cedeño Cedeño, telefono: 345678423, Barrio: calle 36 N° 61-89");
         palabras.add("nombre:Maria Fernanda , apellido: Velandia Tamayo , telefono: 3129036478 , Barrio: calle 66 N° 22-89 ");
         palabras.add("nombre: Oliva, apellido: Perdomo Abella , telefono: 12839208 , Barrio: calle 22 N° 10-90 ");
         palabras.add("nombre: Gildardo , apellido: Perez Monje , telefono:  3201725628, Barrio: calle 77 N° 9-9 ");
         palabras.add("nombre: Jasmin, apellido: Aguja Guevara , telefono: 3201736489, Barrio: calle 97 N° 94-23");
         palabras.add("nombre:Dana , apellido: Ramirez Trujillo , telefono: 3128367890, Barrio: calle 32 N° 56-78");
         palabras.add("nombre: Melissa , apellido: Castro Zanches, telefono: 126378491 , Barrio: calle 26 N° 36-76 ");
         palabras.add("nombre: Jhors, apellido: Carvajal Perdomo , telefono: 310901393 , Barrio: calle 40 N° 11-11 ");
         palabras.add("nombre: Camilo, apellido: Manchola García  , telefono: 312030192 , Barrio: calle 50 N° 50-15");
        
         
          
        
        

        int a = (int) (Math.random()*3);
        
        this.txtganador.setText(palabras.get(a)+"");
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Sorteo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sorteo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sorteo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sorteo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sorteo().setVisible(true);
            }
        });
    }
    
   private void SetImageLabel(JLabel labelName, String root) {
        ImageIcon image = new ImageIcon(root);
        Icon icon = new ImageIcon(
                image.getImage().getScaledInstance(labelName.getWidth(), labelName.getHeight(), Image.SCALE_DEFAULT));
        labelName.setIcon(icon);
        this.repaint();
   }
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane txtganador;
    // End of variables declaration//GEN-END:variables
}
