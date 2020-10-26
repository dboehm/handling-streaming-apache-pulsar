package com.pluralsight.schema;

import java.util.regex.Pattern;

public class ETF {

	private String date;
	private String price;

	public ETF(String inputDate, String inputPrice) {
		date=inputDate;
		price=inputPrice;
	}

	public ETF() {
		date="2010-01-01";
		price="100";
	}

	public static ETF fromInput(String s) {
		String[] split = s.split(Pattern.quote("|"));
		return new ETF(split[0], split[1]);
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public void normalizeName() {
	}
}