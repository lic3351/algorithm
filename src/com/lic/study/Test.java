package com.lic.study;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;

public class Test {

	public static void main(String[] args) {

		String s="11";
		int YAN=241505056;
		System.out.println(Integer.valueOf(s, 2));
		int [] a=new int[10];
		System.out.println(Arrays.toString(a));
		try {
			File f=new File("e:\\workspace\\int1.txt");
			DataInputStream in=new DataInputStream(new BufferedInputStream(new FileInputStream(f)));
			int temp;
			long i=0;
			long l=f.length()/4;
			while(i<l){
				temp=in.readInt();
				i++;
				if(temp==YAN){
					System.out.println("haha "+YAN+" is exists");
					return;
				}
			}
			System.out.println(YAN+" is not exists you are samrt!");
			return;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
