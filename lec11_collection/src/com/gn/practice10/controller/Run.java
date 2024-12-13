package com.gn.practice10.controller;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.gn.practice10.model.vo.Planet;

public class Run {

	public static void main(String[] args) {
		
		Map<String,Planet> pl = new HashMap<String,Planet>();

		pl.put("Mercury", new Planet("수성", 4879, 0.24));
		pl.put("Venus", new Planet("금성", 12104, 0.62));
		pl.put("Earth", new Planet("지구", 12742, 1.0));
		pl.put("Mars", new Planet("화성", 6779, 1.88));
		
		System.out.println("*** keySet() 사용 ***");
		Set<String> keySet= pl.keySet();
		Iterator<String> itpl = keySet.iterator();
		while(itpl.hasNext()) {
			String key = itpl.next();
			Planet value = pl.get(key);
			
			System.out.println("행성 이름: "+key+value);
	}
		
		System.out.println("*** entrySet() 사용 ***");
		Set<Entry<String,Planet>> el = pl.entrySet();
		Iterator<Entry<String,Planet>> itel=el.iterator();
		while(itel.hasNext()) {
			Entry<String,Planet> key = itel.next();
			String k = key.getKey();
			Planet v = pl.get(k);
			System.out.println("키 : "+k+", 값: "+v.getName()+" (지름: "+
			v.getDiameter()+", 공전주기: "+v.getSalary()+"년)");
			
		}
		
}
}
