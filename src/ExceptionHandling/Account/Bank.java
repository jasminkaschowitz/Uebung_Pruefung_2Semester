package ExceptionHandling.Account;

import java.util.HashMap;

public class Bank {
    private HashMap<String, Account> accounts;

    public Bank(HashMap<String, Account> accounts) {
        this.accounts = accounts;
    }

    public void addAccount(String owner, double balance, double overdraftFrame) throws BankException {
      Account a = new Account(owner, balance, overdraftFrame);
        if (accounts.containsKey(a.getOwner())) {
          throw new BankException();
        }
        else {
            accounts.put(a.getOwner(), a);
        }
    }

    @Override
    public String toString() {
        return "Bank{" +
                "accounts=" + accounts +
                '}';
    }

    public void transfer(String fromOwner, String toOwner, double amount) throws AccountNotFoundException, BankException {

        try {
            if (accounts.containsKey(fromOwner) && accounts.containsKey(toOwner)) {
               Account a = accounts.get(fromOwner);
              a.debit(amount);
               Account b = accounts.get(toOwner);
              b.credit(amount);
               }
           else {
               throw new AccountNotFoundException();

           }
        } catch (NotEnoughMoneyException e) {
            throw new BankException("Fehler", e);
        }




    }
}
