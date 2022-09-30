package com.gayu.problems1;

public class LongestRun {
	
		int longestnum(int[]array) {
			int a=1;
			int b=0;
			for(int i=1;i<array.length;i++) {
				
				if (array[i]==(array[i-1]+1)) {
				a++;
			}
			else {
				if(a>b) {
					b=a;
					a=1;
				}
			}		
			}
		return b;
		}
	public static void main(String[] args) {
		int array[]= {1,2,3,4,5,7,8,9};
		LongestRun lr=new LongestRun();
		int total=lr.longestnum(array);
		System.out.println("The total is "+total);
	}

}
