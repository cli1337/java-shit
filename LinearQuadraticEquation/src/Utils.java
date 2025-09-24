import java.util.Scanner;

public class Utils {
    public static void solveLinear(Scanner scanner) {
        try {
            System.out.print("enter a: ");
            double a = Double.parseDouble(scanner.nextLine());
            System.out.print("enter b: ");
            double b = Double.parseDouble(scanner.nextLine());

            if (a == 0) {
                if (b == 0) {
                    System.out.println("the equation has an infinite number of solutions...");
                } else {
                    System.out.println("the equation has no solution.");
                }
            } else {
                double x = -b / a;
                System.out.println("solution: x = " + x);
            }
        } catch (NumberFormatException e) {
            System.out.println("enter correct numbers");
        }
    }

    public static void solveQuadratic(Scanner scanner) {
        try {
            System.out.print("enter a: ");
            double a = Double.parseDouble(scanner.nextLine());
            System.out.print("enter b: ");
            double b = Double.parseDouble(scanner.nextLine());
            System.out.print("enter c: ");
            double c = Double.parseDouble(scanner.nextLine());

            if (a == 0) {
                System.out.println("this is not a quadratic equation. Let's solve it as a linear equation.");
                if (b == 0) {
                    if (c == 0) {
                        System.out.println("the equation has an infinite number of solutions.");
                    } else {
                        System.out.println("the equation has no solution.");
                    }
                } else {
                    double x = -c / b;
                    System.out.println("solution: x = " + x);
                }
                return;
            }

            double discriminant = b * b - 4 * a * c;

            if (discriminant > 0) {
                double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
                System.out.println("two real solutions:");
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            } else if (discriminant == 0) {
                double x = -b / (2 * a);
                System.out.println("one real solution:");
                System.out.println("x = " + x);
            } else {
                System.out.println("there are no realistic solutions (complex solutions have not been calculated).");
            }
        } catch (NumberFormatException e) {
            System.out.println("enter correct nums");
        }
    }
}
