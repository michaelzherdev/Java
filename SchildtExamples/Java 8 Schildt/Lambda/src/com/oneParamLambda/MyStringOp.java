package com.oneParamLambda;

public class MyStringOp {
	String strreverse(String str){
		String result = "";
		for(int i = str.length()-1; i >= 0; i--){
			result += str.charAt(i);
		}
		return result;
	}
}
