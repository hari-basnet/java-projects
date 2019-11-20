package com.java;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) throws IOException {
		// write your code here

		Path path = Paths.get("bands.txt");

		Path realPath = path.toRealPath(LinkOption.NOFOLLOW_LINKS);
		System.out.println(realPath);

		System.out.println(path.toString());
		System.out.println(path.getNameCount());
		System.out.println(path.getName(0));
		// average of squares of an int Array
		Arrays.stream(new int[] { 2, 4, 6, 8, 10 })
			.map(x -> x * x)
			.average()
			.ifPresent(System.out::println);

		// stream from list, filter and print
		List<String> people = Arrays.asList("Ram", "shyam", "kale", "hari", "Simon", "Simon", "Cherry");

		people
			.stream()
			.map(String::toLowerCase)        // class and function we wanna use
			.filter(x -> x.startsWith("h"))
			.forEach(System.out::println);

		// stream rows from text file, sort, filter and print
		Stream<String> bands = Files.lines(Paths.get("/home/habasnet/Github/java-projects/Streams/bands.txt"));

		bands
			.sorted()
			.filter(x -> x.length() > 22)
			.forEach(System.out::println);
		bands.close();

		System.out.println("********************************************************************************");

		List<String> bands2 = Files.lines(Paths.get("bands.txt"))
			.filter(x -> x.contains("xx"))
			.collect(Collectors.toList());
		bands2.forEach(x -> System.out.println(x));

		// stream rows from CSV file and count
		Stream<String> rows1 = Files.lines(Paths.get("data.txt"));
		int rowCount = (int) rows1
			.map(x -> x.split(","))
			.filter(x -> x.length == 3)
			.count();
		System.out.println(rowCount + " rows.");
		rows1.close();

		// Stream rows from CSV file, parse data from rows
		Stream<String> rows2 = Files.lines(Paths.get("data.txt"));  // gets each lines as a streams
		rows2
			.map(x -> x.split(","))  // each line get splitted and stored to an array for example
			.filter(x -> x.length == 3)     // filtering out the arrays which exactly three items
			.filter(x -> Integer.parseInt(x[1])
				> 15)   // filtering out the arrays of which first item should be greater than 15
			.forEach(x -> System.out.println(x[0] + " " + x[1] + " " + x[2]));  // printing all three items of array
		rows2.close();  // need to close the stream

		// stream rows from CSV file, store fields in hashmap

		Stream<String> rows3 = Files.lines(Paths.get("data.txt"));

		Map<String, Integer> map = new HashMap<>();

		map = rows3
			.map(x -> x.split(","))
			.filter(x -> x.length == 3)
			.filter(x -> Integer.parseInt(x[1]) > 15)
			.collect(Collectors.toMap(
				x -> x[0],
				x -> Integer.parseInt(x[1])
			));
		rows3.close();
		for (String key : map.keySet()) {
			System.out.println(key + " " + map.get(key));  // to print the map
		}

		// Reduction - sum
		double total = Stream.of(7.3, 1.5, 4.8)
			.reduce(0.0, (Double a, Double b) -> a + b);
		System.out.println("Total = " + total);

		Stream<Double> test = Stream.of(7.3, 1.5, 4.8);

		System.out.println(test);
	}
}
