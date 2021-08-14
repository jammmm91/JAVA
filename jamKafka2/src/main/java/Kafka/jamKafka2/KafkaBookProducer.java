package Kafka.jamKafka2;

import java.util.Properties;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;

public class KafkaBookProducer {
	public static void main(String[] args) {
		Properties props = new Properties();
		props.put("Bootstrap.servers", "zk1:9092,zk2:9092,zk3:9092");
		props.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
		props.put("Value.serializer", "org.apache.kafka.common.serialization.StringSerializer");

		Producer<String, String> producer = new KafkaProducer<String, String>(props);
		try {
			producer.send(new ProducerRecord<String, String>("jam-topic", "Apache kafka is a distributed streaming platform"));
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			producer.close();
		}
	}
}