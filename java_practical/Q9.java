import java.util.Scanner;

public class Q9 {

    public static void main(String[] args) {

        // wap to find sum of array elements.
        Scanner sc = new Scanner(System.in);
        try {
            int sum = 0;
            int[] array = new int[5];

            for (int i : array) {
                array[i] = sc.nextInt();
                sum += array[i];
            }

            System.out.println("sum: " + sum);

        } finally {
            sc.close();
        }

    }

}

// Output ->
// 1 5 3 4 2
// sum: 15
