package com.lxy.code;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class TrappingRainWater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] nums={0,1,0,2,1,0,1,3,2,1,2,1};
//		TrappingRainWater trw = new TrappingRainWater();
//		
//		System.out.println(trw.trap(nums));
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
//    	for(Map.Entry<Integer, Integer>entry:map.entrySet()){
//    		if(entry.getKey()<=height[i]){
//    			result=result+i-entry.getValue()-1;
//    		}
//    	}
    	ArrayList<Integer> list = new ArrayList<Integer>();
    	for(int i = 0;i<5;i++) list.add(i);
    	list.add(2, 3);
    	Iterator it = list.iterator();
    	while(it.hasNext()){
    		System.out.println(it.next());
    	}
	}
	
    public int trap(int[] height) {
        int l = height.length;
        if(l<3) return 0;
        int result = 0;
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        int idx = 0;
        while(height[idx]==0) idx++;
        for(int i = idx;i<l;i++){
//        	if(map.isEmpty()){
//        		map.put(height[i],i);
//        		continue;
//        	}
        	Iterator<Map.Entry<Integer, Integer>> entries = map.entrySet().iterator();  
        	  
//        	while (entries.hasNext()) {  
//        	    Map.Entry<Integer, Integer> entry = entries.next();  
//        	    if(entry.getKey()<=height[i]){
//        			result=result+i-entry.getValue()-1;
//        			entries.remove();
//        		}        	  
//        	}
        	for(Map.Entry<Integer, Integer>entry:map.entrySet()){
        		if(entry.getKey()<=height[i]){
        			result=result+i-entry.getValue()-1;
        		}
        	}
        	for(int j = 0;j<=height[i];j++){
        		map.put(j, i);
        	}
        }
    	return result;
    }
}
