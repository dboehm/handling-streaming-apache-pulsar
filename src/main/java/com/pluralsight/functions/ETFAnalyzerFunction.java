package com.pluralsight.functions;

import com.pluralsight.schema.ETF;

import java.util.function.Function;

public class ETFAnalyzerFunction implements Function<String, ETF> {
	/**
	 * Applies this function to the given argument.
	 *
	 * @param s the function argument
	 * @return the function result
	 */
	@Override
	public ETF apply(String s) {
		ETF etf = ETF.fromInput(s);
		etf.normalizeName();
		return etf;
	}
}
