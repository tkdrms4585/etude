package Asterisk;

import java.util.Scanner;

public class ast_plusTest{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.printf("%3d", i);
			for (int j = 0; j < n + 2; j++) {
				if (j <= n - i)
					System.out.print(" ");
				else
					System.out.print("*");
			}
			System.out.println();
		}
	}
}