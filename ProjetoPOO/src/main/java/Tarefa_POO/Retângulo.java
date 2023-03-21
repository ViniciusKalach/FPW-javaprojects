
package Tarefa_POO;

/**
 *
 * @author Vinícius RA 211559
 */
public class Retângulo {

    //atributos
    private double lado1;
    private double lado2;
    private double area;
    private double per;
    
    //get para poder usar as variaveis privadas
    public double getLado1(){
       return lado1;
    }
    public void setLado1(double lado1){
        this.lado1 = lado1;
    }

    
    public double getLado2(){
       return lado2;
    }
    public void setLado2(double lado2){
        this.lado2 = lado2;
    }

    
    //metodos   
    public void calcularArea(){
        this.area = area;
        area = lado1 * lado2;
        System.out.println("A área do retângulo é = " + area);
    }
    
    public void calcularPer(){
        this.per = per;
        per = lado1 + lado2;
        System.out.println("O perímetro do retângulo é: = " + per);        
    }
    
    
}