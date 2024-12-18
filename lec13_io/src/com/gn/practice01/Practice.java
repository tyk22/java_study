package com.gn.practice01;

import java.io.File;

public class Practice {

	public void deleteFile(File dir) {
//		File testDir = new File("C:\\test\\sub");
		File[] deltarr= dir.listFiles();
		
		for(File f : deltarr) {
			f.delete();
			System.out.println(f.getName()+"파일 삭제");
		}
	}
}
