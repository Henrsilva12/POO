
package Exerc;
import javax.swing.JOptionPane;
public class Principal {

  
    public static void main(String[] args) {
        
        Invoice i1 = new Invoice("784-415","xxxx",2,87.79);
        
            JOptionPane.showMessageDialog(null,"Numero: " + i1.getNum() + "\nDescrição: " + i1.getDesc() + 
               "\nQuantidade: " + i1.getQt()+ "\nPreço: " + i1.getPreco() + "\nResultado: " + i1.getInvoiceAmount());
    }
    
    
}
