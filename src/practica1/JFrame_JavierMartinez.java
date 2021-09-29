package practica1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;  
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;

public class JFrame_JavierMartinez extends javax.swing.JFrame {
    //creamos el arraylist para almacenar objetos de la clase manga
    ArrayList <Manga> mangas = new ArrayList <Manga> ();
    Manga manga;
    //declaramos variables
    protected int id,numeroCapitulos,existe;
    protected String nombre,nombreAutor,fileName;
    protected double precio;
    
    private MaskFormatter mascara;
    
    //constructor JFrame
    public JFrame_JavierMartinez() {
        initComponents();
    }
    //metodo para buscar que el id introducido, y saber si esta ya en el arraylist o no
    public int comprobacionID(int id){
        for(int i = 0; i < mangas.size(); i++){
            manga = mangas.get(i);
            if(id==manga.getId()){
                return i;
            }
        }
        return -1;
    }
    
    //metodo para habilitar los campos del jframe
    public void habilitarCampos(){
        idField.setEnabled(false);
        nombreField.setEnabled(true);
        precioField.setEnabled(true);
        nCapField.setEnabled(true);
        nomAutorField.setEnabled(true);
        fechaField.setEnabled(true);
        arrayListButton.setEnabled(true);
        fileButton.setEnabled(true);
        }
    //metodo para habilitar los campos del jframe   
    public void deshabilitarCampos(){
        idField.setEnabled(true);
        idField.setText("");
        nombreField.setText("");
        precioField.setText("");
        nCapField.setText("");
        nomAutorField.setText("");
        fechaField.setText("");
                
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        idLabel = new javax.swing.JLabel();
        nombreLabel = new javax.swing.JLabel();
        precioLabel = new javax.swing.JLabel();
        nCapLabel = new javax.swing.JLabel();
        nombAutorLabel = new javax.swing.JLabel();
        idField = new javax.swing.JFormattedTextField();
        nombreField = new javax.swing.JFormattedTextField();
        precioField = new javax.swing.JFormattedTextField();
        nCapField = new javax.swing.JFormattedTextField();
        nomAutorField = new javax.swing.JFormattedTextField();
        arrayListButton = new javax.swing.JButton();
        fileButton = new javax.swing.JButton();
        fechaField = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        fileLabel = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        fileNameField = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu Principal");
        setBackground(java.awt.Color.gray);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        idLabel.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        idLabel.setText("ID");

        nombreLabel.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        nombreLabel.setText("Nombre");

        precioLabel.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        precioLabel.setText("Precio");

        nCapLabel.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        nCapLabel.setText("Numero de Capitulos");

        nombAutorLabel.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        nombAutorLabel.setText("Nombre del Autor");

        try {
            idField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        idField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                idFieldFocusLost(evt);
            }
        });
        idField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idFieldActionPerformed(evt);
            }
        });

        nombreField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreFieldActionPerformed(evt);
            }
        });

        try {
            precioField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        precioField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precioFieldActionPerformed(evt);
            }
        });

        try {
            nCapField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        arrayListButton.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        arrayListButton.setText("Añadir al ArrayList");
        arrayListButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arrayListButtonActionPerformed(evt);
            }
        });

        fileButton.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        fileButton.setText("Generar Fichero");
        fileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileButtonActionPerformed(evt);
            }
        });

        fechaField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel1.setText("Fecha Publicacion");

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 2, 13)); // NOI18N
        jLabel2.setText("Ej:(01)");

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 2, 13)); // NOI18N
        jLabel3.setText("Ej:(Juan Moreno)");

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 2, 13)); // NOI18N
        jLabel4.setText("Ej:(12.95)");

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 2, 13)); // NOI18N
        jLabel5.setText("Ej:(020)");

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 2, 13)); // NOI18N
        jLabel6.setText("Ej:(Jose Alberto12)");

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 2, 13)); // NOI18N
        jLabel7.setText("Ej:(12/12/2021)");

        fileLabel.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        fileLabel.setText("Nombre del fichero");

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 2, 13)); // NOI18N
        jLabel8.setText("Ej:(Fichero1)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(nombreLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(precioLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nombAutorLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nCapLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                            .addComponent(idLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(arrayListButton))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(fileLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(fileButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(fileNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(precioField, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fechaField, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nomAutorField, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nCapField, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nombreField, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(28, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idLabel)
                    .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreLabel)
                    .addComponent(nombreField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(precioLabel)
                    .addComponent(precioField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nCapLabel)
                    .addComponent(nCapField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombAutorLabel)
                    .addComponent(nomAutorField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fechaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(29, 29, 29)
                .addComponent(arrayListButton)
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fileLabel)
                    .addComponent(jLabel8)
                    .addComponent(fileNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addComponent(fileButton)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nombreFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreFieldActionPerformed

    private void precioFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precioFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_precioFieldActionPerformed

    private void idFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idFieldActionPerformed
             
    }//GEN-LAST:event_idFieldActionPerformed
//metodo para que cuando el focus se pierda, compruebe si el id esta vacio, y si no lo esta, llama al metodo comprobarId
    private void idFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_idFieldFocusLost
       try{
           if(idField.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null,"ID no puede quedarse vacio","ERROR", 0);
            idField.setText("");
            idField.requestFocus();
        }else{
            id = Integer.valueOf(idField.getText());
            existe = comprobacionID(id);
            if(existe == -1){
                habilitarCampos();
            }else{
                JOptionPane.showMessageDialog(null," El ID introducido ya existe, introduzca uno nuevo","ERROR", 0);
                 idField.setText("");
                 idField.requestFocus();
            }
        }
       }catch(Exception e){
            System.out.println("error");
       } 
        
    }//GEN-LAST:event_idFieldFocusLost
