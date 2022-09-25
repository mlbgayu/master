package com.gayu.myenums;
enum names{gayathri,bhavya,vyas}
public class EnumProgram {

	public static void main(String[] args) {
		for(names m:names.values()) {
			System.out.println("value is:"+m);
		}

	}

}
