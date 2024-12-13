package com.gn.practice09.run;

import java.util.HashMap;
import java.util.Map;

import com.gn.practice09.model.vo.Information;

public class Run {
	public static void main(String[] args) {
		
		
		Map<String,Information> ph =
			new HashMap<String,Information>();
		
		ph.put("John", new Information("123-456-7890",
				3800000));
		ph.put("Emma", new Information("987-654-3210",
				2300000));
		ph.put("Tom", new Information("555-123-4567",
				4600000));
		
		//System.out.println("변경전 : "+ ph);
		ph.put("John", new Information("123-456-7890", 4100000));
		
		//
		ph.get("Emma").setPhone("111-111-1111");
		System.out.println("=== Emma의 정보 ===");
		System.out.println(ph.get("Emma").getPhone());
		System.out.println(ph.get("Emma").getSalary());
		//System.out.println("변경후 : "+ ph);
		
		
	}
}
