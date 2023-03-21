
package Tarefa_POO_2;

/**
 *
 * @author Vinícius RA 211559
 */
public class Funcionário {

    //atributos
    private String nome;
    private String sobrenome;
    private int horasTrabalhadas;
    private double valorPorHora;
    
    //get/set para poder usar as variaveis privadas
    public String getNome(){
       return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getSobrenome(){
       return sobrenome;
    }
    public void setSobrenome(String sobrenome){
        this.sobrenome = sobrenome;
    }
    
    public Integer getHorasTrabalhadas(int horasTrabalhadas){
       return horasTrabalhadas;
    }
    public void setHorasTrabalhadas(int horasTrabalhadas){
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double getValorPorHora(double valorPorHora){
       return valorPorHora;
    }
    public void setValorPorHora(double valorPorHora){
        this.valorPorHora = valorPorHora;
    }
    
    //metodos   
    public void nomeCompleto(){
        this.nome = nome;
        this.sobrenome = sobrenome;
        System.out.println(nome.concat(sobrenome));
    }
    
    public void calcularSalario(){
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorPorHora = valorPorHora;
        double valor = horasTrabalhadas * valorPorHora;
        System.out.println("Salário: " + valor);        
    }
    
    public void incrementarHoras(){
        this.horasTrabalhadas = horasTrabalhadas;
        horasTrabalhadas += 1;
        System.out.println("Horas trabalhadas: " + horasTrabalhadas);
    }
    
    
}