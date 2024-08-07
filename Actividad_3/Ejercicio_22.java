public class Ejercicio_22 { 
      public static void main(String[] args) { 
        // TODO code application logic here 
        Formulario form = new Formulario(); 
        form.setVisible(true); 
   } 
} 
package Ejercicio 22; 
public class Formulario extends javax.swing.JFrame { 
public Formulario() { 
initComponents(); 
} 
private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {                                            
// TODO add your handling code here: 
// Obtener los datos de entrada 
String nombreEmpleado = txtNombreEmpleado.getText(); // Asume que 
tienes un JTextField txtNombreEmpleado 
double salarioPorHora = 
Double.parseDouble(txtSalarioxHora.getText()); // Asume que tienes un 
JTextField txtSalarioPorHora 
int horasTrabajadas = Integer.parseInt(txtHorasMes.getText()); // 
Asume que tienes un JTextField txtHorasTrabajadas 
double salarioMensual = salarioPorHora * horasTrabajadas; 
if (salarioMensual > 450000) { 
txtNombre.setText (nombreEmpleado); 
txtSalario.setText (String.valueOf(salarioMensual)); 
}  
else { 
txtNombre.setText (nombreEmpleado); 
} 
}                                            
private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) 
{                                           
// TODO add your handling code here: 
txtNombreEmpleado.setText (""); 
txtSalarioxHora.setText (""); 
txtHorasMes.setText(""); 
txtNombre.setText (""); 
txtSalario.setText (""); 
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
private javax.swing.JLabel jLabel6; 
private javax.swing.JTextField txtHorasMes; 
private javax.swing.JTextField txtNombre; 
private javax.swing.JTextField txtNombreEmpleado; 
private javax.swing.JTextField txtSalario; 
private javax.swing.JTextField txtSalarioxHora; 
}
