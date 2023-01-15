package NestedLoop;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        boolean addItem;
        double prices = 0;
        double moneyPaid = 0;

         do {
            System.out.println("Do you want to add any item?");
            addItem = scan.nextBoolean();
            if (addItem){
                System.out.println("What is the price of the item");
            } else{
                break;
            }
            prices = prices + scan.nextDouble();
             System.out.println("Your total is :"+prices+"$");
        } while (addItem);

        do {
            System.out.println("Your total remaining is : " + (prices - moneyPaid)+"$");
            System.out.println("How much do you want to pay?");
            moneyPaid = moneyPaid + scan.nextDouble();
        } while (moneyPaid < prices);

        if (moneyPaid == prices) {
            System.out.println("Thank you for shopping");
        } else {
            System.out.println("Here is your change of : " + (moneyPaid - prices) + "$");
            System.out.println("Thank you for shopping");
        }

    }
}

