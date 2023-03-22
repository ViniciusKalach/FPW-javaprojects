package lista01.exercicio01;
import java.util.Scanner;

/**
 *
 * @author Vinícius Kalach, RA: 211559
 */
public class PessoaMain {

    public static void main(String[] args) {
        // TODO code application logic here
        int i = 0;
        Scanner ler = new Scanner(System.in);
        Pessoa p = new Pessoa();
        
        while (i != 3){
            System.out.println("");
            System.out.println("---Menu---");
            System.out.println("Digite: ");
            System.out.println("1 - criar uma pessoa.");
            System.out.println("2 - visualizar a pessoa.");
            System.out.println("3 - sair.");
            System.out.println("----------");
            System.out.println("");
            i = Integer.parseInt(ler.nextLine());
            
            switch (i) {
                case 1:
                    System.out.println("Digite o CPF da pessoa.");
                    p.setCpf(ler.nextLine());
                    System.out.println("Digite o nome da pessoa.");
                    p.setNome(ler.nextLine());
                    System.out.println("Digite o sexo da pessoa.");
                    p.setSexo(ler.nextLine().charAt(0));
                    System.out.println("Digite a idade da pessoa.");
                    p.setIdade(Integer.parseInt(ler.nextLine()));
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
        
        ler.close();
    }
    
}
