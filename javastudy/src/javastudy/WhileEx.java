package javastudy;

import java.util.Scanner;

public class WhileEx {

	public static void main(String[] args) {

		//1-10������ �� ==> for�� while������
		int i=1, sum=0;
		while (i<=10){
			sum+=i;
			i++; //for(int i=0; i<=10; i++)
			
		}
		System.out.println("���" + sum);
		
		//����ڷκ��� �Է¹��� ������ ��� ���ؼ�
		//�հ���� ���ϱ�
		int count = 0;
		int n=0;
		int sum1=0;
		double avg=0;
		
		System.out.print("������ �Է��ϰ� �������� 0�� �Է�>>");
		Scanner scanner = new Scanner(System.in);
		while ((n=scanner.nextInt())!=0){
			sum1 +=n; // sum1 = sun1 + n
			count++;
		}
		avg=sum1/count;
		System.out.println("���� �Ѱ���"+ count);
		System.out.println("���� : "+sum1);
		System.out.println("���"+ avg);
		
		
	}

}