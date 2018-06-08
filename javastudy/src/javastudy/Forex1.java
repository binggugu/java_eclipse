package javastudy;

import java.util.Scanner;

public class Forex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 화면에 1~5까지 숫자를 찍어주는 예제
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);
		
		//위에 출력되는 내용을 for문으로 변경
		for(int i=1; i<=10; i++){
			System.out.println(i);
			//i=1 ==> i<=5(true) ==> 출력(i)
			//i=2 ==> i<=5(true) ==> 출력(i)
			//5가될때까지 출력
		}
		
		//1~10까지의 합
		int i1=0, sum = 0;
		for(i1=1; i1<=10; i1++){
			sum += i1; //sum=sum+i1
			//i1=1 ==> 조건(true) ==> sum=0+1 ==> sum=1
			//i1=2 ==> 조건(true) ==> sum=1+2 ==> 3
			System.out.print(i1);
			if (i1<=9){
				System.out.print("+");
			}else {
				System.out.print("=");
				System.out.println(sum);
			}
		}
		//사용자로 부터 입력받음 값을 반복
		int dan = 0;
		System.out.println("단을 입력하세요>>");
		Scanner scanner = new Scanner(System.in);
		dan = scanner.nextInt();
		for (int i2=1; i2<=9; i2++){
			System.out.println(dan + "*" + i2 + "=" + dan*i2);
		}
		
		//2-9단까지 반복하기
		//단의 반복 (2~9)
		//각 단마다 (1~9)
		
		for(int i3=2; i3<10; i3++){
			//단의 반복
			for(int j3=1; j3<10; j3++){
				System.out.print(i3 + "*" + j3 + "=" + i3*j3);
				//i3=2 ==> 조건 (true) ==> j3=1 ==> 조건 (true) ==> 2*1
									// ==> j3=2 ==> 2*2
									// ==> j3=9 까지 반복
				//i3=3 ==> 조건 (ture) ==> j3을 9가 될때까지 반복
				System.out.print("\t");
			}
			System.out.println();
		}
		
	}

}
