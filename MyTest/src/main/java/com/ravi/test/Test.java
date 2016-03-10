package com.ravi.test;

public class Test {

	public static void main(String[] args) {
		regularExpression();
	}

	private static void regularExpression() {
		// Regular Expression
		String errMsg = "M0100 TEST 8G989f8";
		String errorCodeStr = errMsg.replaceAll("[^0-9]", "").trim();

		System.out.println(errorCodeStr);
		errorCodeStr = errMsg.replaceAll("[^A-Z]", "").trim();
		System.out.println(errorCodeStr);

	}

}
