package com.gn.practice03;

import java.io.File;
import java.io.FileOutputStream;

public class Run {

	public static void main(String[] args) {
		File sampl = new File("C:\\test\\sub");
		File file = new File(sampl+"\\애국가1.dat");
		FileOutputStream out = null;
		
		try {
			out = new FileOutputStream(file);
			String song = "동해물과 백두산이 마르고 닳도록 하느님이 보우하사"
					+ "\n우리나라 만세 무궁화 삼천리 화려강산"
					+ "\n대한사람 대한으로 길이 보전하세";
			byte[] arr = song.getBytes();
			out.write(arr);

		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(out!=null) {
					out.close();
				}
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}

}
