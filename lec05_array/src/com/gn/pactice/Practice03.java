package com.gn.pactice;

public class Practice03 {

	public static void main(String[] args) {
		int[] attend = {1,1,1,1,1,0,1,0,0,1};
		int sum = 0;
		int no = 0;
		for(int su:attend) {
			sum = sum + su;
		}
		for(int i = 0; i<attend.length;i++) {
			if(attend[i]==0) {
				no=no+1;
			}
		}
		System.out.println("출석한 학생 수 : "+sum);
		System.out.println("결석한 학생 수 : "+no);
		

	}

}
