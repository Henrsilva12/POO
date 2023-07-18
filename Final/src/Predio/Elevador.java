
package Predio;

import javax.swing.JOptionPane;

public class Elevador {
    
    private int AndarAtual;
    private int TotalAndares;
    private int Capacidade;
    private int Quant_Pessoas;
    
    public Elevador(){
        
    }

    public Elevador(int AndarAtual, int TotalAndares, int Capacidade, int Quant_Pessoas) {
        this.AndarAtual = 0;
        this.TotalAndares = TotalAndares;
        this.Capacidade = Capacidade;
        this.Quant_Pessoas = Quant_Pessoas;
    }

    public int getAndarAtual() {
        return AndarAtual;
    }

    public void setAndarAtual(int AndarAtual) {
        this.AndarAtual = AndarAtual;
    }

    public int getTotalAndares() {
        return TotalAndares;
    }

    public void setTotalAndares(int TotalAndares) {
        this.TotalAndares = TotalAndares;
    }

    public int getCapacidade() {
        return Capacidade;
    }

    public void setCapacidade(int Capacidade) {
        this.Capacidade = Capacidade;
    }

    public int getQuant_Pessoas() {
        return Quant_Pessoas;
    }

    
    public void setQuant_Pessoas(int Quant_Pessoas) {
        this.Quant_Pessoas = Quant_Pessoas;
    }
    
    public void Inicializar(int capacidadeElev, int totalAndares){
        this.TotalAndares = totalAndares;
        this.Capacidade = capacidadeElev;
    }
    
    public void Entrar(){
        
        if(this.Capacidade > this.Quant_Pessoas){
            this.Quant_Pessoas++;
        }
        else{
            JOptionPane.showMessageDialog(null,"O elevador está cheio! Por favor aguarde alguém descer.");
        }
    }
    
    public void sair(){
        
        if(this.Quant_Pessoas >= 1){
            this.Quant_Pessoas--;
        }
        else{
            JOptionPane.showMessageDialog(null,"O elevador está vazio! Não pode retirar ninguém porque ninguém está lá!");
        }
    }
    
    public void Subir(){
        
        if(this.AndarAtual < this.TotalAndares){
            this.AndarAtual++;
        }
        else{
            JOptionPane.showMessageDialog(null,"O elevador está no ultimo andar! Você só pode descer.");
        }
    }
    
    public void Descer() {
        
      if(this.AndarAtual > 1){
            this.AndarAtual--;
        }else{
            JOptionPane.showMessageDialog(null,"O elevador está no terreo! Você só pode subir.");
      }
    }
    
    public int andar(){
        return this.AndarAtual;
    }
    public int pessoas(){
        return this.Quant_Pessoas;
    }
}    
