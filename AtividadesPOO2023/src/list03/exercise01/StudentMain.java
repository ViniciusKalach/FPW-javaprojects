package list03.exercise01;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Vinícius Kalach, RA: 211559
 */
public class StudentMain {

    public static void main(String[] args) {
        int i = 0;
        Scanner read = new Scanner(System.in);
        ArrayList<Course> cursos = new ArrayList<>();

        while (i != 6) {
            System.out.println("Menu:");
            System.out.println("1 – Criar Curso");
            System.out.println("2 - Criar Aluno (Perguntar os dados do aluno e escolher o curso do aluno)");
            System.out.println("3 – Remover Aluno");
            System.out.println("4 – Mostrar Todos os Cursos");
            System.out.println("5 – Mostrar alunos do curso");
            System.out.println("6 – Sair");
            i = Integer.parseInt(read.nextLine());
            
            switch (i) {
                case 1:
                    //Criar Curso
                    Course c = new Course();
                    System.out.println("Digite o código do curso");
                    c.setCode(Integer.parseInt(read.nextLine()));
                    System.out.println("Digite o nome do curso");
                    c.setName(read.nextLine());
                    System.out.println("Digite a carga horária");
                    c.setWorkload(Integer.parseInt(read.nextLine()));
                    cursos.add(c);
                    break;
                case 2:
                    //Criar Aluno (Perguntar os dados do aluno e escolher o curso do aluno)
                    Student a = new Student();
                    System.out.println("Digite o RA");
                    a.setRa(read.nextLine());
                    System.out.println("Digite o nome");
                    a.setName(read.nextLine());
                    System.out.println("Selecione o curso");
                    for (int y = 0; y < cursos.size(); y++) {
                        int x = y + 1;
                        System.out.println(x +" - " + cursos.get(i).getName());
                    }
                    int opcaoDeCurso = Integer.parseInt(read.nextLine());
                    cursos.get(opcaoDeCurso - 1).setStudents(a);
                    break;
                case 3:
                    //3 – Remover Aluno
                    System.out.println("Digite o nome do aluno a ser removido");
                    String nomeAlunoRemover = read.nextLine();
                    for (Course curso : cursos) {
                        for (int z = 0; z < curso.getStudents().size(); z++) {
                            if (nomeAlunoRemover.
                                    equals(curso.getStudents().get(i).getName())) {
                                curso.removerAluno(i);
                            }
                        }
                    }
                    break;
                case 4:
                    //Mostrar Todos os Cursos
                    for (Course curso : cursos) {
                        System.out.println(curso.imprimir());
                    }
                    break;
                case 5:
                    //Mostrar alunos do curso
                    for (Course curso : cursos) {
                        System.out.println(curso.imprimirCompleto());
                    }
                    break;
                case 6:
                    System.out.println("O programa será fechado.");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
            
        }
        read.close();

    }
    
}
