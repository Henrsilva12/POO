
package EmployeeTest;
import javax.swing.JOptionPane;
public class Employee {
    
    private String nome;
    private String sobre_nome;
    private double salario_mensal;
    
    //Construtor
    public Employee(String nome, String sobrenome, double salario_mensal){
        this.nome = nome;
        this.sobre_nome = sobrenome; 
        if(salario_mensal > 0){
            this.salario_mensal = salario_mensal;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobre_nome() {
        return sobre_nome;
    }

    public void setSobre_nome(String sobre_nome) {
        this.sobre_nome = sobre_nome;
    }

    public double getSalario_mensal() {
        return salario_mensal;
    }

    public void setSalario_mensal(double salario_mensal) {
         if(salario_mensal > 0){
            this.salario_mensal = salario_mensal;
        }
    }  
    public double getAnualSalario(){
        return salario_mensal * 12;
    }     
    public void aplicacaoSalarioAcresimo(double porcentagem){
        if (porcentagem > 0) {
            double increaseAmount = salario_mensal * porcentagem / 100;
            salario_mensal += increaseAmount;
        }
    }   
    public double getAplicacao(){
        return salario_mensal;
    }
}
