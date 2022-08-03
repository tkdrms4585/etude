package Asterisk;

import java.util.Scanner;

public class ast_rightMountain {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.print("n을 입력해 주세요");
		int n = scan.nextInt();

		for (int i = 0; i < n * 2 - 1; i++) {
			System.out.printf("%3d", i);
			if (i < n) {
				for (int j = 0; j < n - i; j++) {
					System.out.print(" ");
				}
				for (int j = 0; j < i + 1; j++) {
					System.out.print("*");
				}
			} else {
				for (int j = 0; j < i - n + 2; j++) {
					System.out.print(" ");
				}
				for (int j = 0; j < n - (i - n) - 1; j++) {
					System.out.print("*");
				}
			}
			System.out.println(" ");
		}
	}
	

}
