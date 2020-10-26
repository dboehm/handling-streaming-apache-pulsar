package com.pluralsight.schema;

import org.apache.pulsar.client.api.Producer;
import org.apache.pulsar.client.api.PulsarClient;
import org.apache.pulsar.client.api.PulsarClientException;
import org.apache.pulsar.client.api.Schema;

public class ETFProducer {

	public static void main(String[] args) throws PulsarClientException {

		PulsarClient client = PulsarClient.builder()
					                      .serviceUrl("pulsar://localhost:6650")
					                      .build();
		Producer<ETF> producer = client.newProducer(Schema.AVRO(ETF.class))
					                            .topic("pulsar-postgres-jdbc-sink-topic")
					                            .create();
		ETF etfPrice = new ETF("2015-05-26", "151.1564");
		producer.send(etfPrice);
		producer.close();
		client.close();
		System.out.println("Messages sent!\n");
	}
}
