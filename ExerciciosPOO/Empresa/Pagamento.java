
package Empresa;

public class Pagamento {
    
    private String Nome;
    private String Sexo;
    private String DataAdm;
    private double salario;
    private int filhos;

    public Pagamento(int dia, int mes, int ano, double salario) {
        this.DataAdm = dia+"/"+mes+"/"+ano;
        if(salario > 0){
          this.salario = salario; 
        } 
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public String getDataAdm() {
        return DataAdm;
    }

    public void setDataAdm(String DataAdm) {
        this.DataAdm = DataAdm;
    }
    
    public double getSalario(){
        return salario;
    }
    
    public void setSalario(double salario){
        this.salario = salario;
    }
    
    public int getFilhos(){
        return filhos;
    }
    
    public void getFilhos(int filhos){
        this.filhos = filhos;
    }
    public double getHoraExtra(){
        return salario/220;
    }
    
    public double getCreche(){
        return (salario*(5/100))*filhos;
    }
    
    public double getSalarioAnual(){
        return salario*12;
    }
}
