package com.gayu.problems1;

public class SumOfNumber {

	int sumNum(int x,int y) {
		int sum=x+y;
		while(true) {
			int total=1;
			String strsum=(sum+"");
			if(strsum.length()==1) {
				return Integer.valueOf(strsum);
			}
			char array[]=strsum.toCharArray();
			for(int i=0;i<array.length;i++) {
				int no=Integer.valueOf(array[i]+"");
				total=total*no;
			}
			sum=total;
		}
	}

	public static void main(String[] args) {
		SumOfNumber sn=new SumOfNumber();
		int sum=sn.sumNum(45, 54);
		System.out.println(sum);
	}

}
