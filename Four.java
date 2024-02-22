//------------------USING LOOPS----------------------------------------

import java.util.Scanner;

class Four{

    public static void main(String[] args){
        int num1=0, num2=1, num3;
        System.out.println("Enter the number upto where you want fibonacci numbers: ");
        Scanner num = new Scanner(System.in);
        int number = num.nextInt();

        for(int i=1; num1<=number; i++){
            System.out.println(num1 + " ");
            num3 = num1+num2;
            num1 = num2;
            num2 = num3;
        }

    }
}


//---------------------------USING RECURSION-------------------------------------------
