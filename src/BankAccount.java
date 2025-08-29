import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankAccount {

    private int number;
    private String name;
    private double amount;


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

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void deposit(double value){
        if(value <= 0){
            System.out.println("Error: value it should be bigger than zero");
            return;
        }
        setAmount(getAmount() + value);
    }

    public void withdraw(double value){
        if(value > amount){
            System.out.println("Error: Insufficient founds");
            return;
        }
        if(value < 0){
            System.out.println("Error: value it should be bigger than zero");
        }
        setAmount(getAmount() - value);
    }

    public BankAccount(int number, String name, double amount) {
        this.number = number;
        this.name = name;
        this.amount = amount;
    }

    @Override
    public String toString(){
        return "Number account: [" + number + "]\n" +
                "Name: {" + name + "}\n" +
                "Amount: [" + amount + " R$]\n";
    }
}
