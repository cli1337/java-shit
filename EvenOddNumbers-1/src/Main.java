import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.random.RandomGenerator;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        int[] nums = new int[100];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(100);
            System.out.printf(i + ". " + nums[i]);
        }

        System.out.println("\n\nlen: " + nums.length);

        List<Integer> evenNumbers = new ArrayList<>();
        List<Integer> oddNumbers = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                evenNumbers.add(nums[i]);
//                System.out.println(nums[i] + " is even");
            } else {
                oddNumbers.add(nums[i]);
//                System.out.println(nums[i] + " is odd");
            }
        }

        int evenSum = evenNumbers.stream().mapToInt(Integer::intValue).sum();
        double evenAverage = evenNumbers.isEmpty() ? 0 : (double) evenSum / evenNumbers.size();

        int oddSum = oddNumbers.stream().mapToInt(Integer::intValue).sum();
        double oddAverage = oddNumbers.isEmpty() ? 0 : (double) oddSum / oddNumbers.size();

        System.out.println("EVEN | len=" + evenNumbers.toArray().length + ", sum=" + evenSum + " average=" + evenAverage);
        System.out.println("ODD | len=" + oddNumbers.toArray().length + ", sum=" + oddSum + " average=" + oddAverage);

    }
}