package com.lic.study;

public class Test0 {

	public static void main(String[] args) {

		int i=1315246880;
		System.out.println(Integer.toBinaryString(i));//1001110011001010001001100100000
		
		String s="0001110011001010001001100100000";
		System.out.println(Integer.valueOf(s,2));
		System.out.println(Integer.MAX_VALUE);
	}

}
