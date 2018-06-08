package javastudy;

import java.util.Scanner;

public class Ifex1 {
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		System.out.println("나이를 입력하세요>>");
		int A = scanner.nextInt(); // 단순 if 문
		if((A>=20) && (A<30)) {
			System.out.println("20대 입니다"); 
		}
		else {
			System.out.println("20대가 아닙니다");
		}
		
		//if ~ elseif (이중 if문, 다중 if문 ==> 조건을 여러개..
		System.out.println("성적을 입력하세요 : ");
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
		
		System.out.println("학점은"+grade+"입니다.");
		//System.out.println("학점은 %C 입니다" , grade)
		
		//중첩 if문 ==> if문 조건안에 또다른 if 문을 쓰는 경우
		System.out.println("점수 입력 :>>");
		int score1 = scanner.nextInt();
		
		System.out.println("학년을 입력하세요>>");
		int year = scanner.nextInt();
		
		if (score1>=60){
			if(year !=4) {// (!=) --> 같지 않다
				System.out.println("합격");
			} else if (score1>=70) {
				System.out.println("합격");
			} else {
				System.out.println("불합격");
			} // 문제 : 4학년에 대한 조건
		} else {
			System.out.println("불합격");
		} // 문제 : 60점 미만이면 
			
   } //main
}//클래스마감
