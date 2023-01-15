package NestedLoop;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        System.out.println("From : ");
        int start=scan.nextInt();
        System.out.println("To : ");
        int end=scan.nextInt();

        int sumOfEvens=0;
        int sumOfOdds=0;

        for (int i=start; i<end; i++){
            if (i%2==0){
                sumOfEvens=sumOfEvens+i;
            } else if(i%2!=0){
                sumOfOdds=sumOfOdds+i;
            }
        }
        System.out.println("Sum of even numbers between "+start+ " and "+end+" is "+sumOfEvens);
        System.out.println("Sum of odd numbers between "+start+ " and "+end+" is "+sumOfOdds);

    }
}
