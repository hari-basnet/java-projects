package predicates.types;

import java.util.function.Predicate;

public class IntegerPredicates {

	public static Predicate<Integer> positiveIntegerPredicate = integer -> integer > 0;

	public static Predicate<Integer> negativeIntegerPredicate = integer -> integer < 0;

	public static Predicate<Integer> getSpecificNumber(int i) {
		return number -> number == i;
	}


}
