import java.util.Scanner;

class Triangle {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("What do you want your triangle made out of?");

        String m = sc.nextLine();

        System.out.println("");

        System.out.println("How tall do you want your triangle?");

        double t = sc.nextDouble();

        System.out.println("Here's your triangle!");

        for (double i = 0; i <= t; i++) {
            for (double n = (t + 1.0); n >= ((i - t) - 1.0); n--) {
                System.out.print(m);
            }
            System.out.println(m);
        }
    }
}