package NestedLoop;

public class task5 {
    public static void main(String[] args) {
        /*
        5 5 5 5 5
        4 4 4 4
        3 3 3
        2 2
        1
         */

        for (int row=5; row>=1; row--){
            for (int col=row; col>=1; col--){
                System.out.print(row+" ");
            }
            System.out.println();
        }
    }
}
