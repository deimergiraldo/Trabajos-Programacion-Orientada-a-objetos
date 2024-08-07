public class Ejercicio_7 { 
 
     
    public static void main(String[] args) { 
        // TODO code application logic here 
        Formulario form = new Formulario(); 
        form.setVisible(true); 
    } 
     
} 
 
package Ejercicio_7; 
 
 
public class Formulario extends javax.swing.JFrame { 
 
     
    public Formulario() { 
        initComponents(); 
    } 
private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here: 
        double a,b; 
        a = Double.parseDouble(txtA.getText()); 
        b = Double.parseDouble(txtB.getText ()); 
         
        if (a > b) { 
            txtResultado.setText ("A es mayor que B"); 
        } 
        else if (a == b ) { 
            txtResultado.setText ("A es igual a B"); 
        } 
        else { 
            txtResultado.setText ("A es menor a B") ; 
        } 
         
    }                                            
 
    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) 
{                                           
        // TODO add your handling code here: 
        txtA.setText (""); 
        txtB.setText (""); 
        txtResultado.setText(""); 
    }                                          
private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) 
{                                          
// TODO add your handling code here: 
System.exit(0); 
}                                    
// Variables declaration - do not modify                      
private javax.swing.JButton btnBorrar; 
private javax.swing.JButton btnCalcular; 
private javax.swing.JButton btnSalir; 
private javax.swing.JLabel jLabel1; 
private javax.swing.JLabel jLabel2; 
private javax.swing.JLabel jLabel3; 
private javax.swing.JLabel jLabel4; 
private javax.swing.JTextField txtA; 
private javax.swing.JTextField txtB; 
private javax.swing.JTextField txtResultado; 
// End of variables declaration                    
} 
