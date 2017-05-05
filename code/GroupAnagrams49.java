package com.lxy.code;

public class GroupAnagrams49 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GroupAnagrams49 ga = new GroupAnagrams49();
		String str1 = "abcdefghijklmn";
		String str2 = "abcedfghijklmn";
		System.out.println(ga.compare(str1, str2));
	}
	
	public boolean compare(String a,String b){
		int l1 = a.length();
		int l2 = b.length();
		if(l1!=l2) return false;
	    byte[] b1 = a.getBytes();  
        byte[] b2 = b.getBytes();  
        int[] bCount = new int[256];  
        for(int i=0;i<256;i++){  
            bCount[i] = 0;  
        }  
        for(int i=0;i<b1.length;i++)  
            bCount[b1[i]-'0']++;  
        for(int i=0;i<b2.length;i++)  
            bCount[b2[i]-'0']--;  
        for(int i=0;i<256;i++){  
            if(bCount[i]!=0)  
                return false;  
        }  
        return true; 
	}

}
