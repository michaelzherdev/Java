package com.oneParamLambda;

public class LambdaDemo2 {

	public static void main(String[] args) {
		NumericTest isEven;
		
		isEven = (n) -> (n % 2) == 0;
		
		if(isEven.test(10)) System.out.println("even");
		if(!isEven.test(11)) System.out.println("not even");
		
		NumericTest isNonReg = (n) -> n >= 0;
		if(isNonReg.test(1)) System.out.println("pos");
		if(!isNonReg.test(-1)) System.out.println("neg");
		
		
		StringFunc reverse = (str) -> {
			String result = "";
			int i;
			for(i = str.length()-1; i >= 0; i--)
				result += str.charAt(i);
			return result;
		};
		System.out.println("כÿלבהא: " + reverse.func("כÿלבהא"));
	}

}
