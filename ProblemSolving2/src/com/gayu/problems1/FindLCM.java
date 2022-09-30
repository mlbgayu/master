package com.gayu.problems1;

import java.util.Arrays;

public class FindLCM {
	int intArray[];

	FindLCM(int intArray[]) {
		this.intArray = intArray;
	}

	int findlcm() {
        	int  FindLCM=1;
        	int divisor=2;
        	while(true) {
        		int counter = 0;
    			boolean divisible = false;
    			for (int i = 0; i < this.intArray.length; i++) {
    				if (this.intArray[i] == 0) {
    					return 0;
        	}
        	if(this.intArray[i]==1) {
        		counter++;
        	}
        	if(this.intArray[i]% divisor==0) {
        		divisible =true;
        		this.intArray[i]=intArray[i]/divisor;
        	}
        		System.out.println(Arrays.toString(this.intArray));
        	}
    			if(divisible) {
    				FindLCM=FindLCM*divisor;
    			}else {
    				divisor++;
    			}
    			if (counter == this.intArray.length) {
    				return FindLCM;
    			}
        }
	}
	public static void main(String[] args) {
		int intArray[] = { 8,7,6,5,4,4,5,6,7,8 };
		FindLCM lcm=new FindLCM(intArray);
		int result=lcm.findlcm();
		System.out.println("The Least Common Multiple of"+Arrays.toString(intArray)+"is"+result);
	}
}
