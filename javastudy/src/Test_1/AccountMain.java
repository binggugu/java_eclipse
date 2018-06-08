package Test_1;

import java.util.Scanner;

public class AccountMain {
	public static void main(String[] args) {
		// 객체 인스턴스화
		
		Exam_3 acct = new Exam_3(); // 기본생성자로 객체 만듬
		acct.setBalance(10000);
		
		acct.setOwnername("자기이름");
		acct.setAcountnumber(101);
		acct.deposit(3000);
		
		// 결과 출력
		System.out.println(acct);
		
		// 생성자로 객체 생성
		Exam_3 acct1 = new Exam_3("자기이름", 102, 10000);
		acct1.deposit(5000);
		
		// 결과 출력
		System.out.println(acct1);
		
		// 그밖에 작업
		acct.withdraw(4000);
		acct1.withdraw(5000);
		System.out.println(acct);
		System.out.println(acct1);
		
		Exam_3 acct2 = new Exam_3();
		Scanner scan = new Scanner(System.in);
		System.out.println("이름을 입력하세요");
		String name = scan.next();
		acct2.setOwnername(name);
		System.out.print("계좌번호를 입력하세요");
		int number = scan.nextInt();
		acct2.setAcountnumber(number);
		System.out.println("입금 금액 ");
		int money = scan.nextInt();
		acct2.deposit(money);
		System.out.println(acct2);
		
		
	}
}
