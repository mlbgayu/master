package com.gayu.work1;

import java.util.Scanner;

/*This class finds even or add number*/

public class FindEvenOdd {

	public static void main(String[] args) {
		for(int i=0;i<1;i++) {
        System.out.println("print any no");
		}
        Scanner n=new Scanner(System.in);
        int num=n.nextInt();
        System.out.println("your number is:"+num);
        
        if(num%2==0) 
  
        {
        	System.out.println("your number is even no" );
        }
        
        else {
        	System.out.println("your number is odd no");
        }
        }  
	}


