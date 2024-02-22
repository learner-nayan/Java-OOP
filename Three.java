import java.util.Scanner;

class Three{
    public static void main(String[] args){
        System.out.println("Enter the number upto where you want prime numbers: ");
        Scanner num = new Scanner(System.in);
        int number = num.nextInt();

        for(int i=1; i<=number; i++){
            int count = 0;
            for(int j=1; j<=i; j++){
                if(i%j == 0){
                    count++;
                }
            }
            if(count == 2){
                System.out.println(i);
            }
        }

    }
}