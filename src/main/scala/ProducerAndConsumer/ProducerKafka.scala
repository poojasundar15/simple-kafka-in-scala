package ProducerAndConsumer

import org.apache.kafka.clients.producer.{KafkaProducer, ProducerRecord}
import org.apache.kafka.common.serialization.StringSerializer

import java.util.Properties

object ProducerKafka extends App
{
  val kafkaProducerProps: Properties= new Properties(){
    kafkaProducerProps.put("bootstrap.servers","localhost : 9092")
    kafkaProducerProps.put("key.serializer",classOf[StringSerializer].getName)
    kafkaProducerProps.put("value.serializer",classOf[StringSerializer].getName)
  }
  val producer = new KafkaProducer[String,String](kafkaProducerProps)
  val topic = "myTopic"
  try {
    println("Producer Messages")
  }
  catch {
    case a : Exception => a.printStackTrace()
  }
  finally {
    producer.close()
  }
  //producer.send(new ProducerRecord[String,String]("myTopic",keyMessage._1,))
}
