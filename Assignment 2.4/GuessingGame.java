import java.util.Scanner;

class GuessingGame {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean run = true;

        double n = Math.floor((Math.random() * 100.0) + 1.0);
        
        double t = 0.0;

        System.out.println("I've picked a number between 1 and 100. Try to guess it!");

        System.out.println("");

        while (run == true) {
            System.out.println("What is your guess?");
            
            System.out.println("");

            double g = sc.nextDouble();

            System.out.println("");

            if (g > n) {
                System.out.println("Too high...");
                
                System.out.println("");
                
                t = t + 1.0;
            } else if (g < n) {
                System.out.println("Too low...");
                
                System.out.println("");
                
                t = t + 1.0;
            } else if (g == n) {
                System.out.println("You've guessed my number! Good job! It only took you " + t + " tries!");
                run = false;
            }
        }

        System.exit(0);
    }
}