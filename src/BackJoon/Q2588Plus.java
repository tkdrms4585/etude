/*
 * 백준 문제 주소 : https://www.acmicpc.net/problem/2588
 * + 1~5 무작위 숫자를 입력 받아도 결과 출력
 * 
 * ex) 123, 45 입력시
 * 
 *      123
 * *     45
 *      615
 *     492
 *     5535
 *  
 * 형태로 출력
 */

package BackJoon;

import java.util.Scanner;

public class Q2588Plus {
	public static void main(String args[]) {
		int x, y;
		int total, numCount = 0;
		int nums[] = new int[5]; // 사용자의 값을 저장하기 위한 배열

		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		y = sc.nextInt();
		total = x * y;

		for (;;) { // 두번째 사용자 값의 개별화
			nums[numCount++] = y % 10;
			y /= 10;
			if (y == 0)
				break;
		}

		int ans[] = new int[numCount + 1]; // 정답을 저장하기 위한 배열
		for (int i = 0; i < numCount; i++) {

			ans[i] = x * nums[i];
			System.out.printf("%d x %d = %d\n", x, nums[i], ans[i]);
		}
		System.out.println(total);

	}

}
 