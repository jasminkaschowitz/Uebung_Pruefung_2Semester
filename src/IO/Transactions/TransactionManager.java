package IO.Transactions;

import java.util.ArrayList;
import java.util.HashMap;

public class TransactionManager {

    private ArrayList<Transaction> liste;

    public TransactionManager(ArrayList<Transaction> liste) {
        this.liste = liste;
    }

    public HashMap<String, Integer> getTransactionCountByCity() {
        HashMap<String, Integer> getTransachtionCountByCity = new HashMap<>();
        for (Transaction t:liste) {
            if (getTransactionCountByCity().containsKey(t.getCity())) {
                int count = getTransachtionCountByCity.get(t.getCity());
                getTransachtionCountByCity.put(t.getCity(), count+1);
            }
            else{
                getTransachtionCountByCity.put(t.getCity(), 1);
            }

        }
        return getTransachtionCountByCity;

    }

    public Integer getCountOfTransaction(String country) {
        int count = 0;
        for (Transaction t:liste) {
            if (t.getCountry().equals(country)) {
               count++;
            }

        }
        return count;
    }

    public ArrayList<Transaction> getTransactionsToProduct(String product) {
        ArrayList<Transaction> transactions = new ArrayList<>();
        for (Transaction t:liste) {
            if (t.getProduct().equals(product)) {
                transactions.add(t);
            }

        }
        return transactions;
    }

    public HashMap<String, Double> getAverageTransactionAmountByPaymentType() {
        HashMap<String,Double> getAverageTransactionAmountByPaymentType = new HashMap<>();

        for (Transaction t:liste) {

            if (getAverageTransactionAmountByPaymentType.containsKey(t.getPaymentType())) {
                double count = getAverageTransactionAmountByPaymentType.get(t.getPaymentType());
                getAverageTransactionAmountByPaymentType.put(t.getPaymentType(), count+1);
            } else {
                getAverageTransactionAmountByPaymentType.put(t.getPaymentType(), 1.0);
            }
        }
        for (String payment:getAverageTransactionAmountByPaymentType.keySet()) {
            double sum = countPerPaymentType().get(payment);
            double count = getAverageTransactionAmountByPaymentType.get(payment);
            getAverageTransactionAmountByPaymentType.put(payment, sum/count);}
        return getAverageTransactionAmountByPaymentType;





        }




    public HashMap<String, Double> countPerPaymentType() {
        HashMap<String, Double> countPerPaymentType = new HashMap<>();
        for (Transaction t:liste) {
               if (countPerPaymentType.containsKey(t.getPaymentType())) {
                   double sum = countPerPaymentType.get(t.getPaymentType()) + t.getPrice();
                   countPerPaymentType.put(t.getPaymentType(), sum);
               }
               else{
                   countPerPaymentType.put(t.getPaymentType(), t.getPrice());
               }
            }
        return countPerPaymentType;

        }
    }

