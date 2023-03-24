
package list01.exercise03;

/**
 *
 * @author Vinícius Kalach, RA: 211559
 */
public class Employee {
    
    private int badge;
    private String name;
    private char bondtype;
    private float hourValue;
    private float hourAmount;
    private float salary;
    private float discountValue;

    public int getBadge() {
        return badge;
    }

    public void setBadge(int badge) {
        this.badge = badge;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getBondtype() {
        return bondtype;
    }

    public void setBondtype(char bondtype) {
        this.bondtype = bondtype;
    }

    public float getHourValue() {
        return hourValue;
    }

    public void setHourValue(float hourValue) {
        this.hourValue = hourValue;
    }

    public float getHourAmount() {
        return hourAmount;
    }

    public void setHourAmount(float hourAmount) {
        this.hourAmount = hourAmount;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public float getDiscountValue() {
        return discountValue;
    }

    public void setDiscountValue(float discountValue) {
        this.discountValue = discountValue;
    }
    
    public float valorSalario(){
        if (bondtype == 'H') {
            return (hourValue * hourAmount) - discountValue;
        } else {
            return (salary - discountValue);
        }
    }
    
    public String imprimir(){
        return "\nCrachá: " + badge + 
                "\nNome: " + name +
                "\nTipo de Vínculo: " + bondtype + 
                "\nSalário: " + salary + 
                "\nDesconto: " + discountValue + 
                "\nValor a receber: " + valorSalario();
    }
    
}
