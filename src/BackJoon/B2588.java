package BackJoon;

import java.util.Scanner;

public class B2588 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = b;
		
		System.out.println(a * (b%10));
		b /= 10;
		System.out.println(a * (b%10));
		b /= 10;
		System.out.println(a * (b%10));
		System.out.println(a * c);
	}
}