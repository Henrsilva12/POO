
package Exerc;
import javax.swing.JOptionPane;
public class EmployeeTest {

    
    public static void main(String[] args) {
        
        Employee e1 = new Employee("Henrique", "Santos", 1380);
        
        JOptionPane.showMessageDialog(null,"Nome: " + e1.getNome() + "\nSobrenome: " + e1.getSobrenome() + "\nSalário Mensal: " 
                + e1.getSalario() + "\nSalário Anual: " + e1.getSalario_anual() + "\nSalario com aumento: " + e1.getSalario_Aumento());
    
    }
    
}
