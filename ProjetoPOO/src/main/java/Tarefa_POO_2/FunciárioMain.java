
package Tarefa_POO_2;

/**
 *
 * @author Vinícius RA 211559
 */
public class FunciárioMain {

    public static void main(String[] args) {
        
        Funcionário novoFuncionário  = new Funcionário();
        novoFuncionário .setNome("Luis");
        novoFuncionário .setSobrenome("Silva");
        novoFuncionário .setHorasTrabalhadas(10);
        novoFuncionário .setValorPorHora(25.50);
        novoFuncionário .nomeCompleto();
        novoFuncionário .calcularSalario();
        novoFuncionário .incrementarHoras();
        novoFuncionário .incrementarHoras();
        novoFuncionário .incrementarHoras();
        novoFuncionário .incrementarHoras();
        novoFuncionário .incrementarHoras();
        novoFuncionário .incrementarHoras();
        novoFuncionário .incrementarHoras();
        novoFuncionário .incrementarHoras(); 
//total incrementado: 8 horas (1 hora por método de incrementarHoras)
        novoFuncionário .calcularSalario();
    }
    
}
