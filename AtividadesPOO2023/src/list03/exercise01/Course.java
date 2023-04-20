package list03.exercise01;

import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author Vinícius Kalach, RA: 211559
 */
public class Course {
    private int code;
    private String name;
    private int workload;
    private ArrayList<Student> students = 
            new ArrayList<>();

    public Course() {
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + this.code;
        hash = 71 * hash + Objects.hashCode(this.name);
        hash = 71 * hash + this.workload;
        hash = 71 * hash + Objects.hashCode(this.students);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Course other = (Course) obj;
        if (this.code != other.code) {
            return false;
        }
        if (this.workload != other.workload) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return Objects.equals(this.students, other.students);
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

    public int getWorkload() {
        return workload;
    }

    public void setWorkload(int workload) {
        this.workload = workload;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(Student aluno) {
        this.students.add(aluno);
    }
    
    public Course(int code, String name, int workload) {
        this.code = code;
        this.name = name;
        this.workload = workload;
    }
    
    public void inserirAluno(Student student){
        this.students.add(student);
    }
    public void removerAluno(int index){
        this.students.remove(index);
    }
    public String imprimir(){
        return "Código: "+ this.code + "\n"+
                "Nome: "+ this.name + "\n" +
                "Carga Horária: "+ this.workload +"\n";
    }
    public String imprimirCompleto(){
        String retorno = imprimir();
        for (Student student : students) {
            retorno+= student.imprimir();
        }
        return retorno;
    }
    
}
