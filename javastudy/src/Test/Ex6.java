package Test;

public class Ex6 {

	public static void main(String[] args) {
		// 하위클래스 선언 ==> 상위클래스 내용도 같이 사용 가능
		UnderStudent1 std5 = new UnderStudent1();
		std5.setName("자기이름");
		std5.setClubname("프로그래밍");
		System.out.println(std5);
		
		// 하위클래스 ==> 생성자를 통해서 
		UnderStudent1 std6 = new UnderStudent1("홍길동", 10, 40, "독서");
		System.out.println(std6);
		
	}

}
