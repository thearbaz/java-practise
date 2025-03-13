public class demo {
    public static void main(String[] args) {
        int N = 10; // Change this value to calculate the sum of first N natural numbers
        int sum = 0;

        for (int i = 1; i <= N; i++) {
            sum += i; // Add i to sum
        }

        System.out.println("Sum of first " + N + " natural numbers is: " + sum);
    }
}


