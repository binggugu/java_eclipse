package javastudy;

import java.util.Scanner;

public class kimjisung {
	public static void main(String[] args) {
		
		Scanner jisung = new Scanner(System.in);
		System.out.println("���̸� �Է��ϼ���");
		int A = jisung.nextInt(); // �ܼ� if ��
		if((A>=20) && (A<30)) {
			System.out.println("20�� �Դϴ�"); 
		}
		else {
			System.out.println("20�밡 �ƴմϴ�");
		}
		
		System.out.println("������ �Է��ϼ���");
		int k = jisung.nextInt();
		char c;
		if(k>=90){
			c ='A';
		} else if (k>=70){
			c ='B';
		} else {
			c ='C';
		}
		System.out.println("������"+ c + "�Դϴ�.");
	}
}
