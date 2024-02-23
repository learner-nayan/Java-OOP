import java.util.Arrays;
import java.util.Scanner;

class Thirteen{
    public static void main(String[] args){
        System.out.println("How many numbers you want to add?: ");
        Scanner howMany = new Scanner(System.in);
        int howManyNums = howMany.nextInt();

        int[] arr = new int[howManyNums];
        int[] arrangedArray = new int[howManyNums];

        System.out.println("Enter the numbers: ");
        for (int i=0; i<howManyNums; i++){
            Scanner num = new Scanner(System.in);
            int number = num.nextInt();
            arr[i] = number;
        }

        System.out.println(Arrays.toString(arr));

        for (int i=0; i<howManyNums; i++){
            for (int j=i+1; j<howManyNums; j++){
                if(arr[i]<arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));

    }
}