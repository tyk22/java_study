package com.gn.homework01;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.imageio.stream.FileImageOutputStream;

public class Practice {
	
	public void FileOut(String song) {
		File file = new File("C:\\test\\sub","나비야1.dat");
		FileOutputStream fr = null;
		try {
			fr = new FileOutputStream(file);
			fr.write(song.getBytes());
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(fr!=null)fr.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void BufferOut(String song) {
		File dir = new File("C:\\test\\sub");
		File file = new File(dir,"나비야2.dat");
		FileOutputStream fr = null;
		BufferedOutputStream br = null;
		
		try {
			fr = new FileOutputStream(file);
			br = new BufferedOutputStream(fr);
			
			br.write(song.getBytes());
			
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
