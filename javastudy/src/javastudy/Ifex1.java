package javastudy;

import java.util.Scanner;

public class Ifex1 {
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		System.out.println("���̸� �Է��ϼ���>>");
		int A = scanner.nextInt(); // �ܼ� if ��
		if((A>=20) && (A<30)) {
			System.out.println("20�� �Դϴ�"); 
		}
		else {
			System.out.println("20�밡 �ƴմϴ�");
		}
		
		//if ~ elseif (���� if��, ���� if�� ==> ������ ������..
		System.out.println("������ �Է��ϼ��� : ");
		int score = scanner.nextInt();
		char grade;
		if (score>=90) {
			grade = 'A';
		} else if (score>=80) {
			grade = 'B';
		} else if (score>=70) {
			grade = 'C';
		}
		else if (score>=60) {
			grade = 'D';
		}
		else {
			grade = 'F';
		}
		
		System.out.println("������"+grade+"�Դϴ�.");
		//System.out.println("������ %C �Դϴ�" , grade)
		
		//��ø if�� ==> if�� ���Ǿȿ� �Ǵٸ� if ���� ���� ���
		System.out.println("���� �Է� :>>");
		int score1 = scanner.nextInt();
		
		System.out.println("�г��� �Է��ϼ���>>");
		int year = scanner.nextInt();
		
		if (score1>=60){
			if(year !=4) {// (!=) --> ���� �ʴ�
				System.out.println("�հ�");
			} else if (score1>=70) {
				System.out.println("�հ�");
			} else {
				System.out.println("���հ�");
			} // ���� : 4�г⿡ ���� ����
		} else {
			System.out.println("���հ�");
		} // ���� : 60�� �̸��̸� 
			
   } //main
}//Ŭ��������
