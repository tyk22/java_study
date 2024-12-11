package com.gn.practice03;


import java.util.*;

public class MovieTheater {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> seats = new ArrayList<String>();
		seats.add("A2");
		seats.add("A1");
		seats.add("B1");
		seats.add("B2");
		System.out.println("초기 좌석 목록 : "+seats);
		seats.add(2, "A3");
		System.out.println("A3 좌석 추기 후 : "+seats);
		System.out.print("예약 좌석 : ");
		String ja = sc.next();
		
		
		if(seats.contains(ja)) {
			for(int i=0;i<seats.size();i++) {
				if(seats.indexOf(ja)==i) {
					seats.set(i, ja+"(예약)");
				}
			}		
		}else {
			System.out.println(ja+"은(는) 존재하지 않는 좌석입니다.");
		}
		
		System.out.println("좌석 예약 후 : "+seats);
		System.out.print("삭제 좌석 : ");
		ja = sc.next();
		if(seats.contains(ja)) {
		for(int i=0;i<seats.size();i++) {
			if(seats.indexOf(ja)==i) {
				seats.remove(i);
				}
			}
		}else {
			System.out.println(ja+"좌석은 목록에 없습니다.");
		}
		System.out.println("좌석 삭제 후 : "+seats);
		Collections.sort(seats);
		System.out.println("좌석 정렬 후 : "+seats);
		
	}

}
