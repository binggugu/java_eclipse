package javastudy;

import java.util.Scanner;

public class Opex1 {
	
	public static void main(String[] args){
		//문제 : 초 단위로 정수를 입력받아 몇시, 몇분, 몇초인지
		//구하기
		
		Scanner scanner = new Scanner (System.in);
		//키보드로 입력받기 위한 객체 생성 ==> 1단계
		System.out.println("정수를 입력하세요: ");
		int time = scanner.nextInt();
		// 2단계 : 키보드로 입력한 값을 읽어옴
		// nextInt() : //정수로 저장
		
		int hour = time/3600; //정수 /3600 ==> 1시간은 60*6
		int minute = time%3600/60; //분 ==> time 나머지값
		int second = time%60; //초0
		
		System.out.println(time+"초는"+hour+"시"+minute+"분"+second+"초");
		
		//문제 : 입력된 정수가 짝수인지 홀수인지 출력
		//(변수%2)? "짝수" : "홀수"

		//System.out.println("정수");
		//int x = scanner.nextInt();
		//String y;
		//y =(x%2==0)? "짝수" : "홀수";
		
		//System.out.println(x+"는"+ y + "입니다.");
		System.out.println("숫자를 입력하세요");
		int num = scanner.nextInt();
		int odd = num%2;
		String result=(odd==0)? "짝" : "홀" ;
		System.out.println("결과" + result);
		
		//String odd=((num%2)==0)? "짝" : "홀";
		
		System.out.println("정수를 구하세요");
		
	}

}
