package Asterisk;

import java.util.Scanner;

public class ast_rhombusPlus {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.print("도형갯수");
		int m = scan.nextInt();
		System.out.print("n을 입력해 주세요");
		int n = scan.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.printf("%3d", i);
			for (int k = 0; k < m; k++) {
				for (int j = 0; j < n - i; j++) {
					System.out.print(" ");
				}
				for (int j = 0; j < i * 2 + 1; j++) {
					System.out.print("*");
				}
				for (int j = 0; j < n - i; j++) {
					System.out.print(" ");
				}

			}
			System.out.println();
		}

		for (int i = 0; i < n - 1; i++) {
			System.out.printf("%3d", i + n);
			for (int k = 0; k < m; k++) {
				for (int j = 0; j < i + 2; j++) {
					System.out.print(" ");
				}
				for (int j = 0; j < (n - i - 2) * 2 + 1; j++) {
					System.out.print("*");
				}

				for (int j = 0; j < i + 2; j++) {
					System.out.print(" ");
				}

			}
			System.out.println();
		}
		

	}

}
