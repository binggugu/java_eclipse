package Test;

public class UnderStudent1 extends Student1{
	// 상속에서는 내꺼에 해당하는 값만 정의
	// 사용은 부모꺼도 같이 사용 가능
	private String ClubName;
	// 생성자 필요 ==> 매개변수없는것, 매개변수 1개 ==> 
	
	public UnderStudent1(){
		super();
	}

	public UnderStudent1(String ClubName) {
		super();
		this.ClubName = ClubName;
	}
	public UnderStudent1(String name, int assignmentScore, int examScore, String ClubName) {
		super(name, assignmentScore, examScore); // 부모클래스의 생성자 호출
		this.ClubName = ClubName;
	}
	
	
	// setter/getter 메서드
	public String getClubName() {
		return ClubName;
	}
	public void setClubname(String ClubName) {
		this.ClubName = ClubName;
	}
	
	// toString
	public String toString() {
		return super.toString() + "내 동아리 이름" + getClubName();
		
		
		
	}
	

}
