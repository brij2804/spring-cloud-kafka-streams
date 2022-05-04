

package com.brijesh.kafka.services.datagenerator;

import com.brijesh.kafka.model.DeliveryAddress;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;

import java.io.File;
import java.util.Random;

@Service
class AddressGenerator {

    private final Random random;
    private final DeliveryAddress[] addresses;

    public AddressGenerator() {
        final String DATAFILE = "C:\\GitHubRepos\\spring-cloud-kafka-streams\\SpringCloudKafkaStreamsPart2\\invoice-avro-data-generator\\src\\main\\resources\\data\\address.json";
        final ObjectMapper mapper;
        random = new Random();
        mapper = new ObjectMapper();
        try {
            addresses = mapper.readValue(new File(DATAFILE), DeliveryAddress[].class);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private int getIndex() {
        return random.nextInt(100);
    }

    public DeliveryAddress getNextAddress() {
        return addresses[getIndex()];
    }

}
