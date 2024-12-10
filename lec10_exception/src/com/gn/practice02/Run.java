
package com.gn.practice02;

public class Run {
	public static void main(String[] args) {
		Practice p = new Practice();
		p.printStrLength(null);
		
		//System.out.println(p.printStrLength(null));
		/*String str = p.printStrLength(null);
		
		try {
		System.out.println(str.length());
		}catch(NullPointerException e) {
			System.out.println("NullPointerException 발생: "+e.getMessage());
		}
		}*/
}
}

/*NullPointerException 발생: Cannot invoke 
"String.length()" because "str" is null*/