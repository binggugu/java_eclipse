package Test_1;

import java.util.Scanner;

public class Exam_1 {

	public static void main(String[] args) {
		// �Ǹ� �ݾ��� üũ�� �迭
		int[] sales = new int[3];
		int snumber; // �Ǹſ� ��ȣ
		int sum; // �հ�
		double average; // ���
		int maxid, maxsales; // �ִ밪;
		int minid, minsales; // �ּҰ�;
		int i;
		
		Scanner scan = new Scanner(System.in);
		
		// �迭�� �� �����ϱ�
		for(i=0; i < sales.length; i++){
			System.out.println("�ǸŹ�ȣ�Է�>>");
			snumber = scan.nextInt();
			System.out.println("�Ǹſ�" + snumber + "�� �����:>>");
			sales[snumber-1] = scan.nextInt();
		}
		
		// ȭ�鿡 �������
		System.out.println("\n �Ǹſ����� �����");
		System.out.println("-------------------");
		
		sum = 0;
		for (i=0; i<sales.length; i++){
			System.out.println("�Ǹſ�" + (i+1) + " " + sales[i]);
			sum += sales[i];
		}
		
		// �ִ� / �ּ� �� ==>
		maxid = 0; maxsales = sales[0]; // ù��° ��
		minid = 0; minsales = sales[0]; // ù��° ��
		
		for (i=1; i<sales.length; i++){
			if (sales[i] > maxsales){
				maxid = i;
				maxsales = sales[i];
			}
			if (sales[i] < minsales){
				minid = i;
				minsales = sales[i];
			}
		}
		
		// ��� ���
		System.out.println("\n�� �����: " + sum);
		average = (double) sum / 3;
		System.out.println("��� �����: " + average);
		System.out.println("�ִ� �����: " + maxsales + "(��� ��ȣ" + (maxid+1) + ")");
		System.out.println("�ּ� �����: " + minsales + "(��� ��ȣ" + (minid+1) + ")");
		

		
	}

}
