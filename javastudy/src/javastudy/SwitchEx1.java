package javastudy;

import java.util.Scanner;

public class SwitchEx1 {
	
	public static void main(String[] args) {
		//�⺻ switch
		int num=6;
		switch(num){
		case 1: //if(num==1)
			System.out.println("SK");
			break;
		case 6: 
			System.out.println("KTF");
			break;
		default ://else
			System.out.println("unknown");
		}
		
		//Ű����� ���� �Է¹޾Ƽ� ó��
		Scanner scanner = new Scanner(System.in);
		System.out.println("���� ���� �Է��ϼ���");
		int month=0;
		month = scanner.nextInt();
		switch(month){
		case 3: case 4: case 5: //if(month <= 5) // 3~5
			System.out.println("��");
			break;
		case 6: case 7: case 8:
			System.out.println("����");
			break;
		case 9: case 10: case 11:
			System.out.println("����");
			break;
		default:
			System.out.println("�ܿ�");
		}
		
		//������� ������ �������� �ۼ��ϴ� ��
		int score=0;
		System.out.println("������ �Է��ϼ���>>");
		score = scanner.nextInt();
		switch(score/10){ // ���� �ڸ��� 99~90 /10 =>9
		case 10: case 9:
			System.out.println("A");
			break;
		case 8 : 	//if(score>=80)
			System.out.println("B");
			break;
		default :
			System.out.println("C");
		}
		
	}
	
}