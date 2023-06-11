package Dataa;
import javax.swing.JOptionPane;
import javax.swing.plaf.RootPaneUI;
public class Date {
    
    private int Mes;
    private int Dia;
    private int Ano;

    public Date(int dia, int mes, int ano) {
        this.Mes = mes;
        this.Dia = dia;
        this.Ano = ano;
    }


    public int getMes() {
        return Mes;
    }

    public void setMes(int mes) {
        this.Mes = mes;
    }

    public int getDia() {
        return Dia;
    }

    public void setDia(int dia) {
        this.Dia = dia;
    }

    public int getAno() {
        return Ano;
    }

    public void setAno(int ano) {
        this.Ano = ano;
    }

    public void displayDate() {
        JOptionPane.showMessageDialog(null, +Dia + "/" + Mes + "/" + Ano);
    }
}
