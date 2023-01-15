package For;

public class task5and6and7 {
    public static void main(String[] args) {
        /*Print numbers from 1 to 100 in 1 line with space

        Print numbers from 100 to 1

        Print even numbers from 20 to 1 (2 ways)

        Print odd numbers between 20 and 50 (2 ways)
         */

        //task5
        for (int i=1; i<101; i++){
            System.out.print(" "+i);
        }
        System.out.println();

        //task6
        for (int i=100; i>0; i--){
            System.out.print(" "+i);
        }
        System.out.println();

        //task7
        for (int i=20; i<50; i++){
            if(i%2==1){
                System.out.print(" "+i);
            }
        }
    }
}
