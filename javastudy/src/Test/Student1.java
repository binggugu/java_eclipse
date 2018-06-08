package Test;

public class Student1 {

		// ��� ������ ==> �������(=�ʵ�) + ������ + �޼���� ����
		private String name;
		private int assignmentScore;
		private int examScore; // �ܺο� ���� ����
		
		// ������ => �Ű������� ���� �⺻ ������ 1��, �Ű����� 3��
		
		
		
		
		// setter / getter
				public String getName() {
					return name;
				}

				public Student1(String name, int assignmentScore, int examScore) {
			super();
			this.name = name;
			this.assignmentScore = assignmentScore;
			this.examScore = examScore;
		}

				public Student1() {
					super();
				}

				public void setName(String name) {
					this.name = name;
				}

				public int getAssignmentScore() {
					return assignmentScore;
				}

				public void setAssignmentScore(int assignmentScore) {
					this.assignmentScore = assignmentScore;
				}

				public int getExamScore() {
					return examScore;
				}

				public void setExamScore(int examScore) {
					this.examScore = examScore;
				}
		
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


