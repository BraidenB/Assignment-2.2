import java.util.Scanner;

class GradeGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        System.out.println("Grade Calculator");
        System.out.println("----------------");
        System.out.println("");
        System.out.println("The Test was out of: ");
        Double Test = sc.nextDouble();
        System.out.println("Enter Mark: ");
        Double Mark = sc.nextDouble();
        Double score = (Mark/Test)*100;
       
        if(score >= 86 && score <= 100) {
            System.out.println("Great Job! You got an A!");
        } else if(score <86 && score >= 73) {
            System.out.println("Meh, you got a B.");
        } else if(score <73 && score >= 67) {
            System.out.println("Oof, a C+, thats gotta hurt...");
        } else if(score < 67 && score >=60) {
            System.out.println("You got a C, peasant.");
        } else if(score < 60 && score >= 50) {
            System.out.println("Yikes! barely passing with a C-");
        } else if(score < 50 && score >= 0) {
            System.out.println("Unbelievable, and F, you failed...");
        } else {
            System.out.println("Silly boy! That isn't possible!");
        }
       
        System.out.println("Your score is: " +score);
    }
}