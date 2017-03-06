package practica2;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class PanelPrincipal extends javax.swing.JFrame {

    public PanelPrincipal() {
        initComponents();
    }    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCola = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnLista = new javax.swing.JButton();
        btnPila = new javax.swing.JButton();
        btnMatriz = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        btnCola.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cola.png"))); // NOI18N
        btnCola.setAlignmentY(0.0F);
        btnCola.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnCola.setBorderPainted(false);
        btnCola.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCola.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnColaActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/menu.png"))); // NOI18N

        btnLista.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lista.png"))); // NOI18N
        btnLista.setAlignmentY(0.0F);
        btnLista.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnLista.setBorderPainted(false);
        btnLista.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnLista.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListaActionPerformed(evt);
            }
        });

        btnPila.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Pila.png"))); // NOI18N
        btnPila.setAlignmentY(0.0F);
        btnPila.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnPila.setBorderPainted(false);
        btnPila.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnPila.setHideActionText(true);
        btnPila.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPila.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPilaActionPerformed(evt);
            }
        });

        btnMatriz.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/matriz.png"))); // NOI18N
        btnMatriz.setAlignmentY(0.0F);
        btnMatriz.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnMatriz.setBorderPainted(false);
        btnMatriz.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnMatriz.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMatriz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMatrizActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnLista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCola, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnMatriz, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPila, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnLista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMatriz, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCola, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPila, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnColaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnColaActionPerformed
       Cola ver = new Cola();        
        ver.setVisible(true);
        ver.setLocationRelativeTo(null); 
        this.dispose();  
    }//GEN-LAST:event_btnColaActionPerformed

    private void btnListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListaActionPerformed
        Lista ver = new Lista();        
        ver.setVisible(true);
        ver.setLocationRelativeTo(null); 
        this.dispose();                
    }//GEN-LAST:event_btnListaActionPerformed

    private void btnPilaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPilaActionPerformed
        Pila ver = new Pila();        
        ver.setVisible(true);
        ver.setLocationRelativeTo(null); 
        this.dispose();            
    }//GEN-LAST:event_btnPilaActionPerformed

    private void btnMatrizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMatrizActionPerformed
        
    }//GEN-LAST:event_btnMatrizActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        cerrar();
    }//GEN-LAST:event_formWindowClosing

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
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PanelPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCola;
    private javax.swing.JButton btnLista;
    private javax.swing.JButton btnMatriz;
    private javax.swing.JButton btnPila;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
