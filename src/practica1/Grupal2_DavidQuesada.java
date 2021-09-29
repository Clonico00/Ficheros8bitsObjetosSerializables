
package practica1;

import java.io.*;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.table.DefaultTableModel;

public class Grupal2_DavidQuesada extends javax.swing.JFrame {

    public Grupal2_DavidQuesada() {
        initComponents();
    }

    @SuppressWarnings("unchecked")

    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Explorar archivos");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setBackground(new java.awt.Color(153, 153, 153));
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(38, 38, 38)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 647, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(260, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(63, 63, 63)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(82, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        //Boton que abre el explorador de archivos
            JFileChooser jfc = new JFileChooser();
            int seleccion = jfc.showOpenDialog(this);
            if ( seleccion == JFileChooser.APPROVE_OPTION){
                ruta = jfc.getSelectedFile().getPath();
                jLabel1.setText(ruta);
                 file = new File(ruta);
            }
        
            //Condicional si el fichero no es nulo
            if(file!=null){
            DefaultTableModel modelo= (DefaultTableModel) this.jTable1.getModel();
            try{

                //Abrimos el flujo de lectura
                FileInputStream fis = new FileInputStream(ruta);
                ObjectInputStream ois = new ObjectInputStream(fis);

                ArrayList<Manga> lManga = new ArrayList<>();

                //Creamos el objeto que contendrá el objeto que leeremos
                Object o1 =ois.readObject();

                //Control para que mientras el objeto tenga datos,siga leyendolo
                while(o1 != null){
                    //Control para que el objeto leido sea una instancia del objeto que hemos creado nosotros
                    if(o1 instanceof Manga) {
                        //Añadimos los datos del objeto al Arraylist que hemos creado anteriormente
                         lManga.add(new Manga(((Manga) o1).getId(),((Manga) o1).getNombre(),((Manga) o1).getPrecio(),((Manga) o1).getFechaPublicacion(),((Manga) o1).getNumeroCapitulos(),((Manga) o1).getNombreAutor()));
                    }
                    //Indicamos que vuelva a leer el objeto en caso de que siga conteniendo datos
                    o1=ois.readObject();
                }

                //Creamos el Arraylist que contendrá los datos de nuestra tabla
                ArrayList<Object[]> arrayDatos = new ArrayList<>();


                //LLenamos de datos el Arraylist
                for(Manga manga :lManga){
                    arrayDatos.add(new Object[]{manga.getId(),manga.getNombre(),manga.getPrecio(),manga.getFechaPublicacion(),manga.getNumeroCapitulos(),manga.getNombreAutor()});
                }

                //Añadimos la fila a la tabla
                for(Object[] dato :arrayDatos){
                    modelo.addRow(dato);
                }


                //Cerramos el Stream
                ois.close();


            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }

            this.jTable1.setModel(modelo);
            }
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
      
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Grupal2_DavidQuesada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Grupal2_DavidQuesada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Grupal2_DavidQuesada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Grupal2_DavidQuesada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Grupal2_DavidQuesada().setVisible(true);
            }
        });
    }

    private String ruta;
    private File file;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
