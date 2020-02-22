/*
 * # ������ ��ȣ ���߱� ����
 * 1. 1~10 ������ ���� ���� 2���� �����Ѵ�.
 * 2. 1~4 ������ ���� ���� 1���� �����Ѵ�.
 * 3. �� ���ڴ� ������ ��ȣ�� �ش�ȴ�.
 * 	  1) ����	  2)  �E��     3) ����	 4) ������
 * 4. ����ڴ� ������ ��ȣ�� ���ߴ� �����̴�.
 * ��) 3 ? 4  = 7
 *    1) + 2) - 3) * 4) %
 *    ���� : 2��
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
		System.out.println("������ �����Ͻÿ�");
		int select = sc.nextInt();
		
		if(operator == select)
			System.out.println("����");
		else
			System.out.println("����");
	}
}
