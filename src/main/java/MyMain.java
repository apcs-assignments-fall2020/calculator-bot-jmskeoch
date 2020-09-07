import java.util.Scanner;

public class MyMain {

    // Calculates the median of the three inputs
    public static int median(int a, int b, int c) {
        if((a > b && a < c) || (a > c && a < b)) {
            return a;
        } else if((b > a && b < c) || (b > c && b < c)) {
            return b;
        } else {
            return c;
        }
    }

    // Returns the input with the larger absolute value
    public static int magnitude(int a, int b) {
        if(Math.abs(a) > Math.abs(b)) {
            return a;
        } else if(Math.abs(a) == Math.abs(b)) {
            return a;
        } else {
            return b;
        }
    }

    // Returns the "c" value from the Pythagorean theorem "a^2 + b^2 = c^2",
    // where "a" and "b" are the inputs to the method
    public static double pythagoras(int a, int b) {
        double c;
        c = Math.pow(a, 2) + Math.pow(b, 2);
        return Math.sqrt(c);
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("What calculation would you like to run? (median, magnitude, pythagoras)");
        String calculateThis = scanner.next();

        //Run median method w/ inputs
        if(calculateThis.equals("median")) {
            System.out.println("What is your first variable? ");
            int a = scanner.nextInt();
            System.out.println("What is your second variable? ");
            int b = scanner.nextInt();
            System.out.println("What is your third variable? ");
            int c = scanner.nextInt();
            System.out.println("Calculating...");
            System.out.println(median(a, b , c));

        //Run magnitude method w/ inputs
        } else if(calculateThis.equals("magnitude")) {
            System.out.println("What is your first variable? ");
            int a = scanner.nextInt();
            System.out.println("What is your second variable? ");
            int b = scanner.nextInt();
            System.out.println("Calculating...");
            System.out.println(magnitude(a, b));

        //Run pythagoras method w/ inputs
        } else if(calculateThis.equals("pythagoras")) {
            System.out.println("What is your first variable? ");
            int a = scanner.nextInt();
            System.out.println("What is your second variable? ");
            int b = scanner.nextInt();
            System.out.println("Calculating...");
            System.out.println(pythagoras(a, b));

        //Unknown text
        } else {
            System.out.println("I do not understand, please re-run!");
        }

        scanner.close();

    }
}
