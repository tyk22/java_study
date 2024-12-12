package com.gn.practice07.controller;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.gn.practice07.model.vo.Equipment;

public class Run {

	public static void main(String[] args) {
		Set<Equipment> storage1 = new HashSet<Equipment>();
		Set<Equipment> storage2 = new HashSet<Equipment>();
		// Set<Equipment> storage = new HashSet<Equipment>();
		
		
		storage1.add(new Equipment("라켓", 15000));
		storage1.add(new Equipment("배트", 6000));
		storage1.add(new Equipment("축구공", 3000));
		
		storage2.add(new Equipment("배트", 6000));
		storage2.add(new Equipment("야구공", 5000));
		storage2.add(new Equipment("글로브", 9000));
		
		
		System.out.println("***합집합***");
		Set<Equipment> dife = new HashSet<Equipment>(storage1);
		dife.addAll(storage2);
		Iterator<Equipment> iterator = dife.iterator();
		while(iterator.hasNext()) {
			Equipment st = iterator.next();
			System.out.println("- "+st);
			
		}
//		iterator.remove();
//		dife.retainAll(storage2);
		
		
		System.out.println("***교집합***");
		Set<Equipment> dor = new HashSet<Equipment>(storage1);
		dor.retainAll(storage2);
		Iterator<Equipment> iterator1 = dor.iterator();
		//System.out.println(storage1);
		//storage1.removeAll(storage2);
		//System.out.println(storage1);
		
		while(iterator1.hasNext()) {
			Equipment st = iterator1.next();
			System.out.println("- "+st);
		}
		System.out.println("***차집합***");
		Set<Equipment> dor2 = new HashSet<Equipment>(storage1);
		dor2.removeAll(storage2);
		Iterator<Equipment> iterator2 = dor2.iterator();
		
		while(iterator2.hasNext()) {
			Equipment st = iterator2.next();
			System.out.println("- "+st);
		}
		
	}

}
