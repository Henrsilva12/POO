
package Cardiaco;
import javax.swing.JOptionPane;
public class HeartRates {
    
    private String nome;
    private String sobreNome;
    private String dataNasc;
    private int idade;
    private int maxima;

    public HeartRates(String nome, String sobreNome, int dia, int mes, int ano){
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.dataNasc = dia+"/"+mes+"/"+ano;
    }

   
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String DataNasc) {
        this.dataNasc = DataNasc;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getMaxima() {
        return maxima;
    }

    public void setMaxima() {
        this.maxima = 220 - maxima;
    }
    
    public Double setCardiacaAlvo(){
       Double media = this.maxima*0.65;
        return media;
    }
    
    public String HeartRates(){
       JOptionPane.showMessageDialog(null, "Nome : "+getNome()+"\nSobrenome : "+getSobreNome()+
               "\nData de Nascimento : "+getDataNasc()+"\nIdade : "+getIdade()+"\nFrequência Máxima : "+getMaxima()+
               "\nIntervalo Frequência Alvo : "+setCardiacaAlvo());
       return null;
    }
    
    
}
