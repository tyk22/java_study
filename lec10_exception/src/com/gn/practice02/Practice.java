package com.gn.practice02;

public class Practice {
	/*public String printStrLength(String n) {
		return n;
	}*/
	
	
	/*public String printStrLength(String st) {
		String str = st;
		try {
			System.out.println(str.length());
			}catch(NullPointerException e) {
				return str = "NullPointerException 발생: "+e.getMessage();
				//return "NullPointerException 발생: "+e.getMessage();
			}
		return str;	
		}*/
	
	public void printStrLength(String st) {
		String str = st;
		try {
			System.out.println(str.length());
			}catch(NullPointerException e) {
				//return str = "NullPointerException 발생: "+e.getMessage();
				System.out.println("NullPointerException 발생: "+e.getMessage());
				//return "NullPointerException 발생: "+e.getMessage();
			}
		//return str;	
		}
	
}
