package javastudy;

public class ArrayEx2 {
	public static void main(String[] args) {
		// 2차원 배열 ==> 배열안에 또다른 배열
		// 행, 열로 구성
		// 일단 배열을 선언하면 배열변수는 행의위치를
		// 행은 다시 열의 시작 위치를 가르킴
		// 실제 저장된 곳의 값을 찾아달대에는 [행]과 열로 찾아감
		
		// 2차원 배열 선언
		int score[][] = new int[2][3]; // 2*3 의 2차원 배열
		// 2차원 배열을 접근해서 값 저장
		score[0][0] = 50; // 첫번째 행에 첫번째 열
		score[0][1] = 30;
		score[0][2] = 40;
		score[1][0] = 30;
		score[1][1] = 40;
		score[1][2] = 60;
		//int score[][] = { {50,30,40}, {30,40,60} }
		for(int i=0; i<2; i++){
			for(int j=0; j<3; j++){
				System.out.println(score[i][j]);
			}
		} // i=0 , j=0 ==> score[0][0]
		  // 	   j=1 ==> score[0][1]
		  // 	   j=2 ==> score[0][2];
		  // i=1 , j=0 ==> score[1][2]
		
		//2차원 배열로 합계, 평균구하기
		int score1[][] = { {3,4} , {4,4} , {4,3} , {2,3} };
		// 4*2 2차원 배열
		int sum = 0;
		int cnt = 0;
		double avg = 0.0;
		for(int i1=0; i1<score1.length; i1++){//배열명.length : 행갯수
			for(int j1=0; j1<score1[i1].length; j1++){//배열명[행].length : 열의 갯수
			sum += score1[i1][j1];	
			cnt ++;
			}
		}
		//int n = score1.length; // 행의 갯수 ==> 4
		//int m = score1[0].length; // 열의 갯수 ==> 2
		//avg = sum/(n*m);
		avg = sum / cnt;
		System.out.println(" 합계 "+ sum + " 평균 " + avg);
	}
}
