package javastudy;

import java.util.Scanner;

public class kimjisung {
	public static void main(String[] args) {
		
		Scanner jisung = new Scanner(System.in);
		System.out.println("나이를 입력하세요");
		int A = jisung.nextInt(); // 단순 if 문
		if((A>=20) && (A<30)) {
			System.out.println("20대 입니다"); 
		}
		else {
			System.out.println("20대가 아닙니다");
		}
		
		System.out.println("성적을 입력하세요");
		int k = jisung.nextInt();
		char c;
		if(k>=90){
			c ='A';
		} else if (k>=70){
			c ='B';
		} else {
			c ='C';
		}
		System.out.println("성적은"+ c + "입니다.");
	}
}
