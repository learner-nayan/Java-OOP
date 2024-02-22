import java.util.Scanner;

class Ten{
    public static void main(String[] args){
        int row,column;
        System.out.println("Enter number of row:");
        Scanner rw = new Scanner(System.in);
        row = rw.nextInt();
        System.out.println("Enter number of column:");
        Scanner col = new Scanner(System.in);
        column = col.nextInt();

        int[][] matrix1= new int[row][column];
        int[][] matrix2 = new int[column][row];
        int[][] matrixMul = new int[row][row];

        //Taking elements for matrix one

        System.out.println("Enter the number for " + row + "*" + column + " matrix: ");
        for(int i=0; i<row; i++){
            for(int j=0; j<column; j++){
                Scanner val = new Scanner(System.in);
                int value = val.nextInt();
                matrix1[i][j] = value;
            }
        }

        //Taking elements for matrix two

        System.out.println("Enter the number for " + column + "*" + row + " matrix: ");
        for(int i=0; i<column; i++){
            for(int j=0; j<row; j++){
                Scanner val = new Scanner(System.in);
                int value = val.nextInt();
                matrix2[i][j] = value;
            }
        }

        //Doing multiplication

        for(int i=0; i<row; i++){
            for(int j=0; j<row; j++){
                matrixMul[i][j]=0;
                for(int k=0; k<column; k++){
                    matrixMul[i][j] = matrixMul[i][j] + (matrix1[i][k] * matrix2[k][j]);
                }
            }
        }

        //Printing the result

        System.out.println("The result is:");

        for(int i=0; i<row; i++){
            for(int element:matrixMul[i]){
                System.out.print(element + " ");
            }
            System.out.println();
        }

    }
}