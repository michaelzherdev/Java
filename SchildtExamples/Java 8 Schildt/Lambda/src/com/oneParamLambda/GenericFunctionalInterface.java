package com.oneParamLambda;

public class GenericFunctionalInterface {

	public static void main(String[] args) {
		SomeFunc<String> reverse = (str) -> {
			String result = "";
			for(int i = str.length()-1; i >= 0; i--){
				result += str.charAt(i);
			}
			return result;
		};
		
		SomeFunc<Integer> factorial = (n) -> {
			int result = 1;
			for(int i = 1; i <= n; i++)
				result *= i;
			return result;
		};
		
		System.out.println("reverse: " + reverse.func("reverse"));

		System.out.println("factorial: " + factorial.func(3));
		
		/*******************************************/
		
		String inStr = "abcdef";
		String outStr;
		
		MyStringOp strOps = new MyStringOp();
		outStr = stringOp(strOps::strreverse, inStr);
		System.out.println(outStr);
	}

	static String stringOp(StringFunc sf, String s){
		return sf.func(s);
	}
}
