package com.java;

public class DescendingOrder2 {
	public static int sortDesc(final int num) {
		if (num < 0) throw new IllegalArgumentException("Negative number: " + num);

		return Integer.parseInt(Integer.toString(num).codePoints()
			.sorted()
			.collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
			.reverse()
			.toString());
	}
}
