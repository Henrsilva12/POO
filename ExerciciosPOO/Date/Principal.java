
package Dataa;
import javax.swing.JOptionPane;
public class Principal {

   
    public static void main(String[] args) {
        
        Date d1 =  new Date(12,06,2000);
        
        JOptionPane.showMessageDialog(null,"Data: " + d1.getDia() + "/" + d1.getMes() + "/" + d1.getAno());
        
    }
    
}
