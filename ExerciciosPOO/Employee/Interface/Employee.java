
package ExercEmployee;

import javax.swing.JOptionPane;

public class Employee {
     
    
    private String nome;
    private String sobrenome;
    private double salario;

//    public Employee(String nome, String sobrenome, double salario) {
//        this.nome = nome;
//        this.sobrenome = sobrenome;
//        if(salario > 0){
//             this.salario = salario;
//        }      
//    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if(salario < 0){
            JOptionPane.showMessageDialog(null,"Não pode configurar salário, pois ele é negativo");
        } else{
            this.salario = salario;
        } 
    }
    public  double getSalario_anual(){
        return salario * 12;
    }

    public double getSalario_Aumento(){
        return salario * 0.1 + salario;
    }
}
