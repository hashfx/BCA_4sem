import java.util.Scanner;

class Q4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			float r = sc.nextFloat();
			System.out.println("Area of Circle is : " + ((22 / 7) * (r * r)));
		} finally {
			sc.close();
		}

	}
}
// wap to calculate area of circle.
// output
// 5
// Area of Circle is : 75.0
