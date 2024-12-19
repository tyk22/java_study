package com.gn.practice06;

import java.awt.image.DataBufferDouble;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Run {

	public static void main(String[] args) {
		File dir = new File("C:\\test\\sub");
		File prcat = new File(dir,"\\practice");		
		if (!dir.exists()) {
			dir.mkdirs();
		}
		if(!prcat.exists()) {
			prcat.mkdirs();
		}
		File file = new File(prcat,"output.txt");
		
		FileWriter fw = null;
		BufferedWriter bw = null;
		String[] lines = {"첫 번째 줄입니다", "두 번째 줄입니다", "세 번째 줄입니다"};
		int idx=0;
		int c= -1;
		try {
			fw=new FileWriter(file);
			bw=new BufferedWriter(fw);
			
//			while(0==0) { 
//				[ 이건 안됨 ? ]
//				c = bw.re
//				if(bw.ex)
			for(String g:lines) {
				bw.write(lines[idx++]);
				bw.newLine();
			}
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(bw!=null)bw.close();
				if(fw!=null)fw.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
