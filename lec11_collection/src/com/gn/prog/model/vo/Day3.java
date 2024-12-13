package com.gn.prog.model.vo;

public class Day3 {


	public void solution(int i, int j, int k, int l, int m) {
		
		int[] numbers={i,j,j,l,m};
			int[] answer = numbers;
			
			for(int in = 0; in<answer.length;in++) {
				answer[in]+=answer[in];
			System.out.println(answer[in]);
			}
		}
		
	}

