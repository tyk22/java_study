package com.gn.stucy;

public class TwoDmnArr {

	public static void main(String[] args) {
		
		// 1. 2차원 배열의 선언
		int[][]arr;
		String[][] staArr;
		
		// 2. 2차원 배열의 생성
		arr = new int [2][3];
		double[][]dot= new double[4][4];
		
		// 3. 2차원 배열 초기화
		// (1)
		
		
		// (1) 인덱스를 이용한 초기화
		arr[0][0]=1;
		arr[0][1]=2;
		arr[0][2]=3;
		arr[1][0]=4;
		arr[1][1]=5;
		arr[1][2]=6;
		
		// (2) 반복문을 이용한 초기화
		int cnt = 1;
		
		for(int i =0 ; i <arr.length; i++) {  // 2차원 length는 행
			for(int j=0; j<arr[i].length;j++) {// []. length
				System.out.println(i+" : " +j);
				arr[i][j] = cnt++;
			}
		}
		// (3) 선언과 동시에 초기화
		
		int[][] arr5 = {{1,2,3},{4,5,6}}; 
		int[][] arr6 = new int[][] {{1,2,3},{4,5,6}};
		
		// 4. 2차원 배열 출력				[][]
									//	[][]
		String[][] strArr = new String[2][2];
		
		strArr[0][0] = "딸기";
		strArr[0][1] = "사과";
		strArr[1][0] = "키위";
		strArr[1][1] = "당근";
		
		// 인덱스를 이용한 출력
		System.out.println(strArr[0][1]);
		
		// 반복문을 이용한 출력
		for ( int i = 0;i<strArr.length;i++) {
			for(int j =0;j<strArr[i].length;j++) {
				System.out.println(strArr[i][j]);
			}
		}
		
	}

}
