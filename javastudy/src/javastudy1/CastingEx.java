package javastudy1;

//person 클래스
class Person{
	String name;
	String id;
	//name 매개변수만 있는 생성자
	public Person(String name) {
		super();
		this.name = name;
	}
}

//student 클래스 (하위)
class Student extends Person{
	String grade;
	String department;
	//생성자 자동 완성이 안됨 ==> 별도로 추가
	public Student(String name){
		super(name); // 상위클래스의 생성자 호출
	}
	public String toString(){
		return "등급은 " + grade + "아이디는 " + id;
	}
}

public class CastingEx {
	public static void main(String[] args) {
		Person p = new Student("자기이름");
		//p=s와 동일한 표현(업 캐스팅)
		//하위를 상위에 대입
		//상위 = 하위 (업 캐스팅)
		//상위는 하위에 접근 오류
		//형변화이 필요
		Student s = (Student) p; 
		//다운캐스팅 => 강제형을 변환
		
		s.id = "1234";
		s.grade = "A등급";
		s.department = "학과";
		
		//결과출력 하기
		System.out.println("id는 "+ s.id + s.grade + s.department + "입니다.");
		//클래스안에 toString()메서드를 만든후에 
		System.out.println(s);
		
		
		
		
 }
}
