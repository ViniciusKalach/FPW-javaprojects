package list02.exercise02;

/**
 *
 * @author Vinícius Kalach, RA: 211559
 */
public class Policy {
    
    private int number;
    private String name;
    private int age;
    private char sex;
    private double carValue;
    
    public Policy(){
        
    }
    
    public Policy(int number, String name, int age, char sex, double carValue) {
        this.number = number;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.carValue = carValue;
    }
    
    public double calcularValor() {
        if (sex == 'M' && age <= 25) {
            return carValue * 10/100;
        } else if (sex == 'M' && age > 25) {
            return carValue * 5/100;
        } else if (sex == 'F') {
            return carValue * 2/100;
        }
        return 0;
    }
    
    public String imprimir() {
        return "\nNúmero: " + number + 
                "\nNome: " + name +
                "\nIdade: " + age + 
                "\nSaxo: " + sex + 
                "\nValor do Automóvel: " + carValue + 
                "\nValor do Apolice: " + calcularValor();
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public double getCarValue() {
        return carValue;
    }

    public void setCarValue(double carValue) {
        this.carValue = carValue;
    }
}
