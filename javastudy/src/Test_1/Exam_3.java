package Test_1;

public class Exam_3 {
	private String ownername;
	private int acountnumber;
	private int balance;
	// �ʵ尡 private ==> setter �޼���� ����
	// �ʵ尡 public ==> ��ü��.�ʵ�=��;
	
	// ������ ==> �⺻ ������, �Ű����� 3��
	public Exam_3() {
		super();
	}

	
	// �Ű������� �ִ� ������
	public Exam_3(String ownername, int acountnumber, int balance) {
		super();
		this.ownername = ownername;
		this.acountnumber = acountnumber;
		this.balance = balance;
	}

	
	// getter / setter �޼���
	public String getOwnername() {
		return ownername;
	}

	public void setOwnername(String ownername) {
		this.ownername = ownername;
	}

	public int getAcountnumber() {
		return acountnumber;
	}

	public void setAcountnumber(int acountnumber) {
		this.acountnumber = acountnumber;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	// �߰� ��� �޼���
	public void deposit(int amount){
		this.balance = this.balance + amount;
	}
	
	public void withdraw(int amount){
		this.balance = this.balance - amount;
	}
	
	// ��� ��� �޼���
	public String toString() {
		String resultString = "";
		resultString += "������ �̸�: " + getOwnername() + "\n";
		resultString += "���¹�ȣ " + getAcountnumber() + "\n";
		resultString += "�ܰ� " + getBalance() + "\n";
		return resultString;
	}

	
	
	
	
	
	

	

}