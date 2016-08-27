package com.lic.study;

public class DynamicP {

	
		public static void main(String[] args) {
			
			int[] lens={0,1,2,3,4,5,6,7,8,9,10};
			int[] p=   {0,1,5,8,9,10,17,17,20,24,30};
			for(int i=0;i<=10;i++){
			System.out.println(cut_rod(p,i));}
		}
		
		public static int cut_rod(int[] p,int n){
			int q=-1; 
			if(0==n)return 0;
			for(int i=1;i<=n;i++){
				
				
				
				int temp=p[i]+cut_rod(p,n-i);
				q=(q>=temp)?q:temp;
			}
			return q;
		}
		
}
