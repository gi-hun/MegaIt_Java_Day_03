/*
 * # 구구단 게임[3단계]
 * 1. 구구단 게임을 5회 반복한다.
 * 2. 정답을 맞추면 20점이다.
 * 3. 게임 종료 후, 성적을 출력한다.
 */
//12:56-01:05

package day_03;

import java.util.Scanner;
import java.util.Random;

public class WhileEx04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		
		int i = 0;
		int count = 0;
		
		while(i < 5)
		{
			int num = ran.nextInt(9) + 1;
			int dan = ran.nextInt(9) + 1;
			int result = num * dan;
			
			System.out.println(num + "x" + dan + "=" + result);
			
			System.out.println("정답은?");
			int my_result = sc.nextInt();
			
			if(my_result == result) {
				count ++;
			}
			i ++;
		}
		int score = count * 20;
		System.out.println("총점수 " + score);
	}
}
