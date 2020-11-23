package predicates.examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import predicates.types.IntegerPredicates;

public class PredicateEx1 {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(-1, -3, 4, 15, 6, 7, 12, 2, -10, 9, -11, 14);
		List<Integer> filteredNumbers = getFilteredNumbers(numbers, IntegerPredicates.positiveIntegerPredicate);
		filteredNumbers.forEach(System.out::println);

		List<Integer> filteredNegativeNumber = getFilteredNumbers(numbers, IntegerPredicates.negativeIntegerPredicate);
		filteredNegativeNumber.forEach(System.out::println);

		// get specific number
		List<Integer> specificNumber = getFilteredNumbers(numbers, IntegerPredicates.getSpecificNumber(12));
		specificNumber.forEach(System.out::println);

	}


	public static List<Integer> getFilteredNumbers(List<Integer> numbers, Predicate<Integer> integerPredicate) {

		List<Integer> filteredNumbers = new ArrayList<>();

		for(Integer i : numbers) {
			if(integerPredicate.test(i)) {
				filteredNumbers.add(i);
			}
		}
		return filteredNumbers;
	}

}
