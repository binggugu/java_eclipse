package com.kopo;

public class TestFunction {
	
	public static int getLen(String inputData){
		int returnValue = inputData.length();
		return returnValue;
	}
	
	
	// ��ƿ��Ƽ �Լ��� ��´�.
	public static void main(String[] args) {
		
		String testValue = "abcdefg";
		
		int resultValue = getLen(testValue);
		
		System.out.println(resultValue);
	}

}
