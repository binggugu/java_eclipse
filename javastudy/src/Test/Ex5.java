package Test;

public class Ex5 {

	public static void main(String[] args) {
		// setter 메서드를 통해서 객체에 접근
		Student1 std3 = new Student1();
		std3.setName("자기이름");
		std3.setAssignmentScore(99);
		std3.setExamScore(88);
		System.out.println(std3);

		// 생성자를 통해서 객체 접근
		Student1 std4 = new Student1("홍길동", 99, 33);
		System.out.println(std4);
	}

}
