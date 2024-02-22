class Seven{
    static int i,j,space;
    public static void main(String[] args){
        for(i=5; i>=0; i--){
            for(space=5; space>i; space--){
                System.out.print(" ");
            }
            for(j=0; j<=(i*2); j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

/*
    when:
        i=5, j=10, space=0;
        i=4, j=8, space=1;
        i=3, j=6, space=2;
        i=2, j=4, space=3;
        i=1, j=2, space=4;
        i=0, j=1, space=5;
 */