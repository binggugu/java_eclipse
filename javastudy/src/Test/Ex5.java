package Test;

public class Ex5 {

	public static void main(String[] args) {
		// setter �޼��带 ���ؼ� ��ü�� ����
		Student1 std3 = new Student1();
		std3.setName("�ڱ��̸�");
		std3.setAssignmentScore(99);
		std3.setExamScore(88);
		System.out.println(std3);

		// �����ڸ� ���ؼ� ��ü ����
		Student1 std4 = new Student1("ȫ�浿", 99, 33);
		System.out.println(std4);
	}

}
