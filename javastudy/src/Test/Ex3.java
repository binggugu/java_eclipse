package Test;

public class Ex3 {

	public static void main(String[] args) {
		// 배열 다루기
		
		int [][] salesTable = { {72,85,94,97},
				{111,122,333,111},{22,44,66,77},
				{66,33,22,100},{66,44,88,11} };
		String[] names = {"홍길동","임꺽정","김갑돌","이칠복","강진주"};
		double[] rowaverage = new double[5];
		double[] columnaverage = new double[4];
		
		// 변수 선언 (배열접근을 위한, 결과를 저장하기 위해)
		int i, j, sum;
		// 제목 출력
		System.out.println("판매원 \t 1분기 \t 2분기 \t 3분기 \t 4분기 \t");
		System.out.println("-------------------------------------------");
		
		// 배열에 접근해서 값 출력
		for (i=0; i<5; i++){
			System.out.print(names[i]);
			for (j=0; j<4; j++){
				System.out.print("\t" + salesTable[i][j]);
			}
			System.out.println();
		}
		
		System.out.println();
		
		// 가로 평균 ==> ex) 홍길동 1~4분기 평균
		// 2차원 배열일 경우 : 배열명.length : 행의 갯수
		// 배열명[인덱스번호].length : 열의 갯수
		for(i=0; i<salesTable.length; i++){
			sum=0;
			for(j=0; j<salesTable[i].length; j++){
				sum=sum+salesTable[i][j];
			}
			rowaverage[i] = sum/4.0; // int / double ==> double
			System.out.println(names[i] + "평균대수는" + rowaverage[i]);
		}
		
		// 세로 평균 => 1사분기의 총 평균
		for(j=0; j<4; j++){
			sum=0;
			for(i=0; i<5; i++){
				sum=sum+salesTable[i][j];
			}
			columnaverage[j]=sum/5.0;
			System.out.println((j+1) + "분기의 평균" + columnaverage[j]);
		}
		
		
		
		
		
	}

}
