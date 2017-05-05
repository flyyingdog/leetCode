package com.lxy.code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class SubstringWithAllWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public List<Integer> findSubstring(String s, String[] words) {
    	int l = s.length();
    	int n = words[0].length();
    	int m = words.length;
        List<Integer> result = new ArrayList<Integer>();
        if (l<n*m) return result;
        List<String> list = new ArrayList<String>();
        list = Arrays.asList(words);
        HashSet<String> hs = new HashSet<String>(list);
        for(int i=0;i<l-n*m;i+=n){
        	if(hs.contains(s.substring(i, i+n))){
        		String ts = s.substring(i,i+n*m);
        		HashSet<String> th = hs;
        		boolean ifMatch = true;
        		for(int j = 0;j<m;j+=n){
        			if(th.contains(ts.substring(j, j+n))){
        				th.remove(ts.substring(j, j+n));
        			}else{
        				ifMatch = false;
        				break;
        			}
        		}
        		if(ifMatch) result.add(i);
        	}
        }
        for(int i=1;i<l-n*m;i+=n){
        	if(hs.contains(s.substring(i, i+n))){
        		String ts = s.substring(i,i+n*m);
        		HashSet<String> th = hs;
        		boolean ifMatch = true;
        		for(int j = 0;j<m;j+=n){
        			if(th.contains(ts.substring(j, j+n))){
        				th.remove(ts.substring(j, j+n));
        			}else{
        				ifMatch = false;
        				break;
        			}
        		}
        		if(ifMatch) result.add(i);
        	}
        }
        for(int i=2;i<l-n*m;i+=n){
        	if(hs.contains(s.substring(i, i+n))){
        		String ts = s.substring(i,i+n*m);
        		HashSet<String> th = hs;
        		boolean ifMatch = true;
        		for(int j = 0;j<m;j+=n){
        			if(th.contains(ts.substring(j, j+n))){
        				th.remove(ts.substring(j, j+n));
        			}else{
        				ifMatch = false;
        				break;
        			}
        		}
        		if(ifMatch) result.add(i);
        	}
        }
        
        
    	return null;
    }	
    
}
