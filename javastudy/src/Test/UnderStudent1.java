package Test;

public class UnderStudent1 extends Student1{
	// ��ӿ����� ������ �ش��ϴ� ���� ����
	// ����� �θ𲨵� ���� ��� ����
	private String ClubName;
	// ������ �ʿ� ==> �Ű��������°�, �Ű����� 1�� ==> 
	
	public UnderStudent1(){
		super();
	}

	public UnderStudent1(String ClubName) {
		super();
		this.ClubName = ClubName;
	}
	public UnderStudent1(String name, int assignmentScore, int examScore, String ClubName) {
		super(name, assignmentScore, examScore); // �θ�Ŭ������ ������ ȣ��
		this.ClubName = ClubName;
	}
	
	
	// setter/getter �޼���
	public String getClubName() {
		return ClubName;
	}
	public void setClubname(String ClubName) {
		this.ClubName = ClubName;
	}
	
	// toString
	public String toString() {
		return super.toString() + "�� ���Ƹ� �̸�" + getClubName();
		
		
		
	}
	

}
