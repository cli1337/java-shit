import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Choose type");
            System.out.println("1 - Linear equation (ax + b = 0)");
            System.out.println("2 - Quadratic equation (ax^2 + bx + c = 0)");
            System.out.print("choose type by writing (1 or 2): ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    Utils.solveLinear(scanner);
                    break;
                case 2:
                    Utils.solveQuadratic(scanner);
                    break;
                default:
                    System.out.println("choose 1 or 2");
            }

        } catch (NumberFormatException e) {
            System.out.println("error= please enter number");
        } catch (Exception e) {
            System.out.println("error= " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
