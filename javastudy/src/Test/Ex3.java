package Test;

public class Ex3 {

	public static void main(String[] args) {
		// �迭 �ٷ��
		
		int [][] salesTable = { {72,85,94,97},
				{111,122,333,111},{22,44,66,77},
				{66,33,22,100},{66,44,88,11} };
		String[] names = {"ȫ�浿","�Ӳ���","�谩��","��ĥ��","������"};
		double[] rowaverage = new double[5];
		double[] columnaverage = new double[4];
		
		// ���� ���� (�迭������ ����, ����� �����ϱ� ����)
		int i, j, sum;
		// ���� ���
		System.out.println("�Ǹſ� \t 1�б� \t 2�б� \t 3�б� \t 4�б� \t");
		System.out.println("-------------------------------------------");
		
		// �迭�� �����ؼ� �� ���
		for (i=0; i<5; i++){
			System.out.print(names[i]);
			for (j=0; j<4; j++){
				System.out.print("\t" + salesTable[i][j]);
			}
			System.out.println();
		}
		
		System.out.println();
		
		// ���� ��� ==> ex) ȫ�浿 1~4�б� ���
		// 2���� �迭�� ��� : �迭��.length : ���� ����
		// �迭��[�ε�����ȣ].length : ���� ����
		for(i=0; i<salesTable.length; i++){
			sum=0;
			for(j=0; j<salesTable[i].length; j++){
				sum=sum+salesTable[i][j];
			}
			rowaverage[i] = sum/4.0; // int / double ==> double
			System.out.println(names[i] + "��մ����" + rowaverage[i]);
		}
		
		// ���� ��� => 1��б��� �� ���
		for(j=0; j<4; j++){
			sum=0;
			for(i=0; i<5; i++){
				sum=sum+salesTable[i][j];
			}
			columnaverage[j]=sum/5.0;
			System.out.println((j+1) + "�б��� ���" + columnaverage[j]);
		}
		
		
		
		
		
	}

}
