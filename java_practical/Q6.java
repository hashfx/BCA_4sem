// 6. wap to use for loop to print pattern like
// 	1
// 	1 2
// 	1 2 3
// 	1 2 3 4

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int n = sc.nextInt();
            System.out.println("Your Number Pattern is here: ");
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(j + " ");
                }
                System.out.println();
            }
        } finally {
            sc.close();
        }

    }
}

// Output ->
// 	1
// 	1 2
// 	1 2 3
// 	1 2 3 4
