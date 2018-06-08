package javastudy;

public class Op1 {

	public static void main(String[] args) {
		// 변수 선언
		int remaider = 29%2; //변수타입 변수명 = 값
		System.out.println("나머지는" + remaider + "임");
		
		//비교연산자
		
		int x=1, y=1;
		boolean z; // true or false 만 결과값이 나오게
		z= ((x<1) || (--y<1)); //0 <1 or y<1 //둘중 하나만 ture일경우 ture
		System.out.println("결과는 : " + z);
		z= ((x<1) && (y--<1)); // 둘다 만족을 해야 ture
		System.out.println("결과는 : " + z); 
		
		//대입연산자
		int value=2;
		value /= 2; // value = value-2;
		System.out.println("결과"+value);
		
		
		value <<=6; // value 값이 <<는 더블?
		System.out.println("값"+value);
		
		
		//부호 연산자
		x=2;
		y=1;
		System.out.println("x="+ ++x +" x++="+ x++); //x=x+1 //x++
		System.out.println("x="+ x +" --x="+ --x); //x--(x=x-1)
		System.out.println("y="+ y +" y++="+ y++); 
		System.out.println("y="+ y +" --y="+ --y);
		
		//조건연산자
		x=3;
		y=(x==1)? 10 : 20; //조건? 참일때 값; 거짓일때 값;
		System.out.println("결과는 : "+ y);
		
		
		
	}

}
