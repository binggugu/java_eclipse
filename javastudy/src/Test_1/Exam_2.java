package Test_1;

import java.util.Scanner;

public class Exam_2 {
	public static void main(String[] args) {
		// �Ǹſ��� ����� ���� �迭
		int num[][] = new int [3][2]; // ��, �� => 3���� ��(�Ǹſ�), 2��(�ǸŹ�ȣ,�����)
		int total = 0;
		double avg = 0;
		int i;
		
		Scanner scan = new Scanner(System.in);
		// �Է¹��� �� �迭�� ����
		for(i=0; i<num.length; i++){
			System.out.println("�Ǹſ��� ��ȣ�� �Է��ϼ���: ");
			num[i][0] = scan.nextInt();
			System.out.println("�Ǹſ� " + num[i][0] + "�� �����>>");
			num[i][1] = scan.nextInt();
		}
		
		// ȭ�鿡 �Ѿ� ���
		System.out.println("�Ǹſ����� �����");
		System.out.println("-------------------");
		for (i=0; i<num.length; i++){
			System.out.println("�Ǹſ�" + num[i][0] + "\t" + num[i][1]);
			total += num[i][1];
		}
		
		// �ִ�/�ּ� ��
		int maxsales = num[0][1]; int maxid = 0;
		int minsales = num[0][1]; int minid = 0;
		for (i=0; i<num.length; i++){
			if(num[i][1] > maxsales){
				maxid = i;
				maxsales = num[i][1];
			}
			if(num[i][1] < minsales){
				minid = i;
				minsales = num[i][1];
			}
		}
		
		// ��� ���
		avg = (double) total / 3;
		System.out.println("�Ѹ���� "+ total + "\t���" + avg);
		System.out.println("�ִ� ����� " + maxsales + " " + "�Ǹſ�" + num[maxid][0]);
		System.out.println("�ּ� ����� " + minsales + " " + "�Ǹſ�" + num[minid][0]);
		
		
	}
}