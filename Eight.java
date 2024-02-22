import java.util.ArrayList;
import java.util.Scanner;

class Eight{
    public static void main(String[] args){
        int[][] arr = new int[3][];

        arr[0] = new int[3];
        arr[1] = new int[2];
        arr[2] = new int[5];

        for(int i=0; i<3; i++){
            System.out.println("Enter the data for row " + i+1 + ": ");
            for(int j=0; j<arr[i].length; j++){
                Scanner n = new Scanner(System.in);
                int number = n.nextInt();
                arr[i][j] = number;
            }
        }

        for(int i=0; i<3; i++){
            for(int element:arr[i]){
                System.out.print(element + " ");
            }
            System.out.println();
        }

    }
}