package ExceptionHandling.Account;

import java.util.HashMap;

public class BankDemo {

    public static void main(String[] args) {
        HashMap<String, Account> liste = new HashMap<>();
        Bank bank = new Bank(liste);
        try {
            bank.addAccount("musterfrau",500,500);
            bank.addAccount("mustermann",3000,1000);


            bank.transfer("mustermann", "musterfrau", 200);
            System.out.println(liste.toString());

        } catch (BankException e) {
            e.printStackTrace();
        } catch (AccountNotFoundException e) {
            e.printStackTrace();
        }


    }
}
