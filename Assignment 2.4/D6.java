import java.util.Scanner;

class D6 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean run = true;

        while (run == true) {
            double t = 0;
            
            System.out.println("How many D6's do you want to roll?");
            
            System.out.println("");

            double n = sc.nextDouble();

            System.out.println("");
            
            System.out.print("You rolled: ");
            for (int i = 0; i < n; i++) {
                double randN = Math.floor((Math.random() * 6) + 1);

                System.out.print(randN + " ");
                
                t = t + randN;
            }
            
            System.out.println("");
            System.out.println("");
            
            System.out.println("Total: " + t);
            
            System.out.println("");
            
            System.out.println("Again? [y, n]");
            
            System.out.println("");
            
            String a = sc.next();
            
            System.out.println("");
            
            boolean exitLoop = false;
            
            while (exitLoop == false) {
                if (a.equals("y")) {
                    exitLoop = true;
                } else if (a.equals("n")) {
                    System.out.println("Good-bye!");
                    run = false;
                    exitLoop = true;
                } else {
                    System.out.println("Try again, type y or n.");
                    
                    System.out.println("");
                    
                    a = sc.next();
                    
                    System.out.println("");
                }
            }
        }
    }
}
