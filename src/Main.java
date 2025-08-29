//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

                Bank bank = new Bank();
                BankAccount account1 = new BankAccount(10, "Igor", 2000.00);
                BankAccount account2 = new BankAccount(20, "Marcos", 1000.00);
                BankAccount account3 = new BankAccount(30, "Ana", 500.00);

                bank.addAccount(account1);
                bank.addAccount(account2);
                bank.addAccount(account3);

                bank.withDrawFromAccount(10, 500.00);
                bank.depositToAccount(20, 230.00);
                bank.withDrawFromAccount(30, 600.00); //Error

                bank.showAll();


    }
}