public class Task1 {
    public static void main(String[] args) {
        boolean workDay=true;
        int n=1;

        while (n<=6){
            if (workDay && n<6){
                System.out.println("I need a day off");
            }else {
                System.out.println("I don't need a day off anymore");
            }
            n++;

        }


    }
}
