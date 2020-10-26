package com.pluralsight.functions.sdk;

import org.apache.pulsar.functions.api.Context;
import org.apache.pulsar.functions.api.Function;

public class SDKFunction implements Function<String, Void> {
	@Override
	public Void process(String s, Context context) throws Exception {
		return null;
	}
}
