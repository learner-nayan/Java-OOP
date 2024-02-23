class Fourteen{
    public static void main(String[] args){
        for(int i=1; i<6; i++){
            for(int j=5; j>=i; j--){
                System.out.print(i + " ");
            }
            System.out.println();
        }

        for(int i=6; i<=9; i++){
            for(int j=1; j<=(i-4); j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
