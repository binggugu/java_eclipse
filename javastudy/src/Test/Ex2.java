package Test;

import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		// while ==> �������� �ݺ�
		int score;
		int totalCount=0;
		int Acount,Bcount,Ccount,Dcount,Fcount;
		Acount=Bcount=Ccount=Dcount=Fcount=0;
		
		// Scanner Ŭ���� ���
		Scanner scan = new Scanner(System.in);
		System.out.println("���� �Է� : �����Ϸ��� -1 >>");
		score = scan.nextInt();
		while (score >=0){ // while(true)
			totalCount++;
			if (score >=90){
				Acount++;
			} else if (score >= 80){
				Bcount++;
			} else if (score >= 70){
				Ccount++;
			} else if (score >= 60){
				Dcount++;
			} else{
				Fcount++;
			}
			// �������� if������ �ϼ�
			
			System.out.println("���� �Է� : �����Ϸ��� -1 >>");
			score = scan.nextInt();
		}
		// ȭ�鿡 �� ���
		System.out.println();
		System.out.println("�������� �Ѽ�" + totalCount);
		System.out.println("A������ = " + Acount);
		// ������ �ϼ�
	}
}
