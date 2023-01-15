package NestedLoop;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        System.out.println("Do you want to buy sth");
        boolean buyItem=scan.nextBoolean();
        System.out.println("What is the price of the item");
        int price= scan.nextInt();

        int moneyPaid=0;

        while (buyItem){
            if (moneyPaid<price){
                System.out.println("You owe : "+(price-moneyPaid));
                System.out.println("How much do you want to pay?");
                moneyPaid= moneyPaid+ scan.nextInt();
            }else if (moneyPaid==price){
                System.out.println("Thank you for shopping");
                break;
            }else {
                System.out.println("Here is your change of : "+ (moneyPaid-price)+"$");
                System.out.println("Thank you for shopping");
                break;
            }

        }
    }
}