package list01.exercise02;
import java.util.Scanner;

/**
 *
 * @author Vinícius Kalach, RA: 211559
 */
public class StudentMain {

    public static void main(String[] args) {
        // TODO code application logic here
        int i = 0;
        Scanner ler = new Scanner(System.in);
        Student a = new Student();
        
        while (i != 3){
            System.out.println("");
            System.out.println("---Menu---");
            System.out.println("Digite: ");
            System.out.println("1 - criar um aluno.");
            System.out.println("2 - visualizar o aluno criado.");
            System.out.println("3 - sair.");
            System.out.println("----------");
            System.out.println("");
            i = Integer.parseInt(ler.nextLine());
            
            switch (i) {
                case 1:
                    System.out.println("Digite o RA do aluno.");
                    a.setRA(ler.nextLine());
                    System.out.println("Digite o nome do aluno.");
                    a.setNome(ler.nextLine());
                    System.out.println("Digite a nota do AC1 do aluno.");
                    a.setAC1(Float.parseFloat(ler.nextLine()));
                    System.out.println("Digite a nota do AC2 do aluno.");
                    a.setAC2(Float.parseFloat(ler.nextLine()));
                    System.out.println("Digite a nota do AG do aluno.");
                    a.setAG(Float.parseFloat(ler.nextLine()));
                    System.out.println("Digite a nota do AF do aluno.");
                    a.setAF(Float.parseFloat(ler.nextLine()));
                    break;
                case 2:
                    System.out.println(a.imprimir());
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
