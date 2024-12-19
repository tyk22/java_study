package com.gn.practice07;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Run {

	public static void main(String[] args) {
		File file = new File("C:\\test\\sub\\practice\\output.txt");
		FileReader fr = null;
		BufferedReader br = null;
		String[] star = new String[3];
		int idx = 0;
		int max = 0;
		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			
			StringBuilder str = new StringBuilder();
			
			while(0==0) {
				String cb = br.readLine();
				if(cb==null) {
					break;
				}
				str.append(cb).append("\n");
				star[idx++]	 = cb;
			}
			System.out.println(str);
			for(String A : star) {
				String ai = A.replace(" ","");
				max = ai.length()*star.length;
			}
			
			System.out.println("공백 제외 글자수 : "+max);
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(br!=null)br.close();
				if(fr!=null)fr.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}

}
