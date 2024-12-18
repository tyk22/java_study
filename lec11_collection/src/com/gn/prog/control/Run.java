package com.gn.prog.control;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import com.gn.prog.model.vo.Chbin;
import com.gn.prog.model.vo.Day3;
import com.gn.study.conntroller.Snack;

public class Run {

	public static void main(String[] args) {
		Day3 d = new Day3();
		int[] dasd = {1,1,2,2};
		//d.solution(1,2,3,4,5);
		
			
		  int answer = 0;
	       int win = 0;
	       int mode = 0;
	        Map<Integer,Integer> ab = new HashMap<Integer,Integer>();
	        
	        Set<Integer> keySet= ab.keySet();
	        
	        for(int i = 0; i < dasd.length; i++) {
	        	
	        	int count=0;
	        	
	        	for(int j = 0 ; j<dasd.length;j++) {
	        		if(dasd[i]==dasd[j]) {
	        			count++;
	        		}
	        		
	        	ab.put(dasd[i],count);
	        	}
	        }
	        
	        System.out.println(ab);
	        
	 
	       for(int key : keySet) {
	    	   int cont = ab.get(key);
	    	   if(cont>win) {
	    		   win = cont;
	    		   answer=key;
	    	   	}else if(cont==win) {
	    	   		answer = -1;
	    		   
	    	   }
	      }
	       
	        System.out.println(answer);


	}

}
