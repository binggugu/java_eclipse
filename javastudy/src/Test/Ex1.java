package Test;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		// ���ǹ� ���� ����
		double grade; // ����
		int toeicscore; // ��������

		// Scanner Ŭ���� ���
		Scanner scan = new Scanner(System.in);
		System.out.print("���� �Է� >>");
		grade = scan.nextDouble();

		System.out.println("���������Է�");
		toeicscore = scan.nextInt();

		// ����
		if (toeicscore >= 700) {
			if (grade >= 4.0) {
				System.out.println("���������");
			} else if (grade >= 3.5) {
				System.out.println("�������������");
			} else if (grade > 3.0) {
				System.out.println("�ʱ����");
			} else {
				System.out.println("�����Ҽ� ����");
			}
		} else {
			System.out.println("�����Ҽ� ����");
		}

	}
}
