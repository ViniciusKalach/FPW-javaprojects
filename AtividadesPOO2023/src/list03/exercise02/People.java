package list03.exercise02;

import java.util.ArrayList;

/**
 *
 * @author Vinícius Kalach, RA: 211559
 */
public class People {
    private int code;
    private String name;
    private ArrayList<Automobile> automobile = 
            new ArrayList<>();
    
    public People(){
        
    }
    
    public People(int code, String name){
        this.code = code;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public ArrayList<Automobile> getAutomobile() {
        return automobile;
    }

    public void setAutomobile(ArrayList<Automobile> automobile) {
        this.automobile = automobile;
    }
    
    public void inserirAutomóvel(Automobile automobile){
        this.automobile.add(automobile);
    }
    
    public void removerAutomóvel(int index){
        this.automobile.remove(index);
    }
    
    public String imprimir(){
        return "\nCódigo: " + code   + 
                "\nNome: " + name;
    }
    
    public String imprimirCompleto(){
        String retorno = imprimir();
        for (Automobile automobile : automobile) {
            retorno+= automobile.imprimir();
        }
        return retorno;
    }
    
}
