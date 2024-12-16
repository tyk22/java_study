package com.gn.practice03;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String sentence = "the quick brown fox jumps over the lazy dog";
		System.out.print("입 력 : ");
		String nur = sc.next();
		String[] arr = sentence.split(" ");
		int indexnum = 0;
		if(sentence.indexOf(nur)>=0) {
			indexnum = sentence.indexOf(nur);
				System.out.println(sentence);
				if(indexnum<arr.length) {
				System.out.println(arr[indexnum]+"다음단어는 "+arr[indexnum+1]);
				}else {
					System.out.println("마지막 단어 입니다. ");
				}
		}else {
			System.out.println("존재하지 않는 단어 입니다.");
		}
	}
	
	
	
	
	

}
