public class Ejercicio_23 { 
       public static void main(String[] args) { 
           // TODO code application logic here 
           Formulario form = new Formulario(); 
            form.setVisible(true); 
    } 
} 
package Ejercicio_23; 
   public class Formulario extends javax.swing.JFrame { 
     public Formulario() { 
           initComponents(); 
   } 
private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here: 
        double A = Double.parseDouble(txtA.getText()); 
        double B = Double.parseDouble(txtB.getText()); 
        double C = Double.parseDouble(txtC.getText());  
         
        //Discriminante 
        double discriminante = Math.pow(B, 2) - 4 * A * C; 
        String resultado; 
         
        if (discriminante > 0) { 
            double x1 = (-B + Math.sqrt(discriminante)) / (2 * A); 
            double x2 = (-B - Math.sqrt(discriminante)) / (2 * A); 
            resultado = "Soluciones reales y distintas: x1 = " + 
String.format("%.2f", x1) + ", x2 = " + String.format("%.2f", x2); 
        } else if (discriminante == 0) { 
            double x = -B / (2 * A); 
            resultado = "La ecuación tiene una solución real: x = " + x; 
        } else { 
            resultado = "La ecuación no tiene soluciones reales."; 
        } 
         
        txtResultado.setText(resultado); 
    }                                            
 
    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) 
{                                           
        // TODO add your handling code here: 
        txtA.setText (""); 
        txtB.setText (""); 
        txtC.setText (""); 
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
    private javax.swing.JLabel jLabel5; 
    private javax.swing.JTextField txtA; 
    private javax.swing.JTextField txtB; 
    private javax.swing.JTextField txtC; 
    private javax.swing.JTextField txtResultado; 
    //
    }
