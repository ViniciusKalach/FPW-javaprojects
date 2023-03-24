package list01.exercise03;
import java.util.Scanner;

/**
 *
 * @author Vinícius Kalach, RA: 211559
 */
public class EmployeeMain {

    public static void main(String[] args) {
        // TODO code application logic here
        int i = 0;
        Scanner read = new Scanner(System.in);
        Employee e = new Employee();
        
        while (i != 3){
            System.out.println("");
            System.out.println("---Menu---");
            System.out.println("Digite: ");
            System.out.println("1 - criar um funcionário.");
            System.out.println("2 - visualizar a folha de pagamento.");
            System.out.println("3 - para alterar a remuneração.");
            System.out.println("4 - para sair.");
            System.out.println("----------");
            System.out.println("");
            i = Integer.parseInt(read.nextLine());
            
            switch (i) {
                case 1:
                    System.out.println("Digite o número presente no crachá do funcionário.");
                    e.setBadge(Integer.parseInt(read.nextLine()));
                    System.out.println("Digite o nome do funcionário.");
                    e.setName(read.nextLine());
                    System.out.println("Digite o tipo de vínculo do funcionário.");
                    e.setBondtype(read.nextLine().charAt(0));
                    if (e.getBondtype() == 'H') { 
                        System.out.println("Digite o ganho por hora do funcionário.");
                        e.setHourValue(Float.parseFloat(read.nextLine()));
                        System.out.println("Digite a quantia de hora que o funcionário trabalha.");
                        e.setHourAmount(Float.parseFloat(read.nextLine()));
                    } else {
                        System.out.println("Digite o salário do funcionário.");
                        e.setSalary(Float.parseFloat(read.nextLine()));
                    }
                    break;
                case 2:
                    System.out.println(e.imprimir());
                    break;
                case 3:
                    System.out.println("Saindo.");
                    break;
                case 4:
                    if (e.getBondtype() == 'H') {
                        System.out.println("Digite o novo ganho por hora do funcionário.");
                        e.setHourValue(Float.parseFloat(read.nextLine()));
                        System.out.println("Digite a nova quantia de hora que o funcionário trabalha.");
                        e.setHourAmount(Float.parseFloat(read.nextLine()));                        
                    } else {
                        System.out.println("Digite o novo salário do funcionário.");
                        e.setSalary(Float.parseFloat(read.nextLine()));                        
                    }
                    break;
                default:
                    System.out.println("Erro: opção inválida.");
            }
        }
        
        read.close();  
    }
    
}
