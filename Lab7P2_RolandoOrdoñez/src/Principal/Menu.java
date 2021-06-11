/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import java.util.ArrayList;

/**
 *
 * @author Rolando
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jd_crear_artista = new javax.swing.JDialog();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jToolBar1 = new javax.swing.JToolBar();
        jb_agregar = new javax.swing.JButton();
        jb_editar = new javax.swing.JButton();
        jb_eliminar = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();

        jd_crear_artista.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nombre:");
        jd_crear_artista.getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        jTextField1.setBackground(new java.awt.Color(255, 255, 255));
        jTextField1.setForeground(new java.awt.Color(0, 0, 0));
        jd_crear_artista.getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 80, -1));

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Publicacion:");
        jd_crear_artista.getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));
        jd_crear_artista.getContentPane().add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, -1, -1));

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Genero:");
        jd_crear_artista.getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        jTextField2.setBackground(new java.awt.Color(255, 255, 255));
        jTextField2.setForeground(new java.awt.Color(0, 0, 0));
        jd_crear_artista.getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 80, -1));

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Formato:");
        jd_crear_artista.getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Productor");
        jd_crear_artista.getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

        jTextField3.setBackground(new java.awt.Color(255, 255, 255));
        jTextField3.setForeground(new java.awt.Color(0, 0, 0));
        jd_crear_artista.getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 80, -1));

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setSelected(true);
        jRadioButton1.setText("Digital");
        jd_crear_artista.getContentPane().add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, -1, -1));

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Fisico");
        jd_crear_artista.getContentPane().add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, -1, -1));

        jButton1.setText("Crear Album");
        jd_crear_artista.getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Principal/amarillo-1200x839.png"))); // NOI18N
        jd_crear_artista.getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 300));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jToolBar1.setRollover(true);

        jb_agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Principal/add-file.jpg"))); // NOI18N
        jb_agregar.setFocusable(false);
        jb_agregar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jb_agregar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jb_agregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_agregarMouseClicked(evt);
            }
        });
        jToolBar1.add(jb_agregar);

        jb_editar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Principal/edit_file.jpg"))); // NOI18N
        jb_editar.setFocusable(false);
        jb_editar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jb_editar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jb_editar);

        jb_eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Principal/delete_file.jpg"))); // NOI18N
        jb_eliminar.setFocusable(false);
        jb_eliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jb_eliminar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jb_eliminar);

        getContentPane().add(jToolBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 40));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Principal/color_verde.jpg"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb_agregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_agregarMouseClicked
        // TODO add your handling code here:
        jd_crear_artista.setModal(true);
        jd_crear_artista.pack();
        jd_crear_artista.setLocationRelativeTo(this);
        jd_crear_artista.setVisible(true);
    }//GEN-LAST:event_jb_agregarMouseClicked

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    ArrayList<album> albumes = new ArrayList();
    ArrayList<cancion> canciones = new ArrayList();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JButton jb_agregar;
    private javax.swing.JButton jb_editar;
    private javax.swing.JButton jb_eliminar;
    private javax.swing.JDialog jd_crear_artista;
    // End of variables declaration//GEN-END:variables
}
