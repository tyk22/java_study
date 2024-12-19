package com.gn.practice05;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Run {

	public static void main(String[] args) {
		File dir = new File("C:\\test\\sub");
		File file = new File(dir,"애국가1.dat");
		FileInputStream inpu = null;
		try {
			inpu = new FileInputStream(file);
			byte[] arr = new byte[(int)file.length()];
			int idx = 0;
			int date;
			while(0==0) {
				date = inpu.read();
				if(date==-1) {
					break;
				}
				arr[idx++] = (byte)date;
			}
			String str = new String(arr);
			System.out.println(str);
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(inpu!=null)inpu.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}

}
