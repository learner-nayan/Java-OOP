import java.util.Scanner;

class Five{
    public static void main(String[] args){
        int number1, number2, result = 0;
        String operator;
        System.out.println("Enter the first number: ");
        Scanner num1 = new Scanner(System.in);
        number1 = num1.nextInt();

        System.out.println("Enter the operator: ");
        Scanner op = new Scanner(System.in);
        operator = op.nextLine();

        System.out.println("Enter the second number: ");
        Scanner num2 = new Scanner(System.in);
        number2 = num1.nextInt();

        switch (operator){
            case "+":
                result = number1 + number2;
                break;

            case "-":
                result = number1 - number2;
                break;

            case "*":
                result = number1 * number2;
                break;

            case "/":
                result = number1 / number2;
                break;  
                
            default:
                System.out.println("Enter valid operator.");
                break;
        }

        System.out.println("Result: "+ result);
        

    }
}