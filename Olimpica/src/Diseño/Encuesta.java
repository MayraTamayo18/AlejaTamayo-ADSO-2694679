/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Diseño;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jcald
 */
public class Encuesta extends javax.swing.JFrame {
      
 DefaultTableModel modelo=new DefaultTableModel();
 
 public void CargaAutomatica(){
     ArrayList<Object>nombrecolumna = new ArrayList<Object>();
     nombrecolumna.add("Nombre");
     nombrecolumna.add("Apellido");
     nombrecolumna.add("Telefono");
     nombrecolumna.add("Dirección");
     nombrecolumna.add("Artista");
     nombrecolumna.add("Canciones");
     nombrecolumna.add("Color Boleta");
     nombrecolumna.add("Numero Boleta");
     for (Object columna : nombrecolumna) {
         modelo.addColumn(columna);
     }
     this.tabladatos.setModel(modelo);
      
     
     ArrayList<Object[]>datos = new ArrayList<>();
     Object[]informacion1=new Object[]{"johan Mauricio","calderon","3123456346","el pinal","Bad bunny","Amorfoda-OjitosLindos-MePortoBonito","Rojo","1"};
     Object[]informacion2=new Object[]{"Juan Jose","Pérez García","3123456789","calle 3 N° 9-60"," Shakira ","WakaWaka -Hips Don't Lie-Tortura","Azul","2"};
     Object[]informacion3=new Object[]{"María Angelica","Rodríguez López","3674912740","calle 6 N° 7-10","Juanes ","pidoaDios -CamisaNegra -Enamora","Amarillo","3"};
     Object[]informacion4=new Object[]{"Carlos","Martínez González","3102039404","calle 5  N° 9-10","Carlos Vives  ","LaBicicleta  -VolvíaNacerDéjame -Entrar","Verde","4"};
     Object[]informacion5=new Object[]{"Laura","López Pérez","3201569256","calle 8  N° 1-43","J Balvin  ","MiGente -AyVamos-Rojo","Naranja","5"};
     Object[]informacion6=new Object[]{"Andrés","Sánchez  Rodríguez","3106243681","calle 7 N° 12-34","Maluma  ","Feliceslos4 -Hawái -Corazón","Violeta","6"};
     Object[]informacion7=new Object[]{"Ana","González Martínez","3201364893","calle 2  N° 1-57","Juan Gabrie ","Querida-AsíFue-AmorEterno ","Rosa","7"};
     Object[]informacion8=new Object[]{"David","Fernández López","31293652749","calle 4  N° 4-56'","Andrés Cepeda "," LoMejorQueHayenMiVida -DíaTrasDía-Bandido ","Blanco","8"};
     Object[]informacion9=new Object[]{"Carmen","Pérez Martínez","3128375106","calle 7 N° 10-40","Fanny ","NoTePidoFlores-TúNoEresParaMi-Celos","Negro","9"};
     Object[]informacion10=new Object[]{"Luis","García Rodríguez","3201634817","calle 8 N° 9-70","Sebastián Yatra ","Traicionera -RobarteUnBeso -UnAño","Gris","10"};
     Object[]informacion11=new Object[]{"Isabel","Torres González","3102538159","calle 10 N° 90-56","KarolG  ","Bichota -Tusa -AhoraMeLlama","Marrón","11"};
     Object[]informacion12=new Object[]{"Pablo","Ramírez López","3132653890","calle 12 N° 43-80","Piso21  ","MeLlamas -TeVi -DéjalaQueVuelva","Marrón","12"};
     Object[]informacion13=new Object[]{"Maria Isabel","Perdomo Castro","3124528369","calle 23 N°89-56","Adriana ","PorroBonito -Cedro -NadaSirve","Celeste","13"};
     Object[]informacion14=new Object[]{"Ana Milena","Perdomo Perdomo","3142467467","calle 11 N°34-67","Manuel  ","BajoelAgua -UnayOtra -VezSiPudiera","Coral","14"};
     Object[]informacion15=new Object[]{"Sergio","Hernández ", "3201639457","calle  19  N° 12-45","Vicente Fernández  ","Volver -PorTuMalditoAmor -Rey","Beige","15"};
     Object[]informacion16=new Object[]{"Silvia","Pérez","3102678394","calle 13  N°22-67","Selena  ","BidiBidiBomBom -DreamingofYou -ComolaFlor ","Dorado","16"}; 
     Object[]informacion17=new Object[]{"José","Jiménez","3127836910","calle 16 N°56-78","Taylor  ","SwiftLove -StoryBlank -Shake","Plateado","17"};
     Object[]informacion18=new Object[]{"Carolina","González Sánchez","3206751489","calle  19  N° 12-45","Justin Bieber ","Peaches -StoryBlank -Shake","Índigo","18"};
     Object[]informacion19=new Object[]{"Carlos","García López","3120256382","calle 20 N° 23-4","Fonseca  ","NoTePidoFlores -EresMiSueño-Arroyito ","Lavanda","19"};
     Object[]informacion20=new Object[]{"Fernando","López González","3125273891","calle 21 N° 67-9","Taylor  ","Cardigan-Willow-The1","Aguamarina","20"};
     Object[]informacion21=new Object[]{"Susana","Sánchez García","3201725378"," calle 4 N° 17-88","Justin Bieber  ","Sorry -Baby -Love","Magenta","21"};
     Object[]informacion22=new Object[]{"Laura","Martínez López","3201735648"," calle 2 N° 1-80","Madonna ","LikeaVirgin-LikeaPrayer-Vogue","Cian","22"};
     Object[]informacion23=new Object[]{"Daniel","García García","13253850637"," calle 8 N° 4-9","Rihanna ","Work-OnlyGirl -Umbrella","Caqui","23"};
     Object[]informacion24=new Object[]{"Raquel","López Polanco","32194628302"," calle 10 N° 13-14","Bad bunny","AmorFoda-elApagon-VeranoSinTi","Lavanda","24"};
     Object[]informacion25=new Object[]{"Miguel","Sánchez Duran","1234567890"," calle 11 N° 14-15","Andrés Cepeda ","enOtraVida-tengoGanas-besosUsados","Añil","25"};
     Object[]informacion26=new Object[]{"Patricia","Rodríguez Artunduaga","3102635479"," calle 33 N° 4-8","Bob Dylan ","LikeRollingStone-Blowin'inthe -TheTimes ","Verde esmeralda","26"};
     Object[]informacion27=new Object[]{"Elena","Martínez  Morales","32917325945"," calle 9 N° 9-9","Andrés Cepeda ","besosUsados-voyaExtrañarte-dueles","Caoba","27"};
     Object[]informacion28=new Object[]{"Sofía","González Ampar","3120162538"," calle 15 N° 6-1","Bad bunny ","Amorfoda-OjitosLindos-MePortoBonito","Marfil","28"};
     Object[]informacion29=new Object[]{"Luis","Perdomo Castro","3132637819"," calle 2 N° 5-67","Eminem ","LoseYourself-Stan-LoveTheWayYou ","Coral","29"};
     Object[]informacion30=new Object[]{"Adriana","Covaleda Fierro","3145257892"," calle 77 N° 89-9","Badbunny ","Amorfoda-laUltimaVez-MePortoBonito","Ámbar","30"};
     Object[]informacion31=new Object[]{"Diego","Trujillo Perdomo","31263819357"," calle 55 N° 14-66","Bad bunny","efecto-OjitosLindos-","Escarlata","31"};
     Object[]informacion32=new Object[]{"Paula","Tamayo Fierro","356839065"," calle 34 N° 12-48","Katy Perry ","Firework-Roar-California ","Malva","32"};
     Object[]informacion33=new Object[]{"Javier","Morea Trujillo","3102645389"," calle 1 N° 23-74","Andrés Cepeda ","besosUsados-magia-DiaTrasDia","Oro rosa","33"};
     Object[]informacion34=new Object[]{"Isabel","Flores lizarazo","3127253678"," calle 88 N° 2-44","The Beatles ","HeyJude-LetItBe-Yesterday","Verde oliva","34"};
     Object[]informacion35=new Object[]{"Juan David","Montialegre collazos","3201725378"," calle 45 N° 25-50","David Bowie ","SpaceOddity-Heroes-Let'sDance","Lima","35"};
     Object[]informacion36=new Object[]{"Maria Andrea","Gonzales Moreno","3201725378"," calle 18 N° 4-5","Lady Gaga ","PokerFace-BadRomance-BornThisWay","Gris perla","36"};
     Object[]informacion37=new Object[]{"Natalia"," Vargas Peña","3220152789"," calle 18 N° 3-8","Bad bunny ","Amorfoda-SiEstivieramos-AmorFoda","Aguamarina","37"};
     Object[]informacion38=new Object[]{"Ricardo","Quintero Epia","3102738491"," calle 2 N° 54-75","Fede ","XX-siTeLaEncuentrasPorAhi-X19X","Lavanda","38"};
     Object[]informacion39=new Object[]{"Ximena","Cheverry Cabrera","3129468104"," calle 19 N° 33-8","Katy Perry ","Firework-Roar-California ","Fucsia","39"};
     Object[]informacion40=new Object[]{"Mayra","Cordoba ","312839167"," calle 20 N° 15-12","Elton John ","RocketMan-YourSong-Candle ","Verde manzana","40"};
     Object[]informacion41=new Object[]{"Angie","Peña García","1283652794"," calle 30 N° 11-79","Coldplay ","FixYou-VivalaVida-Yellow","Azul zafiro","41"};
     Object[]informacion42=new Object[]{"mara lucia ","Cedeño Cedeño","345678423"," calle 36 N° 61-89","Prince ","PurpleRain-WhenDovesCry-Kiss","Azul zafiro","42"};
     Object[]informacion43=new Object[]{"Maria Fernanda","Velandia Tamayo","3129036478"," calle 66 N° 22-89","Bad bunny","Amorfoda-soyPeor-UnCoco","Terracota","43"};
     Object[]informacion44=new Object[]{"Oliva","Perdomo Abella","12839208"," calle 22 N° 10-90","Fanny Lu ","Celos-DonJuan-Fanfarrón","Granate","44"};
     Object[]informacion45=new Object[]{"Gildardo","Perez Monje","3201725628"," calle 77 N° 9-9","Piso21 ","DejándonosLlevar-BesosenGuerra-Adrenalina","Verde limón","45"};
     Object[]informacion46=new Object[]{"Jasmin","Aguja Guevara","3201736489"," calle 97 N° 94-23","Rihanna ","Umbrella-Diamonds-WeFoundLove","Melocotón","46"};
     Object[]informacion47=new Object[]{"Dana","Ramirez Trujillo","3128367890"," calle 32 N° 56-78","Fonseca ","Prometo-VineaBuscarte-SiTeAcuerdasdeMi","Azul marino","47"};
     Object[]informacion48=new Object[]{"Melissa","Castro Zanches","126378491"," calle 26 N° 36-76","Madonna ","LikeaVirgin-LikeaPrayer-Vogue","Amarillo canario","48"};
     Object[]informacion49=new Object[]{"Jhors","Carvajal Perdomo","310901393"," calle 40 N° 11-11","KarolG ","UnderneathYourClothes-Loca-WakaWaka","Café","49"};
     Object[]informacion50=new Object[]{"Camilo","Manchola García","312030192"," calle 50 N° 50-15","Selena ","Loca-BailaEstaCumbia-NoMeQuedaMás","Cereza","50"};
     
     datos.add(informacion1);
    datos.add(informacion2);
    datos.add(informacion3); 
    datos.add(informacion4); 
    datos.add(informacion5); 
    datos.add(informacion6); 
    datos.add(informacion7); 
    datos.add(informacion8); 
    datos.add(informacion9); 
    datos.add(informacion10); 
    datos.add(informacion11); 
    datos.add(informacion12); 
    datos.add(informacion13); 
    datos.add(informacion14); 
    datos.add(informacion15); 
    datos.add(informacion16); 
    datos.add(informacion17); 
    datos.add(informacion18); 
    datos.add(informacion19); 
    datos.add(informacion20); 
    datos.add(informacion21); 
    datos.add(informacion22); 
    datos.add(informacion23); 
    datos.add(informacion24); 
    datos.add(informacion25); 
    datos.add(informacion26); 
    datos.add(informacion27); 
    datos.add(informacion28); 
    datos.add(informacion29); 
    datos.add(informacion30); 
    datos.add(informacion31); 
    datos.add(informacion32); 
    datos.add(informacion33); 
    datos.add(informacion34); 
    datos.add(informacion35); 
    datos.add(informacion36); 
    datos.add(informacion37); 
    datos.add(informacion38); 
    datos.add(informacion39);
    datos.add(informacion40); 
    datos.add(informacion41);
    datos.add(informacion42);
    datos.add(informacion44); 
    datos.add(informacion43); 
    datos.add(informacion44); 
    datos.add(informacion45); 
    datos.add(informacion46); 
    datos.add(informacion47); 
    datos.add(informacion48);
    datos.add(informacion49);
    datos.add(informacion50); 
    
         
     for (Object []DatoPersonal : datos) {
         modelo.addRow(DatoPersonal);
     }
     tabladatos.setModel(modelo);
     this.txtcantidad.setText(datos.size()+"");
 }
         
    /**
     * Creates new form Encuesta
     */
    public Encuesta() {
        initComponents();
        CargaAutomatica();
      
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
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabladatos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtcantidad = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(250, 185, 86));

        jButton1.setText("Regresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tabladatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tabladatos);

        jLabel1.setText("Cantidad de Personas:");

        jScrollPane2.setViewportView(txtcantidad);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(117, 117, 117)
                        .addComponent(jButton1))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1153, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Principal encuesta =new Principal();
        
        encuesta.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Encuesta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Encuesta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Encuesta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Encuesta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Encuesta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabladatos;
    private javax.swing.JTextPane txtcantidad;
    // End of variables declaration//GEN-END:variables

   
}
