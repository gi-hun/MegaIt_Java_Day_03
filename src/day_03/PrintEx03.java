/*
 * # 출력문의 종류
 * 1. System.out.println();
 * 1) ln = new line
 * 2) 줄바꿈 가능
 * 2. System.out.print();
 * 1) 줄바꿈 불가
 * 3. System.out.printf();
 * 1) 서식문자 출력
 * 2) 종류
 * . %d : 정수
 * . %f : 소수
 * . %c : 문자 1개
 * . %s : 문자 여러개
 */


package day_03;

public class PrintEx03 {
	public static void main(String[] args) {
		System.out.println("안녕하세요");
		
		System.out.print("안녕");
		System.out.println("하세요");
		
		System.out.println("안녕\n하세요");
		System.out.println("안녕하세요\t");
		System.out.println("\"안녕하세요\"");
		System.out.println("\'안녕하세요\'");
	}
}
