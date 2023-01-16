package Arrays;

public class task6 {
    public static void main(String[] args) {

        /*
        Create an array of countries. While retrieving all values
        from an array print capital for each country choose any five countries.
         */

        String countries []= new String [5];

        countries[0]="Afghanistan";
        countries[1]="India";
        countries[2]="Canada";
        countries[3]="USA";
        countries[4]="Pakistan";

        String capitals[]= new String[5];

        capitals [0]="Kabul";
        capitals [1]="New Delhi";
        capitals [2]="Ottawa";
        capitals [3]="Washington DC";
        capitals [4]="Islamabad";

       for (int i=0; i< countries.length; i++){
           System.out.println(countries[i]+": "+capitals[i]);
       }
    }
}
