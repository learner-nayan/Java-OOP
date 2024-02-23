// 12. Write a java program to use command-line arguments.

class Twelve{
    public static void main(String[] args){
//        System.out.println("Did not understand the question:\n\t12. Write a java program to use command-line arguments.");
        String name = args[0];
        String surname = args[1];

        System.out.println("Name: " + args[0] + "\nSurname: " + args[1]);

        System.out.println("Name: " + name + "\nSurname: " + surname);

    }
}