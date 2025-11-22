import java.util.Scanner;

public class FactorionRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FactorionChecker checker = new FactorionChecker();

        System.out.print("Enter Start of Range: ");
        int start = sc.nextInt();

        System.out.print("Enter End of Range: ");
        int end = sc.nextInt();

        int count = 0;

        System.out.println("\nFactorion Numbers in Range:");
        for (int i = start; i <= end; i++) {
            if (checker.isFactorion(i)) {
                System.out.println(i);
                count++;
            }
        }

        System.out.println("\nTotal Factorion Numbers = " + count);
    }
}
