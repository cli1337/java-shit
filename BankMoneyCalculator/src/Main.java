import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("enter int (eur): ");
            double principal = Double.parseDouble(scanner.nextLine());
            if (principal < 0) throw new IllegalArgumentException("amount cannot be negative");

            System.out.print("enter annual interest rate in %: ");
            double rate = Double.parseDouble(scanner.nextLine());
            if (rate < 0) throw new IllegalArgumentException("interest rate cannot be negative");

            System.out.print("enter number of years: ");
            int years = Integer.parseInt(scanner.nextLine());
            if (years < 0) throw new IllegalArgumentException("number of years cannot be negative.");

            double r = rate / 100;

            double amount = principal * Math.pow(1 + r, years);

            System.out.printf("after %d years, the amount in the bank will be: %.2f EUR%n", years, amount);
        } catch (NumberFormatException e) {
            System.out.println("invalid input!");
        } catch (IllegalArgumentException e) {
            System.out.println("error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}