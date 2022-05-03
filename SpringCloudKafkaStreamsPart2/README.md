Project has Spring for Apache Kafka.Kafka Producer code.

### modules
- springboot-kafka-producer
- invoice-json-data-generator

### Concepts
- Kafka Template
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
- kafka-topics --bootstrap-server localhost:9092 --topic pos-topic --create --partitions 1 --replication-factor 1
- kafka-console-consumer --bootstrap-server localhost:9092 --topic pos-topic --from-beginning --property print.key=true --property key.separator=":"

### sample messages
- {"topic":"users","key":"101","value":"Kafka is cool"}