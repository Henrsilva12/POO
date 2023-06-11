
package InterfaceInvoice;

public class Invoice {
    
    private String num;
    private String desc;
    private int qt;
    private double preco;

//    public Invoice(String num, String desc, int qt, double preco) {
//        this.num = num;
//        this.desc = desc;
//        this.qt = (qt>0) ? qt : 0;
//        this.preco = (preco > 0.0) ? preco : 0.0;
//    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getQt() {
        return qt;
    }

    public void setQt(int qt) {
        this.qt = (qt > 0) ? qt : 0;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = (preco > 0.0) ? preco : 0.0;
    }
    
    public double getInvoiceAmount() {
        return qt * preco;
    }
    
}
