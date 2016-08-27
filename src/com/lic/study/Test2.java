package com.lic.study;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Test2 {

	public static void main(String[] args) {

		String rsint="";
		int index=30;
		String s=div22("int1",index);
		while(Long.parseLong(s.split("@")[1])>0){
			int rl=Integer.parseInt(s.split("@")[2]);
			rsint+=rl;
			s=div22(s.split("@")[0],--index);
		}
		rsint+=s.split("@")[2];
		char[] rs2=new char[index];
		Arrays.fill(rs2, '0');
		rsint+=new String(rs2);
		System.out.println(rsint);
		System.out.println(Integer.valueOf(rsint,2));
	}
	
	
	public  static String div22(String filename,int index){
		System.out.println("filename:"+filename+"    "+index);
		File fin=new File("e:\\workspace\\"+filename+".txt");
		String lowname=filename+0;
		String hiname=filename+1;
		File fout_low=new File("e:\\workspace\\"+lowname+".txt");
		File fout_hi=new File("e:\\workspace\\"+hiname+".txt");
		String rs;
		long inl=fin.length()/4;
		System.out.println("flie length:"+fin.length());
		long low=0,hi=0;
		int temp;
		try{
		DataInputStream in=new DataInputStream(new BufferedInputStream(new FileInputStream(fin)));
		DataOutputStream out_low =new DataOutputStream( new BufferedOutputStream(new FileOutputStream(fout_low)));
		DataOutputStream out_hi =new DataOutputStream( new BufferedOutputStream(new FileOutputStream(fout_hi)));
		
		for(long i=0;i<inl;i++){
			temp=in.readInt();
//			System.out.println(temp);
			if((temp & (1<<index))==1<<index){
				out_hi.writeInt(temp);hi++;
			}else{
				out_low.writeInt(temp);low++;
			}
		}
		in.close();
		out_low.close();
		out_hi.close();
		}catch(Exception e){
			
		}
		if(low<=hi){
			 rs=lowname+"@"+low+"@0";
			 fout_hi.delete();
		}else {rs=hiname+"@"+hi+"@1";fout_low.delete();}
		System.out.println(rs);
		return rs;
	}
}
