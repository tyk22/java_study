package com.gn.practice06;

public class Practice {
	StringBuilder sb = new StringBuilder("WELCOME TO JAVA");
	
	public String Practice() {
		sb.append("!");
		sb.insert(0, "<< ");
		int idx = sb.indexOf("T"); // 8~9
		int reversidx = sb.lastIndexOf(" ");
		sb.delete(idx, reversidx+1);
		//sb.deleteCharAt(idx);
		//sb.deleteCharAt(idx);
		//sb.deleteCharAt(idx);
		sb.reverse();
		return sb.toString();
	}
}
