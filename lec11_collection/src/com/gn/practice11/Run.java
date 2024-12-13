package com.gn.practice11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

import com.gn.study.conntroller.Snack;

public class Run {

	public static void main(String[] args) {
		Map<String,Fruit> fr = new HashMap<String,Fruit>();
		fr = new TreeMap<String, Fruit>();
		fr.put("1", new Fruit("귤", "제주", 10, 15000));
		fr.put("2", new Fruit("사과", "예산", 5, 25000));
		fr.put("3", new Fruit("포도", "강화도", 5, 35000));
		fr.put("4", new Fruit("배", "나주", 10, 50000));
		
		System.out.println("=== 전체 데이터 조회 ===");
		
		Set<String> frkey = fr.keySet();
		Iterator<String> itfrkey = frkey.iterator();
		while(itfrkey.hasNext()) {
			String in = itfrkey.next();
			Fruit getsys = fr.get(in);
			System.out.println(in+" : [name="+getsys.getName()+
					", origin="+getsys.getOrigin()+
					", count="+getsys.getCount()+
					", price="+getsys.getPrice()+"]");
		}
		
		System.out.println("=== 가격 20000원 이상 ===");
		
		
		
		/*Set<String> frkey2 = fr.keySet();
		Iterator<String> itfrkey2 = frkey2.iterator();
		while(itfrkey2.hasNext()) {
			String in = itfrkey2.next();
			Fruit getsys = fr.get(in);
			if(getsys.getPrice()>=20000) {
			System.out.println(in+" : [name="+getsys.getName()+
					", origin="+getsys.getOrigin()+
					", count="+getsys.getCount()+
					", price="+getsys.getPrice()+"]");
		}*/
		
		/*Set<Entry<String, Fruit>>entrySet1 = su.entrySet();
		Iterator<Entry<String,Snack>>it1=entrySet1.iterator();
		while(it1.hasNext()) {
			Entry<String, Snack> en = it1.next();
			String key = en.getKey();
			Snack value = en.getValue();
			System.out.println(key+value);
		}*/
		
		Set<Entry<String, Fruit>> ent1 = fr.entrySet();
		Iterator<Entry<String, Fruit>> it1 =ent1.iterator();
		while(it1.hasNext()) {
			Entry<String,Fruit> eman=it1.next();
			String keynembs=eman.getKey();
			Fruit val=eman.getValue();
			if(val.getPrice()>=20000) {
				System.out.println(keynembs+" : [name="+val.getName()+
						", origin="+val.getOrigin()+
						", count="+val.getCount()+
						", price="+val.getPrice()+"]");
			}
		}

			System.out.println("=== 이름이 한글자인 과일 ===");
			
			Set<String> frkey1 = fr.keySet();
			Iterator<String> itfrkey1 = frkey1.iterator();
			while(itfrkey1.hasNext()) {
				String in = itfrkey1.next();
				Fruit getsys1 = fr.get(in);
				if(getsys1.getName().length()==1)
				System.out.println(in+" : [name="+getsys1.getName()+
						", origin="+getsys1.getOrigin()+
						", count="+getsys1.getCount()+
						", price="+getsys1.getPrice()+"]");
			}
			
			System.out.println("=== 포도 가격 인상 ===");
			
			fr.get("3").setPrice(28000);
			Set<Entry<String, Fruit>> ent2 = fr.entrySet();
			Iterator<Entry<String, Fruit>> it2 =ent2.iterator();
			while(it2.hasNext()) {
				Entry<String,Fruit> eman=it2.next();
				String keynembs=eman.getKey();
				Fruit val=eman.getValue();
				//if(fr.containsValue(new Fruit("포도", "강화도", 5, 28000))) 
				if(val.getPrice()==28000)
				{
					System.out.println(keynembs+" : [name="+val.getName()+
							", origin="+val.getOrigin()+
							", count="+val.getCount()+
							", price="+val.getPrice()+"]");
				}
			}
			
	}

}
