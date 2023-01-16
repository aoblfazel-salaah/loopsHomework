package Arrays;

public class task4 {
    public static void main(String[] args) {

        /*
        Create an array that can store names of cars and store 6 elements into it.
        Print all values from the array.
         */

        String words []= new String [6];

        words[0]="Maserati";
        words[1]="Toyota";
        words[2]="McLaren";
        words[3]="Ferrari";
        words[4]="Range Rover";
        words[5]="Mercedes";

       for (int i=0; i< words.length; i++){
           System.out.println(words[i]);
       }
    }
}
