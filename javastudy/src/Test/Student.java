package Test;

public class Student {

		// ��� ������ ==> �������(=�ʵ�) + ������ + �޼���� ����
		public String name;
		public int assignmentScore;
		int examScore;
		
		// ���� �޼��� ó��
		public char getGrade() {
			char letterGrade=' ';
			double total;
			total = assignmentScore * 0.4 + examScore * 0.6;
			if (total >= 90){
				letterGrade = 'A';
			} else if (total >= 80) {
				letterGrade = 'B';
			} else if (total >= 60) {
				letterGrade = 'C';
			} else {
				letterGrade = 'D';
			}
			return letterGrade;
		}
		
		// ����� ����ϴ� toString() �޼���
		public String toString() {
			String str = "";
			str += "�̸�" + name + "\n";
			str += "��������" + assignmentScore + "\n";
			str += "��������" + examScore + "\n";
			str += "����" + getGrade() + "\n";
			return str;
		}
		
		
		
		

	}


