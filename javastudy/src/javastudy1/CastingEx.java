package javastudy1;

//person Ŭ����
class Person{
	String name;
	String id;
	//name �Ű������� �ִ� ������
	public Person(String name) {
		super();
		this.name = name;
	}
}

//student Ŭ���� (����)
class Student extends Person{
	String grade;
	String department;
	//������ �ڵ� �ϼ��� �ȵ� ==> ������ �߰�
	public Student(String name){
		super(name); // ����Ŭ������ ������ ȣ��
	}
	public String toString(){
		return "����� " + grade + "���̵�� " + id;
	}
}

public class CastingEx {
	public static void main(String[] args) {
		Person p = new Student("�ڱ��̸�");
		//p=s�� ������ ǥ��(�� ĳ����)
		//������ ������ ����
		//���� = ���� (�� ĳ����)
		//������ ������ ���� ����
		//����ȭ�� �ʿ�
		Student s = (Student) p; 
		//�ٿ�ĳ���� => �������� ��ȯ
		
		s.id = "1234";
		s.grade = "A���";
		s.department = "�а�";
		
		//������ �ϱ�
		System.out.println("id�� "+ s.id + s.grade + s.department + "�Դϴ�.");
		//Ŭ�����ȿ� toString()�޼��带 �����Ŀ� 
		System.out.println(s);
		
		
		
		
 }
}
