

package com.brijesh.kafka.services.datagenerator;

import com.brijesh.kafka.model.LineItem;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;

import java.io.File;
import java.util.Random;

@Service
class ProductGenerator {
    private final Random random;
    private final Random qty;
    private final LineItem[] products;

    public ProductGenerator() {
        String DATAFILE = "C:\\GitHubRepos\\spring-cloud-kafka-streams\\SpringCloudKafkaStreamsPart2\\invoice-avro-data-generator\\target\\generated-sources\\com\\brijesh\\kafka\\model\\LineItem.java";
        ObjectMapper mapper = new ObjectMapper();
        random = new Random();
        qty = new Random();
        try {
            products = mapper.readValue(new File(DATAFILE), LineItem[].class);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private int getIndex() {
        return random.nextInt(100);
    }

    private int getQuantity() {
        return qty.nextInt(2) + 1;
    }

    public LineItem getNextProduct() {
        LineItem lineItem = products[getIndex()];
        lineItem.setItemQty(getQuantity());
        lineItem.setTotalValue(lineItem.getItemPrice() * lineItem.getItemQty());
        return lineItem;
    }
}
