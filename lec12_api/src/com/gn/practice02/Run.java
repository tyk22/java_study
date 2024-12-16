package com.gn.practice02;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("문자열(1):");
		String one = sc.next();
		System.out.print("문자열(2):");
		String too = sc.next();
		System.out.print("문자열(3):");
		String th = sc.next();
		
		String[] arr = {one,too,th};
		String api = arr[0];
		
		for(int i =0; i<arr.length;i++) {
			if(api.length() < arr[i].length()) {
				api=arr[i];
			}else if(api.length()==arr[i].length()) {
				if((int)api.charAt(0)<(int)arr[i].charAt(0)) {
					api=arr[i];
				}
			}
		}
		
		for(int i=0; i<2; i++) {
		System.out.print(api);
		}
	}
}
