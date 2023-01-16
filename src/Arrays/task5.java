package Arrays;

public class task5 {
    public static void main(String[] args) {

        /*
        Create an array of size 5 on integers and
        accumulate the sum of all elements in an array.
         */

        int numbers []= new int [5];

        numbers[0]=78;
        numbers[1]=65;
        numbers[2]=34;
        numbers[3]=44;
        numbers[4]=132;

        int sum=0;

       for (int i=0; i< numbers.length; i++){
           sum+=numbers[i];
       }
        System.out.println(sum);
    }
}
