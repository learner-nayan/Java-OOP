import java.util.Scanner;

class Six{
    public static void main(String[] args){
        System.out.println("Enter the first number: ");
        Scanner num1 = new Scanner(System.in);
        int number1 = num1.nextInt();

        System.out.println("Enter the second number: ");
        Scanner num2 = new Scanner(System.in);
        int number2 = num2.nextInt();

        number1 = number1 + number2;
        number2 = number1 - number2;
        number1 = number1 - number2;

        System.out.println("Number swapped successfully:\n" + "First number: "+ number1 + "\nSecond number: "+ number2);
    }
}

/*
    NUMBER SWAPPING ALGORITHM:

    Step 1: Initialize and declare two variables with numbers stored in it.(Let 'X' and 'Y').
    Step 2: Add X and Y, and store the result in first variable i.e X.
    Step 3: Subtract Y from X, and store the result in second variable i.e Y.
    Step 4: Subtract Y from X, and store the result in the first variable i.e X.

    NOW THE NUMBERS WILL BE SWAPPED.


    EXAMPLE:
    Step 1: X = 2, Y = 3
    Step 2: X = X+Y = 2+3 = 5 ............Now, X = 5.
    Step 3: Y = X-Y = 5-3 = 2 ............Now, Y = 2.
    Step 4: X = X-Y = 5-2 = 3 ............Now, X = 3.

    SWAPPED SUCCESSFULLY, NOW , X=3, Y=2.
 */