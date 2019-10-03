import java.util.Scanner;

class RunningTally {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        double t = 0;
        boolean run = true;

        System.out.println("Let's add some numbers! [Type a negative number to quit]");

        while (run == true) {
            double n = sc.nextDouble();

            if (n < 0) {
                System.exit(0);
            }

            t = t + n;

            System.out.println("Your total is " + t + ".");
        }
        
        System.exit(0);
    }
}
