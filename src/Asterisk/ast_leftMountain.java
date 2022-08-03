package Asterisk;

import java.util.Scanner;

public class ast_leftMountain {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.printf("n을 입력해주세요");
		int n = scan.nextInt() * 2;

		for (int i = 0; i < n - 1; i++) {
			System.out.printf("%3d", i);
			if (i < n / 2) {
				for (int j = 0; j < i + 1; j++) {
					System.out.print("*");
				}
			} else {
				for (int j = 0; j < n - i - 1; j++) {
					System.out.print("*");
				}
			}
			System.out.println(" ");
		}
	}
}
