package com.lxy.code;

public class Divide29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public int divide(int dividend, int divisor) {
    	if(divisor==0) return Integer.MAX_VALUE;
    	if(dividend==0) return 0;
    	int count = 0;
    	boolean plus;
    	if((dividend>0) == (divisor>0)){
    		plus = false;
    	}else{
    		plus = true;
    	}
    	dividend = Math.abs(dividend);
    	divisor = Math.abs(divisor);
    	while(dividend>=divisor){
    		dividend=dividend-divisor;
    		count++;
    	}
    	if(plus) count=0-count;
    	return count;
    }

}
