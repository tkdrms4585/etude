package Asterisk;

public class ast_num0 {
	public static void main(String args[]) {
		int n = 5;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (j != 0 && j != 4 && i == 0)
					System.out.print("*");
				else if (j != 0 && j != 4 && i == n - 1)
					System.out.print("*");
				else if (i != 0 && i != 4 && j == 0)
					System.out.print("*");
				else if (i != 0 && i != 4 && j == n - 1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println("");
		}
	}

}
