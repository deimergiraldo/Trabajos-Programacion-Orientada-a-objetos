public class Ejercicio_19 {

    public static void main(String[] args) {
    Formulario form = new Formulario(); 
        form.setVisible(true); 
    } 
}

package Ejercicio_19; 
 
 
public class Formulario extends javax.swing.JFrame { 
 
     
    public Formulario() { 
        initComponents(); 
    } 
 
 
private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here: 
        double lado,altura,area,perimetro; 
         
        lado = Double.parseDouble(txtLado.getText()); 
         
        altura = (lado*Math.sqrt(3))/2; 
        area = (Math.pow(lado, 2)*Math.sqrt(3))/4; 
        perimetro = 3*lado; 
         
        txtAltura.setText(String.valueOf(altura)); 
        txtArea.setText(String.valueOf(area)); 
        txtPerimetro.setText(String.valueOf(perimetro)); 
         
    }                                            
 
    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) 
{                                           
        // TODO add your handling code here: 
        txtLado.setText (""); 
        txtAltura.setText (""); 
txtArea.setText(""); 
txtPerimetro.setText (""); 
}                                          
private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) 
{                                          
// TODO add your handling code here: 
System.exit(0); 
}                     
public static void main(String args[]) { 
java.awt.EventQueue.invokeLater(new Runnable() { 
public void run() { 
new Formulario().setVisible(true); 
} 
}); 
} 
// Variables declaration - do not modify                      
private javax.swing.JButton btnBorrar; 
private javax.swing.JButton btnCalcular; 
private javax.swing.JButton btnSalir; 
private javax.swing.JLabel jLabel1; 
private javax.swing.JLabel jLabel2; 
private javax.swing.JLabel jLabel3; 
private javax.swing.JLabel jLabel4; 
private javax.swing.JTextField txtAltura; 
private javax.swing.JTextField txtArea; 
private javax.swing.JTextField txtLado; 
private javax.swing.JTextField txtPerimetro; 
// End of variables declaration   
}
