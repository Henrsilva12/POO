
package EmployeeTest;
import javax.swing.JOptionPane;
public class Principal {

  
    public static void main(String[] args) {
       Employee e1 = new Employee("Henrique","Santos",1380.00);
       Employee e2 = new Employee("Lux","Alcântra",13.800);
       
       JOptionPane.showMessageDialog(null,"Empregado 1: " + e1.getNome() + "\nSobrenome: " + e1.getSobre_nome() + "\nSalario Mensal: " + e1.getSalario_mensal());
       JOptionPane.showMessageDialog(null,"Empregado 2: " + e2.getNome() + "\nSobrenome: " + e2.getSobre_nome() + "\nSalario Mensal: " + e2.getSalario_mensal());
       
       
       
       
    }
    
}
