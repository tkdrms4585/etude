package self;

/*
 * 문제
 * (1 + 1/2 + 1/3 + ... + 1/n ) 과 같은 조화 수열의
 * 합을 계산하는 프로그램을 작성하여 보자.
 * 
 * ++TMI
 * n이 무한대가 되면 수열의 합은 어떻게 될까?-> 무한대가 됨!  
 * 조화 수열의 각 항은 점차  작아져서 0에 한없이 가까워지지만 
 * 그 역수의 합은 무한대가 된다. 
 * 
 * */


import java.util.Scanner;
// 스캐너 명령어를 쓰기 위함

public class harmonicProgression {
	public static void main(String[] args) {
		int num;		// 사용자 값을 받을 정수
		double sum = 0; // 합을 구하기 위한 변수(실수형이기에 double로 작성)
		
		Scanner sc = new Scanner(System.in);
		// 사용자 값을 입력받기 위해 스캐너 메소드 호출 사용
		num = sc.nextInt();
		// 사용자의 값을 num에 입력
		
		
		for (double i = 1; i <= num; i++) {
			sum = sum + 1/i;
			// 1/i를 계산하기 위해서 i를 double로 생성
			// int i로 생성시 소수점은 버려져서 1/2, 1/3...1/n 은 0이됨.
		}
		
		System.out.println(sum);
	}
}