package com.lxy.codingTEST;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MainTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String[] test = s.split(" ");
		for(String c:test){
			System.out.println(c);
		}
	}
	
}
