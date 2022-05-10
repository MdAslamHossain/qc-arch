# Kafka-Zookeeper-SpringBoot
## create docker-compose.yml
## yml file is added in resources
1.version: '3'

services:
  zookeeper:
    image: 'zookeeper:latest'
    container_name: zookeeper
    ports:
      - '2181:2181'
    environment:
      - ALLOW_ANONYMOUS_LOGIN=yes
  kafka:
    image: 'bitnami/kafka:latest'
    container_name: kafka
    ports:
      - '9092:9092'
    environment:
      - KAFKA_BROKER_ID=1
      - KAFKA_LISTENERS=PLAINTEXT://:9092
      - KAFKA_ADVERTISED_LISTENERS=PLAINTEXT://127.0.0.1:9092
      - KAFKA_ZOOKEEPER_CONNECT=zookeeper:2181
      - ALLOW_PLAINTEXT_LISTENER=yes
    depends_on:
      - zookeeper
      
2. cmd 'docker-compose -f docker-compose.yml up -d'
3. use kafka shel 'docker exec -it e8bfe8b7b524 /bin/bash'
4. cd /opt/bitnami/kafka/bin
5. ls and see lots of files
6. to create topic 'kafka-topics.sh --create --zookeeper zookeeper:2181 --replication-factor 1 --partitions 1 --topic topic1'
7. to see in kafka console 'kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic topic1 --from-beginning'








Link : https://www.javatpoint.com/apache-kafka
Link : https://www.youtube.com/watch?v=2pBxoal7DY4
Link : https://www.javainuse.com/spring/spring-boot-apache-kafka-hello-world









