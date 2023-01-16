package Arrays;

public class task1 {
    public static void main(String[] args) {

        /*
        Create an array of names and store all names of your group.
        Then print your name from that array. (use 2 different ways of creating an array).
         */

        String names []={"Khatera", "Omid", "Maryam", "Tamim"};

        String names2 []= new String[4];

        names2[0]="Khatera";
        names2[1]="Omid";
        names2[2]="Maryam";
        names2[3]="Tamim";

        System.out.println(names[1]);
        System.out.println(names2[1]);
    }
}
