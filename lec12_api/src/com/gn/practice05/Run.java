package com.gn.practice05;

public class Run {

	public static void main(String[] args) {
		String[] words = {"java", "application", "programming", "interface"};
		String[] arr= new String[words.length];
		String car;
		
		for ( int i = 0; i < words.length;i++) {
			System.out.print(words[i]);
			if(words[i].length()>5) {
				arr[i]=words[i];
			}
			if(words[i].length()!=9) {
				System.out.print(" ");
			}
		}
		System.out.println();
			for(int i =1; i<arr.length;i++) {
				car = arr[i];
				System.out.print(car.toUpperCase().charAt(0));
			}
	}

}
