## springboot-kafka-producer
Project has Spring for Apache Kafka.Kafka Producer code.

### Concepts
- KafkaTemplate
- Kafka Producer

### Tech Stack
- java17
- spring-boot-starter-web
- spring-kafka
- spring-boot-devtools

### Kafka commands
- kafka-topics --bootstrap-server localhost:9092 --topic users --create --partitions 1 --replication-factor 1
- kafka-console-producer --broker-list localhost:9092 --topic users
- kafka-console-consumer --bootstrap-server localhost:9092 --topic users (console consumer listening on topic first_topic. It will only read new live messages coming.)
- kafka-console-consumer --bootstrap-server localhost:9092 --topic users --from-beginning --property print.key=true --property key.separator=":"

### sample messages
- {"name": "John Baker" , "age":34, "gender":"male"}
- {"name": "Chelsea" , "age":34, "gender":"female"}
- {"name": "Monlisa" , "age":34, "gender":"female"}
- {"name": "Paul" , "age":48, "gender":"male"}