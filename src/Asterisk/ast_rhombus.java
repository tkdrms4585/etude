package Asterisk;

import java.util.Scanner;

public class ast_rhombus {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.print("n을 입력해 주세요");
		int n = scan.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.printf("%3d", i);
			for (int j = 0; j < n - i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j <i+1; j++) {
				if (j ==i)
					System.out.print("*");
				else
					System.out.print("");
			}
			for (int j = 0; j <i; j++) {
				System.out.print("*");
			}
			for (int j = 0; j < n - i; j++) {
				System.out.print(" ");
			}
			System.out.println();
		}

		for (int i = 0; i < n - 1; i++) {
			System.out.printf("%3d", i + n);
			for (int j = 0; j < i + 2; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < n-i-2; j++) {
				System.out.print("*");
			}
			for (int j = 0; j < 1; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < n-i-2; j++) {
				System.out.print("*");
			}

			for (int j = 0; j < i + 2; j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
		for (int i = 0; i < n; i++) {
			System.out.printf("%3d", i);
			for (int j = 0; j < n - i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i * 2 + 1; j++) {
				System.out.print("*");
			}
			for (int j = 0; j < n - i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < n - i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i * 2 + 1; j++) {
				System.out.print("*");
			}
			for (int j = 0; j < n - i; j++) {
				System.out.print(" ");
			}
			System.out.println();
		}

		for (int i = 0; i < n - 1; i++) {
			System.out.printf("%3d", i + n);
			for (int j = 0; j < i + 2; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < (n - i - 2) * 2 + 1; j++) {
				System.out.print("*");
			}

			for (int j = 0; j < i + 2; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i + 2; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < (n - i - 2) * 2 + 1; j++) {
				System.out.print("*");
			}

			for (int j = 0; j < i + 2; j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
		for (int i = 0; i < n; i++) {
			System.out.printf("%3d", i);
			for (int j = 0; j < n - i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i * 2 + 1; j++) {
				System.out.print("*");
			}
			for (int j = 0; j < n - i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < n - i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i * 2 + 1; j++) {
				System.out.print("*");
			}
			for (int j = 0; j < n - i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < n - i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i * 2 + 1; j++) {
				System.out.print("*");
			}
			for (int j = 0; j < n - i; j++) {
				System.out.print(" ");
			}
			System.out.println();
		}

		for (int i = 0; i < n - 1; i++) {
			System.out.printf("%3d", i + n);
			for (int j = 0; j < i + 2; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < (n - i - 2) * 2 + 1; j++) {
				System.out.print("*");
			}

			for (int j = 0; j < i + 2; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i + 2; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < (n - i - 2) * 2 + 1; j++) {
				System.out.print("*");
			}

			for (int j = 0; j < i + 2; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i + 2; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < (n - i - 2) * 2 + 1; j++) {
				System.out.print("*");
			}

			for (int j = 0; j < i + 2; j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
