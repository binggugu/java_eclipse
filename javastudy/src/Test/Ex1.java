package Test;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		// 조건문 연습 문제
		double grade; // 평점
		int toeicscore; // 토익점수

		// Scanner 클래스 사용
		Scanner scan = new Scanner(System.in);
		System.out.print("평점 입력 >>");
		grade = scan.nextDouble();

		System.out.println("토익점수입력");
		toeicscore = scan.nextInt();

		// 조건
		if (toeicscore >= 700) {
			if (grade >= 4.0) {
				System.out.println("면접대상임");
			} else if (grade >= 3.5) {
				System.out.println("서류전형대상임");
			} else if (grade > 3.0) {
				System.out.println("필기시험");
			} else {
				System.out.println("지원할수 없음");
			}
		} else {
			System.out.println("지원할수 없음");
		}

	}
}
