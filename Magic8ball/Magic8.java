import java.util.Scanner;

class Magic8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ask me anything...");
        System.out.println("----------------");
        System.out.println("");
        System.out.println("Question:");
        String random = sc.nextLine();

        Double x = Math.random();

        if(x < 1.0 && x >= 0.95) {
            System.out.println("Not at all.");  
        } else if(x < 0.95 && x >= 0.9) {
            System.out.println("Maybe");
        } else if(x < 0.9 && x >= 0.85) {
            System.out.println("Potentially");  
        } else if(x < 0.85 && x >= 0.8) {
            System.out.println("Not a chance");
        } else if(x < 0.8 && x >= 0.75) {
            System.out.println("Yes");  
        } else if(x < 0.75 && x >= 0.7) {
            System.out.println("Nope");
        } else if(x < 0.7 && x >= 0.65) {
            System.out.println("For sure");
        } else if(x < 0.65 && x >= 0.60) {
            System.out.println("definately");  
        } else if(x < 0.6 && x >= 0.55) {
            System.out.println("Not in one million years");
        } else if(x < 0.55 && x >= 0.5) {
            System.out.println("Maybe one day");
        } else if(x < 0.5 && x >= 0.45) {
            System.out.println("Nah");
        } else if(x < 0.45 && x >= 0.4) {
            System.out.println("Never");
        } else if(x < 0.4 && x >= 0.35) {
            System.out.println("In your dreams");
        } else if(x < 0.35 && x >= 0.3) {
            System.out.println("Of course");
        } else if(x < 0.3 && x >= 0.25) {
            System.out.println("Ask again later");
        } else if(x < 0.25 && x >= 0.2) {
            System.out.println("You're crazy");
        } else if(x < 0.2 && x >= 0.15) {
            System.out.println("I don't think so");
        } else if(x < 0.15 && x >= 0.1) {
            System.out.println("I think so");
        } else if(x < 0.1 && x >= 0.05) {
            System.out.println("Lol no");
        } else if(x < 0.05 && x >= 0) {
            System.out.println("I'm 100% sure Yes");
        }

        else {
            System.out.println("System broken...");
        }
    }
}