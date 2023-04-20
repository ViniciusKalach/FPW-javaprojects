package list03.exercise01;

import java.util.Objects;

/**
 *
 * @author Vinícius Kalach, RA: 211559
 */
public class Student {
    private String ra;
    private String name;

    public Student() {
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.ra);
        hash = 97 * hash + Objects.hashCode(this.name);
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
        final Student other = (Student) obj;
        if (!Objects.equals(this.ra, other.ra)) {
            return false;
        }
        return Objects.equals(this.name, other.name);
    }
    
    public Student(String ra, String name) {
        this.ra = ra;
        this.name = name;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String imprimir(){
        return "RA: "+ this.ra + "\n" +
                "Nome: "+ this.name;
    }
    
}
