import java.util.Scanner;

class Secret { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final String answer = "idk";

        System.out.println("What is the password?");
        System.out.println("---------------------");
        System.out.println("The Password is: ");
        String guess = sc.nextLine();

        if(guess.equals(answer)) {
            System.out.println("Correct!");
        } else {
            System.out.println("Incorrect!"); 
        }
    } 
}