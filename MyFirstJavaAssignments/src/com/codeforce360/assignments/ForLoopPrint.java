package com.codeforce360.assignments;

public class ForLoopPrint {

	
	 static void incrementalPrint(int n ) {
		 for (int i = 1; i <= n; i++) {

				for (int j = 1; j <= 5; ++j) {
					System.out.print(i);
				}
				System.out.println();
			}
	 }
  
	 	static void decrementalPrint(int n) {
	 		 for (int i = n; i >= 1; i--) {

					for (int j = 1; j <= 5; ++j) {
						System.out.print(i);
					}
					System.out.println();
	 		 }
	 	}
	 	
	 	static void orderedPrint(int n) {
	 		 for (int i = n; i >= 1; i--) {

					for (int j = 1; j <= 5; ++j) {
						System.out.print(j);
					}
					System.out.println();
	 		 }
	 	}
	 	
	
	public static void main(String[] args) {
		int x=10;
		System.out.println("Incremental Print");
		ForLoopPrint.incrementalPrint(x);
		System.out.println("Decremental Print");
		ForLoopPrint.decrementalPrint(x);
		System.out.println("Ordered Print");
		ForLoopPrint.orderedPrint(x);
	}
}
