public class Ejercicio_10 { 
   public static void main(String[] args) { 
    // TODO code application logic here 
     Formulario form = new Formulario(); 
     form.setVisible(true); 
  } 
} 
package Ejercicio_10; 
public class Formulario extends javax.swing.JFrame { 
public Formulario() { 
initComponents(); 
} 
private void bntCalcularActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here: 
        String numeroInscripcion = txtInscripcion.getText(); 
        String nombres = txtNombres.getText(); 
        double patrimonio = Double.parseDouble(txtPatrimonio.getText()); 
        int estrato = Integer.parseInt(txtEstratoSocial.getText()); 
         
        double pagoMatricula = 50000; 
         
        if (patrimonio > 2000000 && estrato > 3){ 
            pagoMatricula += patrimonio * 0.03; 
        } 
        txtPagoxMatricula.setText (String.valueOf(pagoMatricula)); 
    }                                            
 
    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) 
{                                           
        // TODO add your handling code here: 
        txtEstratoSocial.setText (""); 
        txtInscripcion.setText (""); 
        txtNombres.setText(""); 
        txtPatrimonio.setText (""); 
        txtPagoxMatricula.setText (""); 
    }                                          
 
    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) 
{                                          
        // TODO add your handling code here: 
        System.exit(0); 
    } 
// Variables declaration - do not modify                      
    private javax.swing.JButton bntCalcular; 
    private javax.swing.JButton btnBorrar; 
    private javax.swing.JButton btnSalir; 
    private javax.swing.JLabel jLabel1; 
    private javax.swing.JLabel jLabel2; 
    private javax.swing.JLabel jLabel3; 
    private javax.swing.JLabel jLabel4; 
    private javax.swing.JLabel jLabel5; 
    private javax.swing.JLabel jLabel6; 
    private javax.swing.JTextField txtEstratoSocial; 
    private javax.swing.JTextField txtInscripcion; 
    private javax.swing.JTextField txtNombres; 
    private javax.swing.JTextField txtPagoxMatricula; 
    private javax.swing.JTextField txtPatrimonio; 
    // End of variables declaration                    
} 
