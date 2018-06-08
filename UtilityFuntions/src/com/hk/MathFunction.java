package com.hk;

public class MathFunction {
	
	public static double hkRound(Double targetValue, int sequence){
		//Fill the logic
		double decimal = Math.pow(10, sequence);
		double returnValue = Math.round(targetValue*decimal)/decimal;
		return returnValue;
	}
	
	public static int getweekinfo (String inputValue){
		int result = Integer.parseInt(inputValue);
		return result;
	}
	
	public static void main(String[] args) {
		
	}
}
