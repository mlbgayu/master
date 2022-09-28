package com.gayu.problems2;

/* A consecutive-run is a list of adjacent, consecutive integers. This list can be either 
   increasing or decreasing. Create a function that takes an array of numbers and returns 
   the length of the longest consecutive-run.
   
   Example -

    longestRun([1, 2, 3, 5, 6, 7, 8, 9]) ➞ 5 // Two consecutive runs: [1, 2, 3] and [5, 6, 7, 8, 9] (longest).
longestRun([3, 5, 7, 10, 15]) ➞ 1 // No consecutive runs, so we return 1.
*/
public class ConsecutiveRun {

	
	int longestRun(int[] array) {
		
		int temp =1 ;
		int prev = 0;
		for ( int i=1;i<array.length;i++) {
			System.out.println(temp);
				if(array[i]==(array[i-1]+1)) {
				temp++;
				}
				else {
					if(temp>prev) {
						prev = temp;
						temp = 1;
					}
				}
		}
		
		return temp;
	}
	
	public static void main(String[] args) {
		
		int array[] = {1, 2, 3, 5, 6, 7, 8, 9};
//		int array[] = {3, 5, 7, 10, 15};
		
		ConsecutiveRun obj = new ConsecutiveRun();
		int total = obj.longestRun(array);
		System.out.println("The total is "+total);
		
		
	}
}
