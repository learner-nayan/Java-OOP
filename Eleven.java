class Eleven{
    public static void main(String[] args){
        System.out.println("Using break statement: ");
        for(int i=1; i<=10; i++){
            if(i==7){
                break;
            }
            System.out.println(i);
        }

        System.out.println("\nUsing continue statement: ");
        for(int i=1; i<=10; i++){
            if(i==7){
                continue;
            }
            System.out.println(i);
        }

    }
}