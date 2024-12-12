package com.gn.practice05;

import java.util.HashSet;
import java.util.Set;

public class Run {

	public static void main(String[] args) {
		Set<Song> me = new HashSet<Song>();
		Set<Song> me1 = new HashSet<Song>();
		
		me.add(new Song("APT", "로제"));
		me.add(new Song("Whiplash", "에스파"));
		me.add(new Song("POWER", "G-DRAGON"));
		
		me1.add(new Song("Whiplash", "에스파"));
		me1.add(new Song("HAPPY", "DAY6"));
		me1.add(new Song("HAPPY", "DAY6"));
		
		System.out.println(me);
		System.out.println(me1);
		
	}

}
