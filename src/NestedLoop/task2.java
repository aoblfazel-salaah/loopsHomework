package NestedLoop;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        for (int i=1; i<11; i++){
            System.out.println("Do you want to apply for a credit card?");
            boolean applyForCreditCard=scan.nextBoolean();

            if (applyForCreditCard){
                break;
            }

        }


    }
}
