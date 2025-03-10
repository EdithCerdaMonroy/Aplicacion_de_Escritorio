/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.sql.Connection;//conexion a BD
import java.sql.DriverManager;//driver de conexion
import java.sql.ResultSet;//resultado final de datos
import java.sql.ResultSetMetaData;//resultado de metadatos
import java.sql.SQLException;//Tratamiento de Errros de BD SQL
import java.sql.Statement;//Generador de sentencias SQL
import java.text.SimpleDateFormat;//Formatear datos
import java.util.Date;//fecha de sistema
import javax.swing.ImageIcon;//Tratamiento de imagenes
import javax.swing.JOptionPane;//ventanas emergentes
import javax.swing.table.DefaultTableModel;//tabla de datos
public class Login extends javax.swing.JFrame {

     //clases de conexion y sus objetos

    public Connection cn;
    public Statement stmt;
    public ResultSet rs;//punto final para tratamiento de los datos

    public Login() {
        initComponents();
    }
     public void conectarBase() {
        try { //inicia try
            Class.forName("com.mysql.jdbc.Driver");
            cn = DriverManager.getConnection("jdbc:mysql://localhost/bdtramite", "adminedith", "edith123");
            JOptionPane.showMessageDialog(null, "Conexion a BD OK\n\nCerdaMonroy");
            stmt = cn.createStatement();//genera sentencias sobre objetos de base de datos
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de base de datos 1: \n" + ex);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de base de datos 2:" + e);
        }
    }//termina metodo conectar

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnPrincipal = new javax.swing.JPanel();
        jtxfUsuario = new javax.swing.JTextField();
        btnLogin = new javax.swing.JButton();
        jpwfContrasenia = new javax.swing.JPasswordField();
        jlblUsuario = new javax.swing.JLabel();
        jlblContrasenia = new javax.swing.JLabel();
        jlblNIP = new javax.swing.JLabel();
        jpwfNIP = new javax.swing.JPasswordField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TRAMITE CIUDADANO");

        jpnPrincipal.setBackground(new java.awt.Color(0, 102, 0));
        jpnPrincipal.setForeground(new java.awt.Color(255, 255, 255));

        jtxfUsuario.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jtxfUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxfUsuarioActionPerformed(evt);
            }
        });

        btnLogin.setBackground(new java.awt.Color(0, 102, 0));
        btnLogin.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("Ingresar");
        btnLogin.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnLogin.setBorderPainted(false);
        btnLogin.setOpaque(false);
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        jpwfContrasenia.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jlblUsuario.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jlblUsuario.setForeground(new java.awt.Color(255, 255, 255));
        jlblUsuario.setText("USUARIO");

        jlblContrasenia.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jlblContrasenia.setForeground(new java.awt.Color(255, 255, 255));
        jlblContrasenia.setText("CONTRASEÑA");

        jlblNIP.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jlblNIP.setForeground(new java.awt.Color(255, 255, 255));
        jlblNIP.setText("NIP");

        jpwfNIP.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jpwfNIP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jpwfNIPActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 102, 0));

        jLabel1.setBackground(new java.awt.Color(0, 102, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ACCESO (1).png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 565, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(136, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jpnPrincipalLayout = new javax.swing.GroupLayout(jpnPrincipal);
        jpnPrincipal.setLayout(jpnPrincipalLayout);
        jpnPrincipalLayout.setHorizontalGroup(
            jpnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnPrincipalLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jpnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jlblContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jtxfUsuario, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnLogin, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jpwfContrasenia, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jpnPrincipalLayout.createSequentialGroup()
                            .addComponent(jlblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(25, 25, 25))
                        .addComponent(jpwfNIP, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpnPrincipalLayout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jlblNIP)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );
        jpnPrincipalLayout.setVerticalGroup(
            jpnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnPrincipalLayout.createSequentialGroup()
                .addGroup(jpnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnPrincipalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpnPrincipalLayout.createSequentialGroup()
                        .addGap(270, 270, 270)
                        .addComponent(jlblUsuario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtxfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jlblContrasenia)
                        .addGap(18, 18, 18)
                        .addComponent(jpwfContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(jlblNIP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jpwfNIP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtxfUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxfUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxfUsuarioActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        try {
            String usuarioAcceso=this.jtxfUsuario.getText();
            String passAcceso=this.jpwfContrasenia.getText();
            String NIPAcceso=this.jpwfNIP.getText();
            boolean error=true;
            
            conectarBase();
            //busqueda de usuario
            rs=stmt.executeQuery("SELECT * FROM tusuarios");
            
            while (rs.next()== true) {                //inicia while
                if (usuarioAcceso.equals(rs.getString("usuario"))&& passAcceso.equals(rs.getString("contrasenia"))&&NIPAcceso.equals(rs.getString("nip"))) {//inicia if
                  error=false;
                  JOptionPane.showMessageDialog(null, "Bienvenida a Sistema Usuario:\n\n"+usuarioAcceso);
                  Aplicacion ventanaAplicacion=new Aplicacion();//llamada a la GUI
                  ventanaAplicacion.setVisible(true);//mostar  vetana
                  this.hide();//ocultar ventana anterior
                    
                }//termina if
            }//termina while
            if (error==true) {
                JOptionPane.showMessageDialog(null, "Error, el usuario no existe en el sistema\nVerificar."+usuarioAcceso);
            }
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error, BD validacion\n\n"+e);
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void jpwfNIPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jpwfNIPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jpwfNIPActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jlblContrasenia;
    private javax.swing.JLabel jlblNIP;
    private javax.swing.JLabel jlblUsuario;
    private javax.swing.JPanel jpnPrincipal;
    private javax.swing.JPasswordField jpwfContrasenia;
    private javax.swing.JPasswordField jpwfNIP;
    private javax.swing.JTextField jtxfUsuario;
    // End of variables declaration//GEN-END:variables
}
