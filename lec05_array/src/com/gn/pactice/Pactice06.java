package com.gn.pactice;

public class Pactice06 {

	public static void main(String[] args) {
//		(0,0)(0,1)(0,2)
//		(1,0)(1,1)(1,2)
		String[][]monj= {{"(0,0)","(0,1)","(0,2)"},{"(1,0)","(1,1)","(1,2)"}};
		String[][]me;
		for(int i=0;i<monj.length;i++) {
			
			for(int j=0;j<monj[i].length;j++) {
				System.out.print(monj[i][j]);
				
			}
				if ( i != monj.length-1) { // 1 !=(2-1)1 
					System.out.println();
			}
			
			
		}

	}

}
