import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Bank {

    private List<BankAccount> bankAccounts = new ArrayList<>();
    private HashMap<Integer,BankAccount> accountMap = new HashMap<>();

    public void addAccount(BankAccount account){
        bankAccounts.add(account);
        accountMap.putIfAbsent(account.getNumber(), account);
    }

    public void depositToAccount(int number, double value){
        BankAccount bankAccount = accountMap.get(number);
        if(bankAccount == null){
            System.out.println("Error: account not found");
            return;
        }

        bankAccount.deposit(value);
    }

    public void withDrawFromAccount(int number, double value){
        BankAccount bankAccount =  accountMap.get(number);
        if(bankAccount == null){
            System.out.println("Error: account  not found");
            return;
        }

        bankAccount.withdraw(value);
    }

    public void showAll(){
        System.out.println("--- All Accounts: ---\n");
        for(BankAccount accounts: bankAccounts){
            System.out.println(accounts);
        }
    }
}
