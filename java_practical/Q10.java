import java.util.Arrays;
import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int[] array = new int[5];

            for (int i = 0; i < 5; i++) {
                array[i] = sc.nextInt();
            }

            for (int i : array) {
                System.out.print(i + " ");
            }

            Arrays.sort(array);
            System.out.println("Second Maximum element in array: " + array[array.length - 2]);
            System.out.println("Second Minimum element in array: " + array[1]);
        } finally {
            sc.close();
        }
    }
}


// Output:
// 5 7 3 9 4
// 5 7 3 9 4 
// Second Maximum element in array: 7
// Second Minimum element in array: 4
