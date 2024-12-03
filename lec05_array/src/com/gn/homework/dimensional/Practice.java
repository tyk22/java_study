package com.gn.homework.dimensional;

public class Practice {
	
	public void practice01() {
		int a[] = {152, 180, 165, 158, 171};
		for (int i=0; i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
				int tem = a[j];
				a[j]=a[i];
				a[i]=tem;
				}
			}
		}
		for ( int i = 0; i <a.length;i++) {
				if(i<a.length-1) {
					System.out.print(a[i]+", ");
					// break;
				}else {
					System.out.println(a[i]);
				}
		}
	} // 01 종료

	public void practice02() {
		
	}
	
}
