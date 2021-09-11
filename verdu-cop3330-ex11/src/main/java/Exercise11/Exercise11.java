package Exercise11;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Evan Verdu
 */

import java.util.Scanner;

public class Exercise11 {

    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("How many euros are you exchanging? ");
        String euros = scanner.nextLine();

        System.out.print("What is the exchange rate? ");
        String exchangerate = scanner.nextLine();

        int Euros = Integer.parseInt(euros);
        double ExchangeRate = Double.parseDouble(exchangerate);

        double DollarTotal = Euros*ExchangeRate;

        System.out.print(Euros + " euros at an exchange rate of " + String.format("%.4f", ExchangeRate) + " is\n" + String.format("%.2f", DollarTotal) + " U.S. dollars.");



    }

}
