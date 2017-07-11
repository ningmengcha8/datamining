///**
//  * Created by Administrator on 2017/7/11.
//  */
//import java.util.Properties
//
//import org.apache.flink.runtime.state.filesystem.FsStateBackend
//import org.apache.flink.streaming.api.scala.{StreamExecutionEnvironment, _}
//import org.apache.flink.streaming.connectors.kafka.FlinkKafkaConsumer08
//import org.apache.flink.streaming.util.serialization.SimpleStringSchema
//
///**
//  * Created by https://www.iteblog.com on 2016/5/3.
//  */
//object kafkaFlinkDemo {
//  def main(args: Array[String]) {
//    val env = StreamExecutionEnvironment.getExecutionEnvironment
//    env.enableCheckpointing(5000)
//    val properties = new Properties()
//    properties.setProperty("bootstrap.servers", "192.168.0.144:9092")
//    // only required for Kafka 0.8
//    properties.setProperty("zookeeper.connect", "192.168.0.144:2181")
//    properties.setProperty("group.id", "iteblog")
//
//
//    val stream = env.addSource(new FlinkKafkaConsumer08[String]("iteblog",
//      new SimpleStringSchema(), properties))
//    stream.setParallelism(4).writeAsText("hdfs:///tmp/data")
//
//    env.execute("IteblogFlinkKafkaStreaming")
//  }
//}