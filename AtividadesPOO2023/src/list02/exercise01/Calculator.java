package list02.exercise01;

/**
 *
 * @author Vinícius Kalach, RA: 211559
 */
public class Calculator {
    private int num1;
    private int num2;

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
    
    public int soma(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
        return num1 + num2;
    }
    
    public double soma(double num1, double num2) {
        num1 = (double) this.num1;
        num2 = (double) this.num2;
        return num1 + num2;
    }
    
    public int sbutracao(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
        return num1 - num2;
    }
    
    public double sbutracao(double num1, double num2) {
        num1 = (double) this.num1;
        num2 = (double) this.num2;
        return num1 - num2;
    }
    
    public int multiplicacao(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
        return num1 * num2;
    }
    
    public double multiplicacao(double num1, double num2) {
        num1 = (double) this.num1;
        num2 = (double) this.num2;
        return num1 * num2;
    }
    
    public int divisao(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
        return num1 / num2;
    }
    
    public double divisao(double num1, double num2) {
        num1 = (double) this.num1;
        num2 = (double) this.num2;
        return num1 / num2;
    }
}
