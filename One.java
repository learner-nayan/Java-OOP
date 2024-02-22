import java.util.Scanner;

class One{
    public static void main(String[] args){
//        int num1 = 5;
//        int num2 = 7;
//        int num3 = 3;

        System.out.println("Enter three numbers: \n");

        Scanner nums1 = new Scanner(System.in);
        Scanner nums2 = new Scanner(System.in);
        Scanner nums3 = new Scanner(System.in);

        int num1 = nums1.nextInt();
        int num2 = nums2.nextInt();
        int num3 = nums3.nextInt();

        if(num1 > num2){
            if(num1 > num3){
                System.out.println(num1 + " is the greatest number.");
            }else {
                System.out.println(num3 + " is the greatest number.");
            }
        }else {
            if(num2 > num3){
                System.out.println(num2 + " is the greatest number.");
            }else {
                System.out.println(num3 + " is the greatest number.");
            }
        }
    }
}