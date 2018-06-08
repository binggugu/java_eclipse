package Test;

import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		// while ==> 무한으로 반복
		int score;
		int totalCount=0;
		int Acount,Bcount,Ccount,Dcount,Fcount;
		Acount=Bcount=Ccount=Dcount=Fcount=0;
		
		// Scanner 클래스 사용
		Scanner scan = new Scanner(System.in);
		System.out.println("점수 입력 : 종료하려면 -1 >>");
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
			// 나머지는 if문까지 완성
			
			System.out.println("점수 입력 : 종료하려면 -1 >>");
			score = scan.nextInt();
		}
		// 화면에 값 출력
		System.out.println();
		System.out.println("점수들의 총수" + totalCount);
		System.out.println("A학점수 = " + Acount);
		// 나머지 완성
	}
}
