import java.util.Scanner;

class Q3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int d = (a > b) && (a > c) ? a : (b > c) ? b : c;

			System.out.println("gREateST ValUe : " + d);
		} finally {
			sc.close();
		}

	}
}
// find largest .
// output
// 5
// 3
// 8
// gREateST ValUe : 8