//metodo que controla que todos los campos esten rellenos y de ser asi, los guarda en el arrayList
    private void arrayListButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arrayListButtonActionPerformed
        // TODO add your handling code here:
        if(nombreField.getText().isEmpty()||precioField.getText().isEmpty()||nCapField.getText().isEmpty()||
           nomAutorField.getText().isEmpty()|| fechaField.getText().isEmpty()){
            
            JOptionPane.showMessageDialog(null,"Por favor, rellene todos los campos","ERROR", 0);
        }else{
            manga = new Manga();
            id = Integer.parseInt(idField.getText());
            manga.setId(id);
            
            nombre = nombreField.getText();
            manga.setNombre(nombre);
            
            precio = Double.parseDouble(precioField.getText());
            manga.setPrecio(precio);
            
            numeroCapitulos = Integer.parseInt(nCapField.getText());
            manga.setNumeroCapitulos(numeroCapitulos);
            
            nombreAutor = nomAutorField.getText();
            manga.setNombreAutor(nombreAutor);
            //creo un string para guardar el valor del jformattedfield,
            //luego lo convierte a tipo Date y lo formatea con SimpleDateFormat cambiandolo de string a Date
            String fechas = fechaField.getText();
            try {
                Date fecha=new SimpleDateFormat("dd/MM/yy").parse(fechas);
                manga.setFechaPublicacion(fecha);
                mangas.add(manga);
                JOptionPane.showMessageDialog(null,"Datos guardados correctamente","Correcto", 1);
                //cuando se guardan en el arraylist llama a deshabilitarCampos para borrar todo y que solo te deje meter el id de primeras
                deshabilitarCampos();

            } catch (ParseException ex) {
                Logger.getLogger(JFrame_JavierMartinez.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_arrayListButtonActionPerformed
//metodo que me crea un objeto de FileOutputStream con el nombre recogido de fileNameField que es guardado en una variable tipo string y 
//esta se pone en la direccion donde crear el fichero, te obligara a introducir un nombre para generar el fichero
//luego le paso este objeto a la clase ObjectOutputStream para asi poder mandar al arraylist al fichero 
    private void fileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileButtonActionPerformed
        try {
            String fileName = fileNameField.getText();

            if(fileName.isEmpty()){
                JOptionPane.showMessageDialog(null,"Introduzca un nombre de fichero","Error", 2);
                nombreField.requestFocus();
            }else{
                FileOutputStream out = new FileOutputStream(".\\"+fileName+".dat");
                ObjectOutputStream oos = new ObjectOutputStream(out); 
                oos.writeObject(mangas);
                oos.flush();
                JOptionPane.showMessageDialog(null,"Fichero creado correctamente","Creado", 1);
            }
            
            

        } catch (FileNotFoundException ex) {
            Logger.getLogger(JDialog.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(JDialog.class.getName()).log(Level.SEVERE, null, ex);
        }

               
    }//GEN-LAST:event_fileButtonActionPerformed

    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame_JavierMartinez().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton arrayListButton;
    private javax.swing.JFormattedTextField fechaField;
    private javax.swing.JButton fileButton;
    private javax.swing.JLabel fileLabel;
    private javax.swing.JFormattedTextField fileNameField;
    private javax.swing.JFormattedTextField idField;
    private javax.swing.JLabel idLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JFormattedTextField nCapField;
    private javax.swing.JLabel nCapLabel;
    private javax.swing.JFormattedTextField nomAutorField;
    private javax.swing.JLabel nombAutorLabel;
    private javax.swing.JFormattedTextField nombreField;
    private javax.swing.JLabel nombreLabel;
    private javax.swing.JFormattedTextField precioField;
    private javax.swing.JLabel precioLabel;
    // End of variables declaration//GEN-END:variables
}
