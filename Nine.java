import java.util.Scanner;

class Nine{
    public static void main(String[] args){
        int row,column;
        System.out.println("Enter number of row:");
        Scanner rw = new Scanner(System.in);
        row = rw.nextInt();
        System.out.println("Enter number of column:");
        Scanner col = new Scanner(System.in);
        column = col.nextInt();

        int[][] matrix1= new int[row][column];
        int[][] matrix2 = new int[row][column];
        int[][] matrixSum = new int[row][column];

        System.out.println("Enter the number for matrix one: ");
        for(int i=0; i<row; i++){
            for(int j=0; j<column; j++){
                Scanner val = new Scanner(System.in);
                int value = val.nextInt();
                matrix1[i][j] = value;
            }
        }

        System.out.println("Enter the number for matrix two: ");
        for(int i=0; i<row; i++){
            for(int j=0; j<column; j++){
                Scanner val = new Scanner(System.in);
                int value = val.nextInt();
                matrix2[i][j] = value;
            }
        }

        for(int i=0; i<row; i++){
            for(int j=0; j<column; j++){
                matrixSum[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        for(int i=0; i<row; i++){
            for(int element:matrixSum[i]){
                System.out.print(element + " ");
            }
            System.out.println();
        }

    }
}