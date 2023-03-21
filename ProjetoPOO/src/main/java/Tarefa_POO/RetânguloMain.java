/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tarefa_POO;

/**
 *
 * @author Vinícius RA 211559
 */
public class RetânguloMain {
    
    public static void main(String[] args) {
        
        Retângulo novoRetangulo  = new Retângulo();
        novoRetangulo .setLado1(10);
        novoRetangulo .setLado2(5);
        novoRetangulo .calcularArea();
        novoRetangulo .calcularPer();
        
        Retângulo novoRetangulo2  = new Retângulo();
        novoRetangulo2 .setLado1(10);
        novoRetangulo2 .setLado2(7);
        novoRetangulo2 .calcularArea();
        novoRetangulo2 .calcularPer();
    }
    
}
