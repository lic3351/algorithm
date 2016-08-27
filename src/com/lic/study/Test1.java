package com.lic.study;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Arrays;
import java.util.Random;

public class Test1 {

	public static void main(String[] args) {
		File f=new File("e:\\workspace\\int1.txt");
		File f2=new File("e:\\workspace\\int2.txt");
		try {
			DataOutputStream out =new DataOutputStream( new BufferedOutputStream(new FileOutputStream(f)));
			Random r=new Random();
			for(int i=0 ;i<2147483647;i++){
				if(i!=998998998){
				//int k=r.nextInt(Integer.MAX_VALUE);
				out.writeInt(i);
				}
			}
//			out.writeInt(256);
			out.close();
			
			DataInputStream in=new DataInputStream(new BufferedInputStream(new FileInputStream(f)));
			int k2;
			System.out.println(f.length());
			for(int i=0;i<1;i++){
				//System.out.println(in.readInt());
			}
			byte[] temp_in=new byte[16];
			while(in.read(temp_in)!=-1){}
			System.out.println(Arrays.toString(temp_in));
			System.out.println("------------end ");
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
	}

}
