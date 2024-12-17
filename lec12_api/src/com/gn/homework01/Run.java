package com.gn.homework01;

public class Run {

	public static void main(String[] args) {
		
		String str ="김철수,25,동작구,남\n홍길동,27,관악구,남\n이영희,29,강서구,여";
		String[] Persons = str.split("\n"); 
		Person[] arr = new Person[3];
		
		
		
//		for (int i = 0 ; int)
		//System.out.println(Person[0]);
		
		int i = 0;
		
		for(String st : Persons) {
			String[] stll = st.split(",");
			//System.out.println(st);
			arr[i] = new Person(stll[0], Integer.parseInt(stll[1]), stll[2],stll[3].charAt(0));
				i++;
			
		}
		for(Person g : arr) {
			 System.out.println(g);
		}
		
	
	}

}
