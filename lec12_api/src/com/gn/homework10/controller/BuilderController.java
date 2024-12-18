package com.gn.homework10.controller;

public class BuilderController {

	public BuilderController() {
		
	}
	
	public String afterReplace(String str) {
		/*StringBuilder str2 = new StringBuilder();
		String ddigi;
		while(str.indexOf(" ")==0) {
			ddigi= str.deleteCharAt(0);
		}*/
		String ddigi = str.replace(" ", "");
		return ddigi;
		
	}
	
	public String firstCap(String input) {
		String wo = input.substring(1);
		
		String i = input.substring(0,1).toUpperCase();
		return i+wo;
	}
	
	public int findChar(String input, char one) {
		int got =0;
		
		for(int i = 0 ; i < input.length();i++) {
			
			if(input.charAt(i)==one) {
				got++;
			}
			
		}
		
		return got;
	}
}
