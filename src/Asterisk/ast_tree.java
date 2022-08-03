package Asterisk;

import java.util.Scanner;

public class ast_tree {
	public static void main(String args[]) {
		int n, p;
		Scanner input = new Scanner(System.in);
		System.out.print("도형 개수 p를 입력:");
		p = input.nextInt();
		System.out.print("n을 입력: ");
		n = input.nextInt();
		System.out.println("별찍기n :" + n);

		for (int i = 0; i < n; i++) {
			System.out.printf("%3d ", i);
			for (int j = 0; j < n - i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 2 * i + 1; j++) {
				System.out.print("*");
			}
			for (int k = 0; k < p-1; k++) {
				for (int j = 0; j < 2 * n - 2 * i-1; j++) {
					System.out.print(" ");
				}
				for (int j = 0; j < 2 * i + 1; j++) {
					System.out.print("*");
				}
			}
			System.out.printf("\n");
		}
	}
}





