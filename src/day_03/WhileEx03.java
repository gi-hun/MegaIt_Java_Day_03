// ����1) 1~5������ �� ���
		// ���� 1) 15
		
		// ����2) 1~10���� �ݺ��� 3�̸� 7�̻� ���
		// ����2) 1, 2, 7, 8, 9, 10
		
		// ����3) ����2�� ���ǿ� �´� ������ �� ���
		// ����3) 37
		
		// ����4) ����2�� ���ǿ� �´� ������ ���� ���
		// ����4) 6
//12:27-12:34

package day_03;

public class WhileEx03 {
	public static void main(String[] args) {
		
		System.out.println("����1");
		int i = 1;
		int total = 0;
		
		while(i <= 5) {
			total = total + i;
			i++;
		}
		System.out.println(total);
		
		//������ ���� �����ߴ�
		//i = 1 -> i = 6
		//���� �ʱ�ȭ �ϴ� ����
		System.out.println(i);
		
		System.out.println("");
		System.out.println("����2");
		
		//���� i�� while�� ���µ��� ���� �����ϱ� ������ ���ο� �ݺ��� ����ϰų�
		//������ �ٸ� �������� ����Ϸ��� �ϸ� �ʱ�ȭ ������� �Ѵ�
		i = 1;
		while(i<=10) {
			if(i<3 || i >=7) {
				System.out.println(i);
			}
			i++;
		}
		
		System.out.println("");
		System.out.println("����3");
		
		total = 0;
		i = 1;
		while(i<=10) {
			if(i<3 || i >=7)
				total = total + i;
			i++;
		}
		System.out.println(total);
		
		System.out.println("");
		System.out.println("����4");
		
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
