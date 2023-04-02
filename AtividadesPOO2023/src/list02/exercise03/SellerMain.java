package list02.exercise03;

import java.util.Scanner;

/**
 *
 * @author Vinícius Kalach, RA: 211559
 */
public class SellerMain {

    public static void main(String[] args) {
        // TODO code application logic here
        int i = 0;
        Scanner read = new Scanner(System.in);
        Seller s = new Seller();
        double saleValue = 0;
        double discountValue = 0;
        
        while (i != 3){
            System.out.println("");
            System.out.println("---Menu---");
            System.out.println("Digite: ");
            System.out.println("1 - cadastrar vendedor.");
            System.out.println("2 - calcular comissão.");
            System.out.println("3 - sair.");
            System.out.println("----------");
            System.out.println("");
            i = Integer.parseInt(read.nextLine());
            
            switch (i) {
                case 1:
                    System.out.println("Digite o código.");
                    s.setCode(Integer.parseInt(read.nextLine()));
                    System.out.println("Digite o nome.");
                    s.setName(read.nextLine());
                    System.out.println("Digite o percentual de comissão.");
                    s.setcPercentage(read.nextDouble());
                    System.out.println("Digite o valor da venda.");
                     saleValue = Integer.parseInt(read.nextLine());
                    System.out.println("Digite o valor do desconto.");
                     discountValue = Integer.parseInt(read.nextLine());
                    break;
                case 2:
                    System.out.println(s.imprimir(saleValue, discountValue));
                    break;
                case 3:
                    System.out.println("Saindo.");
                    break;
                default:
                    System.out.println("Erro: opção inválida.");
            }
        }
        
        read.close();
    }
    
}
