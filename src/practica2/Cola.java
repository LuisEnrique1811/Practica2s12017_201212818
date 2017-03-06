
package practica2;

import com.squareup.okhttp.FormEncodingBuilder;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.RequestBody;
import com.squareup.okhttp.Response;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class Cola extends javax.swing.JFrame {

    
    public Cola() {
        initComponents();
    }

    public static OkHttpClient webClient = new OkHttpClient();
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtvalor = new javax.swing.JTextField();
        btnQ1 = new javax.swing.JButton();
        btnQ2 = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        btnGraficar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jpCola = new javax.swing.JEditorPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        txtvalor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtvalorKeyTyped(evt);
            }
        });

        btnQ1.setText("queue");
        btnQ1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQ1ActionPerformed(evt);
            }
        });

        btnQ2.setText("dequeue");
        btnQ2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQ2ActionPerformed(evt);
            }
        });

        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        btnGraficar.setText("Graficar");
        btnGraficar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGraficarActionPerformed(evt);
            }
        });

        jpCola.setContentType("text/html"); // NOI18N
        jScrollPane1.setViewportView(jpCola);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(txtvalor, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(btnQ1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btnQ2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(btnGraficar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(254, 254, 254)
                        .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtvalor, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnQ1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnQ2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGraficar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtvalorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtvalorKeyTyped
        char c=evt.getKeyChar();
        if(Character.isLetter(c)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null,"Caracter no Valido");
        }
    }//GEN-LAST:event_txtvalorKeyTyped

    private void btnQ1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQ1ActionPerformed
        String nombre = txtvalor.getText();        
        RequestBody formBody = new FormEncodingBuilder()
            .add("dato", nombre)
            .build();
            String r = getString("agregarCola_ajax", formBody); 
            System.out.println(r);        
        RequestBody formBodyA = new FormEncodingBuilder()
        .add("nombre", "1")
        .build();

        String rr = getString("crearArchivoCola", formBodyA);
        String rrr = getString("grabarArchivoCola", formBodyA);
        graphviz(rrr);
        txtvalor.setText("");
    }//GEN-LAST:event_btnQ1ActionPerformed

    private void btnQ2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQ2ActionPerformed
       String nombre = txtvalor.getText();
        
        RequestBody formBody = new FormEncodingBuilder()
            .add("dato", nombre)
            .build();
            String r = getString("eliminarCola_ajax", formBody); 
            System.out.println(r);        

        RequestBody formBodyA = new FormEncodingBuilder()
        .add("nombre", "1")
        .build();

        String rr = getString("crearArchivoCola", formBodyA);
        String rrr = getString("grabarArchivoCola", formBodyA);
        graphviz(rrr);

        txtvalor.setText("");
    }//GEN-LAST:event_btnQ2ActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        PanelPrincipal ver = new PanelPrincipal();
        ver.setVisible(true);
        ver.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnGraficarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGraficarActionPerformed
        imprimirImagenCola();
    }//GEN-LAST:event_btnGraficarActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
         cerrar();
    }//GEN-LAST:event_formWindowClosing

    
    public static String getString(String metodo, RequestBody formBody) {
        
        try {
            URL url = new URL("http://127.0.0.1:5000/" + metodo);
            Request request = new Request.Builder().url(url).post(formBody).build();
            Response response = webClient.newCall(request).execute();//Aqui obtiene la respuesta en dado caso si hayas pues un return en python
            String response_string = response.body().string();//y este seria el string de las respuesta
            return response_string;
        } catch (MalformedURLException ex) {
            java.util.logging.Logger.getLogger(practica2.Practica2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(practica2.Practica2.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }  
    
    public void cerrar(){
        Object [] opciones ={"Si","No"};
        int eleccion = JOptionPane.showOptionDialog(rootPane,
                "Cerrar Aplicación?",
                "Cerrar Aplicación",
        JOptionPane.YES_NO_CANCEL_OPTION,
        JOptionPane.QUESTION_MESSAGE,null,opciones,"Si");
        if (eleccion == JOptionPane.YES_OPTION){
            System.exit(0);
        }else{
            setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); 
        }
    }     
    
    public void graphviz(String nombreArchivo){
        try 
        {  
            String dotPath = "C:\\Program Files (x86)\\Graphviz2.38\\bin\\dot.exe";

            String fileInputPath = "C:\\Users\\l_enr\\Documents\\NetBeansProjects\\Practica2\\src\\practica2\\"+nombreArchivo+".txt";

            String fileOutputPath = "C:\\Users\\l_enr\\Documents\\NetBeansProjects\\Practica2\\src\\imagenes\\"+nombreArchivo+".png";

            String tParam = "-Tjpg";

            String tOParam = "-o";

            String[] cmd = new String[5];
            cmd[0] = dotPath;
            cmd[1] = tParam;
            cmd[2] = fileInputPath;
            cmd[3] = tOParam;
            cmd[4] = fileOutputPath;

            Runtime rt = Runtime.getRuntime();

            rt.exec( cmd );
            //System.out.println("Imagen Creada");
        } catch (Exception ex) {
        ex.printStackTrace();
        }  finally {
       
        }
    }     
    
    void imprimirImagenCola(){
        String url = "\"file:C:\\Users\\l_enr\\Documents\\NetBeansProjects\\Practica2\\src\\imagenes\\imagenCola.png\"";
        jpCola.setText("<html>\n" + "  <head>\n" +"\n" +"</head>\n"+"<body>\n"+"<img src="+url+">\n" +"</body>\n" +"</html>");
    }
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
            java.util.logging.Logger.getLogger(Cola.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cola.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cola.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cola.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cola().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGraficar;
    private javax.swing.JButton btnQ1;
    private javax.swing.JButton btnQ2;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JEditorPane jpCola;
    private javax.swing.JTextField txtvalor;
    // End of variables declaration//GEN-END:variables
}
