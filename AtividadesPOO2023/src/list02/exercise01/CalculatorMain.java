package list02.exercise01;
import java.util.Scanner;

/**
 *
 * @author Vinícius Kalach, RA: 211559  
 */
public class CalculatorMain {
    
    public static void main(String[] args) {
        // TODO code application logic here
        int i = 0;
        Scanner read = new Scanner (System.in);
        Calculator c = new Calculator();
        
        System.out.println("Digite o primeiro numero.");
        c.setNum1(Integer.parseInt(read.nextLine()));
        System.out.println("Digite o segundo numero.");
        c.setNum2(Integer.parseInt(read.nextLine()));
                
        while (i != 5){
            System.out.println("");
            System.out.println("---Selecao---");
            System.out.println("Digite: ");
            System.out.println("1 - para somar.");
            System.out.println("2 - para subtrair.");
            System.out.println("3 - para multiplicar.");
            System.out.println("4 - para dividir.");
            System.out.println("5 - sair.");
            System.out.println("----------");
            System.out.println("");
            i = Integer.parseInt(read.nextLine());
            
            switch (i) {
                case 1:
                    System.out.println("A soma deles será: " + c.soma(c.getNum1(), c.getNum2()));
                    break;
                case 2:
                    System.out.println("A subtração deles será: " + c.sbutracao(c.getNum1(), c.getNum2()));
                    break;
                case 3:
                    System.out.println("A multiplicação deles será: " + c.multiplicacao(c.getNum1(), c.getNum2()));
                    break;
                case 4:
                    System.out.println("A divisão deles será: " + c.divisao(c.getNum1(), c.getNum2()));
                    break;
                case 5:
                    System.out.println("Saindo.");
                    break;
                default:
                    System.out.println("Erro: opção inválida.");
            }
        }
            
        }
        
    
}
