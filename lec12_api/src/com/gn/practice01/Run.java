package com.gn.practice01;

import java.util.Random;

public class Run {
	
	
	public static void main(String[] args) {
		
	
	
		long aj;
		long ja;
		long[] an= new long[1000000];
		aj=System.currentTimeMillis();
		for(int i = 0; i < an.length;i++) {
			an[i]=(int)(Math.random()*100)+1;
		}
		long[] ye= new long[an.length/2];
		System.arraycopy(an, 0, ye, 0, an.length/2);
		
		int o =0;
		for(int i=0;i<ye.length;i++) {
				o++;
				System.out.print(ye[i]+", ");
				if(9<o) {
						System.out.println();
						o=0;
				}
		}
		ja=System.currentTimeMillis();
		System.out.println("복사 작업 소요 시간:"+(ja-aj));
	}
}
