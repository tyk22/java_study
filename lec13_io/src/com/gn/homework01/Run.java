package com.gn.homework01;

public class Run {

	public static void main(String[] args) {
		Practice p = new Practice();
		String song = "나비야, 나비야 이리 날아오너라"
				+ "\n노랑나비, 흰 나비 춤을 추며 오너라"
				+"\n봄바람에 꽃잎도 방긋방긋 웃으며"
				+ "\n참새도 짹짹짹 노래하며 춤춘다";
		long time = System.nanoTime();
		p.FileOut(song);
		long logT = System.nanoTime();
		long math = logT- time;
//		math= math/1000;
		
		System.out.println("경과(초) : "+(math / 1_000_000_000.0));
		
		time = System.nanoTime();
		p.BufferOut(song);
		logT=System.nanoTime();
		math = logT-time;
//		math = math/1000;
		System.out.println("경과(초) : "+(math / 1_000_000_000.0));
	}

}
