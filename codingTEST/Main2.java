package com.lxy.codingTEST;

import java.util.List;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public static double sameColor(List list){
		
		return 0.1;
	}
	
	public static double disColor(List red,List green,List blue){
		
		return 0.1;
	}
	
	public static double calculate(Sanjiao[] sanjiao){
		double[] xa = new double[3];
		double[] ya = new double[3];
		double[] za = new double[3];
		for(int i = 0;i<3;i++){
			xa[i]=(double)sanjiao[i].x;
			ya[i]=(double)sanjiao[i].y;
			za[i]=(double)sanjiao[i].z;
		}
		
		return xa[0]*;
	}
	
	class Sanjiao{
		int c;
		int x;
		int y;
		int z;
		Sanjiao(){};
		Sanjiao(int c ,int x,int y,int z){
			this.c=c;
			this.x=x;
			this.y=y;
			this.z=z;
		}
	}

}
