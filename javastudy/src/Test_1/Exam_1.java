package Test_1;

import java.util.Scanner;

public class Exam_1 {

	public static void main(String[] args) {
		// 판매 금액을 체크할 배열
		int[] sales = new int[3];
		int snumber; // 판매원 번호
		int sum; // 합계
		double average; // 평균
		int maxid, maxsales; // 최대값;
		int minid, minsales; // 최소값;
		int i;
		
		Scanner scan = new Scanner(System.in);
		
		// 배열에 값 저장하기
		for(i=0; i < sales.length; i++){
			System.out.println("판매번호입력>>");
			snumber = scan.nextInt();
			System.out.println("판매원" + snumber + "의 매출액:>>");
			sales[snumber-1] = scan.nextInt();
		}
		
		// 화면에 총합출력
		System.out.println("\n 판매원들의 매출액");
		System.out.println("-------------------");
		
		sum = 0;
		for (i=0; i<sales.length; i++){
			System.out.println("판매원" + (i+1) + " " + sales[i]);
			sum += sales[i];
		}
		
		// 최대 / 최소 비교 ==>
		maxid = 0; maxsales = sales[0]; // 첫번째 값
		minid = 0; minsales = sales[0]; // 첫번째 값
		
		for (i=1; i<sales.length; i++){
			if (sales[i] > maxsales){
				maxid = i;
				maxsales = sales[i];
			}
			if (sales[i] < minsales){
				minid = i;
				minsales = sales[i];
			}
		}
		
		// 결과 출력
		System.out.println("\n총 매출액: " + sum);
		average = (double) sum / 3;
		System.out.println("평균 매출액: " + average);
		System.out.println("최대 매출액: " + maxsales + "(사원 번호" + (maxid+1) + ")");
		System.out.println("최소 매출액: " + minsales + "(사원 번호" + (minid+1) + ")");
		

		
	}

}
