import java.util.Arrays;
import java.util.Scanner;

public class Q7 {
    // wap to print prime number series using while loop
    static boolean[] isPrime(int n) {
        boolean[] prime = new boolean[n + 1];
        Arrays.fill(prime, true);
        prime[0] = false;
        prime[1] = false;

        for (int i = 2; i * i <= n; i++) {
            for (int j = i * 2; j <= n; j += i) {
                prime[j] = false;
            }
        }

        return prime;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Please enter the number: ");
            int n = sc.nextInt();
            boolean[] prime = isPrime(n);

            System.out.println("created");

            for (int i = 0; i < prime.length; i++) {
                if (prime[i] == true) {
                    System.out.println(i);
                }
            }

        } finally {
            sc.close();
        }
    }
}

// Output ->
// Please enter the number: 20
// created
// 2
// 3
// 5
// 7
// 11
// 13
// 17
// 19
