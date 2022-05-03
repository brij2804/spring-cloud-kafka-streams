# springcloud-kafka-streams
Project has Spring cloud streams kafka streams

### Concepts
- Spring cloud streams
- Kafka Streams binder

### Tech Stack
- java17
- kafka-streams
- spring-cloud-stream
- spring-cloud-stream-binder-kafka-streams
- spring-boot-devtools
- spring-cloud.version: 2021.0.2

### Kafka commands
- kafka-topics --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic users(depricated)
- kafka-topics --bootstrap-server localhost:9092 --topic users --create --partitions 1 --replication-factor 1
- kafka-console-producer --broker-list localhost:9092 --topic users

### sample messages
- {"name": "John Baker" , "age":34, "gender":"male"}
- {"name": "Chelsea" , "age":34, "gender":"female"}
- {"name": "Monlisa" , "age":34, "gender":"female"}
- {"name": "Paul" , "age":48, "gender":"male"}