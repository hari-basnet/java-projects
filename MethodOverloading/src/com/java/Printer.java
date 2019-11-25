package com.java;

public class Printer {

	public static String printerError(String s) {
		// your code
		int count = 0;
		int deno = s.length();
		String[] arrayfied = s.split("");
		String[] testChar = {"n", "0","p", "q","r","s","t","u","v","w","x","y","z"};


		for(int i = 0; i < arrayfied.length; i++){
			for(int j = 0; testChar.length < j; j++){
				if(arrayfied[i] == testChar[j]){
					count++;
				}
			}
		}

		return count + "/" + deno;
	}

}
