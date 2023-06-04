
package Bicicleta;
import javax.swing.JOptionPane;
public class Principal {

   
    public static void main(String[] args) {
        
        Bike b1 = new Bike();
      
        b1.setCor("Pink");
        b1.setMarca("Caloi");
        b1.setAno(2002);
        b1.setVelocidade(8);
        b1.setReducaoVel();
       
        JOptionPane.showMessageDialog(null, "A cor é "+b1.getCor()+"\n"+"A marca é "+b1.getMarca()+"\n"+"O ano é "
                +b1.getAno()+ "\nSua velocidade era "+b1.getVelocidade()+"\n Velocidade atual "+b1.getReducaoVeloc());

    }
    }
   
