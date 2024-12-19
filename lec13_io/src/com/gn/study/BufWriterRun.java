package com.gn.study;

import java.awt.image.DataBufferDouble;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.BreakIterator;

public class BufWriterRun {

	public static void main(String[] args) {
		// 1. 디렉토리
		File dir = new File("C:\\test\\sub\\");
		if(!dir.exists()) {
			dir.mkdirs();
		}
		File file = new File(dir,"sample2.txt");
		FileWriter fw = null;
		//BufferedWriter bw = null;
		try {
			//fw = new FileWriter(file);
			//bw = new BufferedWriter(fw);
			
			// 선언과 생성
			try(BufferedWriter bw = new BufferedWriter(new FileWriter(file))){
//			try(FileWriter fw = new FileWriter(file)){
			bw.write("안녕하세요");
			bw.newLine();
			bw.write("반갑습니다.");
			bw.newLine();
			}
			}catch(IOException e) {
			e.printStackTrace();
		}
//		finally {
//			try {
//				if(bw!=null)bw.close();
//				if(fw!=null)fw.close();
//			}catch(IOException e) {
//				e.printStackTrace();
//			}
		}
	}

