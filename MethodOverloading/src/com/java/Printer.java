package com.java;

public class Printer {

	public static String printerError(String s) {
		// your code
		int count = 0;
		int deno = s.length();
		String[] arrayfied = s.split("");
		String[] testChar = {"n", "0","p", "q","r","s","t","u","v","w","x","y","z"};


		for(int i = 0; i < arrayfied.length; i++){

				if(arrayfied[i].contains(testChar[i])){
					System.out.println("huyyray");
				}
			}

		return count + "/" + deno;
	}

}
