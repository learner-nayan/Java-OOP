import java.util.Scanner;

class Two{
    public static void main(String[] args){
        System.out.println("Enter the number upto where you want to print: ");
        Scanner num = new Scanner(System.in);
        int number = num.nextInt();

        for(int i=0; i<=number; i++){
            if(i%2 == 0){
                System.out.println(i + " is even number");
            }else {
                System.out.println(i + " is odd number");
            }
        }

    }
}