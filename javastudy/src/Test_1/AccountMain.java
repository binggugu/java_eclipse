package Test_1;

import java.util.Scanner;

public class AccountMain {
	public static void main(String[] args) {
		// ��ü �ν��Ͻ�ȭ
		
		Exam_3 acct = new Exam_3(); // �⺻�����ڷ� ��ü ����
		acct.setBalance(10000);
		
		acct.setOwnername("�ڱ��̸�");
		acct.setAcountnumber(101);
		acct.deposit(3000);
		
		// ��� ���
		System.out.println(acct);
		
		// �����ڷ� ��ü ����
		Exam_3 acct1 = new Exam_3("�ڱ��̸�", 102, 10000);
		acct1.deposit(5000);
		
		// ��� ���
		System.out.println(acct1);
		
		// �׹ۿ� �۾�
		acct.withdraw(4000);
		acct1.withdraw(5000);
		System.out.println(acct);
		System.out.println(acct1);
		
		Exam_3 acct2 = new Exam_3();
		Scanner scan = new Scanner(System.in);
		System.out.println("�̸��� �Է��ϼ���");
		String name = scan.next();
		acct2.setOwnername(name);
		System.out.print("���¹�ȣ�� �Է��ϼ���");
		int number = scan.nextInt();
		acct2.setAcountnumber(number);
		System.out.println("�Ա� �ݾ� ");
		int money = scan.nextInt();
		acct2.deposit(money);
		System.out.println(acct2);
		
		
	}
}
