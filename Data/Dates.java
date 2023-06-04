
package Data;
import javax.swing.JOptionPane;
public class Dates {
    
    private int mes;
    private int dia;
    private int ano;
//Ver Interfaces Gráficas
    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    public void displayDate(){
        JOptionPane.showMessageDialog(null,+dia + "/" +mes + "/" +ano);
    }
}
