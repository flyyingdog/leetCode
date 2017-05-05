package com.lxy.code;

public class ZigZag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ZigZag zg = new ZigZag();
		String s ="ABC";
		System.out.println("result is : " + zg.convert(s, 2));
	}

	public String convert(String s, int numRows) {
        if(numRows<=1 || s.length()<=2) return s;
        StringBuffer result=new StringBuffer();
        int n = numRows;
        int pos;
        StringBuffer []cs = new StringBuffer[n];
        for(int i=0;i<n;i++) cs[i]=new StringBuffer("");
        int len = s.length();
        for(int i = 0;i<len;i++){
        	pos = i%((n-1)*2);
        	if(pos<n)  cs[pos].append(s.charAt(i)); 
        	else	cs[2*n-pos-2].append(s.charAt(i));
        }
        for(int i =0;i<n;i++){
        	result.append(cs[i]);
        }
        return result.toString();
	}
	
}
/**
 * 0       8        16
 * 1     7 9      15
 * 2   6   10   14
 * 3 5     11 13
 * 4       12
 *i%8==0 a[1]==s[i]
 *(i-1)%6==0;	
 *count = i/8;
 *pos = (i%8)%5
 *if(i%8<5)    
 *cs[(i%8)%5]==cs[(i%8)%5]+s[i];  8=(n-1)*2 5=n
 *if(i%8>=5)
 *cs[n-(i%8-n)-2]
 *
 **/