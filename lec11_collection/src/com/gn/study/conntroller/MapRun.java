package com.gn.study.conntroller;

import java.awt.geom.FlatteningPathIterator;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapRun {

	public static void main(String[] args) {
		// 1. HashMap 생성
		Map<String,Object> flower = new HashMap<String, Object>();
		
		// 2. HashMap 요소 추가
		flower.put("name", "샌더소니아");
		flower.put("lang", "성공");
		flower.put("price", 40000);
		
		//  중복된 key 사용
		flower.put("price", 50000);
		System.out.println(flower);
		
		// 4. HashMap 요소 조회(1)
		String f = (String)(flower.get("name"));
		System.out.println(f);
		System.out.println(flower.get("lang"));
		
		
		// 6. HashMap 요소 조회(3)
		// 1) HashMap 요소들의 key값으로 Set 만들기
		
		Set<String> keySet=flower.keySet();
		
		// 2) Iterator 만들기
		Iterator<String> itkey = keySet.iterator();
		// 3) 손을 집어서 확인 > hasNext()
		while(itkey.hasNext()) {
			// 4)확인한다 > next()
			String key = itkey.next();
//			System.out.println(key);
			Object value = flower.get(key); // 
			
			System.out.println(key+":"+value);
			
		}
		
		// (1) hashMap 요소들의 key+value 값으로 entrySet 만들기 
		Set<Entry<String,Object>>entrySet = flower.entrySet();
		// (2) Iterator 만들기
		Iterator<Entry<String,Object>> itEnter = entrySet.iterator();
		// (3) 손 hasNext
		while(itEnter.hasNext()) {
			// (4) next
			Entry<String,Object> entry=itEnter.next();
			String key = entry.getKey();
			Object value = entry.getValue();
			System.out.println(key+"="+value);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		// 3. HashMap<key,객체> 요소 추가
		Map<String,Snack> su = new HashMap<String,Snack>();
		su.put("다이제", new Snack("초코맛", 1700));
		su.put("새우깡", new Snack("매운맛", 900));
		su.put("포테이토칩", new Snack("양파맛", 500));
		System.out.println(su);
		
		// 5. HashMap<key,객체> 요소 조회(2)
		Snack s2 = su.get("다이제");
		
		System.out.println(s2);
		
		s2.setFlavor("기본맛"); // < 다이제 맛바뀜
		System.out.println(su);
		
		// 포테 양파맛 > 소금맛
		su.get("포테이토칩").setFlavor("소금맛"); // < 하나
		System.out.println(su);
		
		
		
		// 7. HashMap<객체> 요소 조회(2)
		// 1) keySet()
		Set<String> keySet1 = su.keySet();
		Iterator<String> itkey1 = keySet1.iterator();
		while(itkey1.hasNext()) {
			String key = itkey1.next();
			Snack value = su.get(key);
			System.out.println(key+":"+value);
		}
		
		
		// 2) entrySet()
		Set<Entry<String, Snack>>entrySet1 = su.entrySet();
		Iterator<Entry<String,Snack>>it1=entrySet1.iterator();
		while(it1.hasNext()) {
			Entry<String, Snack> en = it1.next();
			String key = en.getKey();
			Snack value = en.getValue();
			System.out.println(key+value);
		}
		
		// 8. HashMap 요소 삭제
		System.out.println(flower.size()+" : "+flower);
	//	flower.remove("price");
		//System.out.println(flower.size()+" : "+flower);
//		flower.clear();
		//System.out.println(flower.size()+" : "+flower);
		
		// 9. HashMap 요소 검색
		if(flower.containsKey("price")) {
			System.out.println("O");
			
		}else {
			System.out.println("X");
		}
		if(flower.containsValue(20000)) {
			System.out.println("싸다");
		}else {
			System.out.println("비싸다");
		}
		
		// 10. HashMap<객체> 요소 검색
		if(su.containsValue(new Snack("매운맛",900))) {
			System.out.println("내꺼");
		}
			
		// 11. LinkdHashMap
		Map<String, Object> flower2 = 
				//new HashMap<String, Object>();
				//new LinkedHashMap<String, Object>();
				new TreeMap<String, Object>(Collections.reverseOrder());// Collections.reverseOrder()반대기억
				
		flower2.put("price", 20000);
		flower2.put("lang", "고백");
		flower2.put("name", "튤립");
		
		System.out.println(flower2);
		
	}
	

}
