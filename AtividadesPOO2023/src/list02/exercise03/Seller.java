package list02.exercise03;

/**
 *
 * @author Vinícius Kalach, RA: 211559
 */
public class Seller {
    
    private int code;
    private String name;
    private double cPercentage;
    
    public Seller(){
        
    }
    
    public Seller(int code, String name, double cPercentage) {
        this.code = code;
        this.name = name;
        this.cPercentage = cPercentage;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getcPercentage() {
        return cPercentage;
    }

    public void setcPercentage(double cPercentage) {
        this.cPercentage = cPercentage;
    }
    
    public double calcularPagamentoComissao(double valorVenda) {
        return valorVenda * cPercentage/100;
    }
    
    public double calcularPagamentoComissao(double valorVenda, double desconto) {
        return calcularPagamentoComissao(valorVenda) - desconto;
    }
    
    public String imprimir(double valorVenda, double desconto) {
        return "\nCódigo: " + code   + 
                "\nNome: " + name +
                "\nValor Venda: " + valorVenda + 
                "\n% Comissao: " + cPercentage + 
                "\nDesconto: " + desconto + 
                "\nValor a pagar: " + calcularPagamentoComissao(valorVenda, desconto);
    }
   
}
