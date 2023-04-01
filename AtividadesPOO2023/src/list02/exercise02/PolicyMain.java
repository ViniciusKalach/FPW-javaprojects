package list02.exercise02;

import java.util.Scanner;

/**
 *
 * @author Vinícius Kalach, RA: 211559
 */
public class PolicyMain {

    public static void main(String[] args) {
        // TODO code application logic here
        int i = 0;
        Scanner read = new Scanner(System.in);
        Policy p = new Policy();
        
        while (i != 3){
            System.out.println("");
            System.out.println("---Menu---");
            System.out.println("Digite: ");
            System.out.println("1 - criar apólice.");
            System.out.println("2 - visualizar dados do apólice.");
            System.out.println("3 - sair.");
            System.out.println("----------");
            System.out.println("");
            i = Integer.parseInt(read.nextLine());
            
            switch (i) {
                case 1:
                    System.out.println("Digite o número.");
                    p.setNumber(Integer.parseInt(read.nextLine()));
                    System.out.println("Digite o nome.");
                    p.setName(read.nextLine());
                    System.out.println("Digite a idade.");
                    p.setAge(Integer.parseInt(read.nextLine()));
                    System.out.println("Digite o sexo.");
                    p.setSex(read.nextLine().charAt(0));
                    System.out.println("Digite o valor do automóvel.");
                    p.setCarValue(read.nextDouble());
                    read.nextLine();
                    break;
                case 2:
                    System.out.println(p.imprimir());
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
