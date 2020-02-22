// 문제1) 1~5까지의 합 출력
		// 정답 1) 15
		
		// 문제2) 1~10까지 반복해 3미만 7이상만 출력
		// 정답2) 1, 2, 7, 8, 9, 10
		
		// 문제3) 문제2의 조건에 맞는 수들의 합 출력
		// 정답3) 37
		
		// 문제4) 문제2의 조건에 맞는 수들의 개수 출력
		// 정답4) 6
//12:27-12:34

package day_03;

public class WhileEx03 {
	public static void main(String[] args) {
		
		System.out.println("문제1");
		int i = 1;
		int total = 0;
		
		while(i <= 5) {
			total = total + i;
			i++;
		}
		System.out.println(total);
		
		//변수의 값이 증가했다
		//i = 1 -> i = 6
		//변수 초기화 하는 이유
		System.out.println(i);
		
		System.out.println("");
		System.out.println("문제2");
		
		//변수 i는 while문 도는동안 값이 증가하기 때문에 새로운 반복문 사용하거나
		//변수를 다른 방향으로 사용하려고 하면 초기화 시켜줘야 한다
		i = 1;
		while(i<=10) {
			if(i<3 || i >=7) {
				System.out.println(i);
			}
			i++;
		}
		
		System.out.println("");
		System.out.println("문제3");
		
		total = 0;
		i = 1;
		while(i<=10) {
			if(i<3 || i >=7)
				total = total + i;
			i++;
		}
		System.out.println(total);
		
		System.out.println("");
		System.out.println("문제4");
		
		int count = 1;
		i = 1;
		while(i<=10) {
			if(i<3 || i >=7){
				count ++;
			}
			i++;
		}
		System.out.println(count);
	}
}
