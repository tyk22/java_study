package com.gn.practice05;

import java.util.Objects;

public class Song {
	private String name;
	private String singer;
	
	public Song() {
		
	}
	public Song(String name, String singer) {
		this.name=name;
		this.singer=singer;
	}
	@Override
	public int hashCode() {
		return Objects.hash(name,singer);
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Song) {
			Song s = (Song)obj;
			if(s.equals(name)&&s.equals(singer)) {
				return true;
			}else {
				return false;
			}
		}else {
			return true;
		}
	}
	@Override
	public String toString() {
		return "{제목="+name+"가수="+singer+"}";
	}
}
