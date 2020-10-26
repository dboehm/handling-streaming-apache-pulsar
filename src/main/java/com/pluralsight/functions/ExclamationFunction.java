package com.pluralsight.functions;

import java.util.function.Function;

public class ExclamationFunction implements Function<String, String> {
	/**
	 * Applies this function to the given argument.
	 *
	 * @param s the function argument
	 * @return the function result
	 */
	@Override
	public String apply(String s) {
		return String.format("%s!!!", s);
	}
}
