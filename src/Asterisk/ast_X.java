package Asterisk;

import java.util.Scanner;

public class ast_X {
	public static void main(String args[]) {
		int n;
		Scanner input = new Scanner(System.in);
		System.out.print("n을 입력: ");
		n = input.nextInt();
		System.out.println("별찍기n :" + n);

		for (int i = 0; i < n; i++) {
			System.out.printf("%3d ", i);

			for (int j = 0; j < n+2; j++) {
				if (j == i+1 || j == n - i)
					System.out.print(" ");
				else
					System.out.print("*");
			}
			System.out.print("\n");

		}
	}
}
