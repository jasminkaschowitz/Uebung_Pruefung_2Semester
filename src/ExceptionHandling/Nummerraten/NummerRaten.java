package ExceptionHandling.Nummerraten;

import java.util.Random;
import java.util.Scanner;

public class NummerRaten {

    public static void main(String[] args) {
        int randomZahl = new Random().nextInt(10);
        int zahlEingabe = 0;
        while (randomZahl != zahlEingabe) {
           try {
               Scanner scanner = new Scanner(System.in);
            System.out.println("Bitte gebe eine Zahl ein");
            String text = scanner.next();
            zahlEingabe = Integer.parseInt(text);
           } catch (NumberFormatException e) {
               e.printStackTrace();
               System.out.println("Bitte Zahl eingeben");
           }

            }
        System.out.println("Bravo, Zahl erraten");
        }



    }

