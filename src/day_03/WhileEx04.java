/*
 * # ������ ����[3�ܰ�]
 * 1. ������ ������ 5ȸ �ݺ��Ѵ�.
 * 2. ������ ���߸� 20���̴�.
 * 3. ���� ���� ��, ������ ����Ѵ�.
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
			
			System.out.println("������?");
			int my_result = sc.nextInt();
			
			if(my_result == result) {
				count ++;
			}
			i ++;
		}
		int score = count * 20;
		System.out.println("������ " + score);
	}
}
