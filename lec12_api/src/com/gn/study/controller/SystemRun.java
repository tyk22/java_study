package com.gn.study.controller;

public class SystemRun {

	public static void main(String[] args) {
		long be = System.currentTimeMillis();
		// 1. arraycopy()
		int[] src = {10,15,20,25,30};
		int[] dst = new int[src.length];
		
//		for(int i = 0; i < src.length;i++) {
//			dst[i] = src[i];		
//		}
		//			(원본배열, 시작위치, 대상 배열, 시작위치, 복사 할 길이)
		System.arraycopy(src, 0, dst, 0, src.length);
		for(int d : dst) {
			System.out.print(d+" | ");
		}
		
		// 2. curretTimeMillis()
		long timeStamp = System.currentTimeMillis();
		System.out.println(timeStamp);
		
		long aft = System.currentTimeMillis();
		
		System.out.println((aft-be)+"밀로초 걸림");
		
	}

}
