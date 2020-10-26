package com.pluralsight.schema;

import org.apache.pulsar.functions.api.SerDe;

import java.util.regex.Pattern;

public class ETFSerDe implements SerDe<ETF> {

	@Override
	public ETF deserialize(byte[] bytes) {
		String[] s = new String(bytes).split(Pattern.quote("|"));
		return new ETF(s[0], s[1]);
	}

	@Override
	public byte[] serialize(ETF etf) {
		return String.format("%s|%s", etf.getDate(), etf.getPrice()).getBytes();
	}
}
