// 5. wap to generate fibonacci series.

class Q5 {
    static int fib(int n) {
        if (n <= 1)
            return n;

        return fib(n - 1) + fib(n - 2);

    }

    public static void main(String[] args) {
        int N = 10;

        for (int i = 0; i < N; i++) {
            System.out.println(fib(i) + " ");
        }
    }
}

// Output ->
// 0 
// 1 
// 1 
// 2 
// 3 
// 5 
// 8 
// 13 
// 21 
// 34 
