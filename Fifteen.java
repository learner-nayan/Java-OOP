class Fifteen{
    public static void main(String[] args){
        int num = 15;
        System.out.println(num);

        // Implicit or Automatic typecasting >>>>> int to double
        double number = num;
        System.out.println(number);

        // Explicit or Manual typecasting

        // >>>>> int to string
        String numStr = Integer.toString(num);
        System.out.println(numStr + "  >>This is in string.");

        // >>>>> int to double
        double newNum = (int) num;
        System.out.println(newNum);
    }
}