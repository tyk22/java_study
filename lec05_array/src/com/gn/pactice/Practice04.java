package com.gn.pactice;

public class Practice04 {

	public static void main(String[] args) {
		int[] ages = {20, 18, 22, 19, 21};
		int hit = ages[0];
		int min = ages[0];
		
		for ( int i = 0 ; i < ages.length; i++) {
			if(ages[i]>hit) {
				hit = ages[i];
			}else if ( ages[i]<min){
				min = ages[i];
			}
		}
		System.out.println("가장 나이가 많은 학생의 나이 : "+hit);
		System.out.println("가장 어린 학생의 나이 :"+min);
		
	}

}
