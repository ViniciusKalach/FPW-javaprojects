
package list01.exercise01;

/**
 *
 * @author Vinícius Kalach, RA: 211559
 */
public class People {
    private String cpf;
    private String name;
    private char sex;
    private int age;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return name;
    }

    public void setNome(String nome) {
        this.name = nome;
    }

    public char getSexo() {
        return sex;
    }

    public void setSexo(char sexo) {
        this.sex = sexo;
    }

    public int getIdade() {
        return age;
    }

    public void setIdade(int idade) {
        this.age = idade;
    }
    
    public String imprimir(){
        return "CPF: " + cpf +
                "\nNome: " + name +
                "\nSexo: " + sex +
                "\nIdade: " + age;
    }
    
}
