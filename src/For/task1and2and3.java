package For;

public class task1and2and3 {
    public static void main(String[] args) {

        /*/ write a loop to print numbers from 1 to 100
        // write a loop to print odd numbers from 1 to 15
        // write a loop to print these number 5,10,15,20,25,30.... 50

         */

        for (int i=5; i<51; i+=5){

                System.out.print(" "+i);
        }

        for (int i=1; i<101; i++){
            if (i%2!=0){
                System.out.print(" "+i);
            }
        }

        for (int i=1; i<101; i++){
            System.out.print(" "+i);
        }


    }
}
