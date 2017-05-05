package com.lxy.code;

import java.util.ArrayList;
import java.util.List;

public class MergeIntervals {

	public class Interval {
		int start;
		int end;
		Interval() { start = 0; end = 0; }
		Interval(int s, int e) { start = s; end = e; }
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		int x[][] = new int[0][0];
		System.out.println(x[0][0]);
	}
	
	
	
	public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
		List<Interval> res = new ArrayList<Interval>();
		int l = intervals.size();
		if(l==0){
			res.add(newInterval);
			return res;
		}
		if(newInterval.end<intervals.get(0).start){
			res.add(newInterval);
			res.addAll(intervals);
			return res;
		}
		if(newInterval.start>intervals.get(l-1).end){
			intervals.add(newInterval);
			return intervals;
		}
		
		int i = 0;
		int start=0;
		int end=0;
		for(i = 0;i<l;i++){
			Interval temp = intervals.get(i);
			if(newInterval.start>temp.end){
				res.add(temp);
			}else{
				start=Math.min(newInterval.start, temp.start);
				break;
			}
		}
		for(i=i;i<l;i++){
			if(newInterval.end>intervals.get(i).end){
				continue;
			}else{
				break;
			}
		}
		if(i==l) end =newInterval.end;
		else{
			if(newInterval.end<intervals.get(i).start)
				end = newInterval.end;
			else{
				end = intervals.get(i).end;
				i++;
			}
		}
		res.add(new Interval(start,end));
		for(int j = i;j<l;j++){
			res.add(intervals.get(j));
		}
		return res;
	}
	
	

}
