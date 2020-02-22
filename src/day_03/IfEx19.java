/*
 * # 연산자 기호 맞추기 게임
 * 1. 1~10 사이의 랜덤 숫자 2개를 저장한다.
 * 2. 1~4 사이의 랜덤 숫자 1개를 저장한다.
 * 3. 위 숫자는 연산자 기호에 해당된다.
 * 	  1) 덧셈	  2)  뺼셈     3) 곱셈	 4) 나머지
 * 4. 사용자는 연산자 기호를 맞추는 게임이다.
 * 예) 3 ? 4  = 7
 *    1) + 2) - 3) * 4) %
 *    정답 : 2번
 */
//11:53-12:01

package day_03;

import java.util.Scanner;
import java.util.Random;

public class IfEx19 {
	public static void main(String[] args) {
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		
		int num1 = ran.nextInt(10) + 1;
		int num2 = ran.nextInt(10) + 1;
		int operator = ran.nextInt(4) + 1;
		
		int result =0;
		
		if(operator == 1) {
			result = num1 + num2;
		}
		else if(operator == 2) {
			if(num1 >= num2) {
				result = num1 - num2;
			}
			else {
				result = num2 - num1;
			}
		}
        else if(operator == 3) {
			result = num1 * num2;
		}
        else if(operator == 4) {
			result = num1 / num2;
		}
		
		System.out.println(num1+"?"+num2+"="+result);
		System.out.println("정답을 선택하시오");
		int select = sc.nextInt();
		
		if(operator == select)
			System.out.println("정답");
		else
			System.out.println("오답");
	}
}
