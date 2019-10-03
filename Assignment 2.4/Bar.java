import java.util.Scanner;

class Bar {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("What do you want your bar made out of?");

        String m = sc.nextLine();

        System.out.println("");

        System.out.println("How long do you want your bar?");

        double l = sc.nextDouble();

        System.out.println("");

        System.out.println("Here's your bar!");

        for (double i = 0; i <= l; i++) {
            System.out.print(m);
        }
    }
}
