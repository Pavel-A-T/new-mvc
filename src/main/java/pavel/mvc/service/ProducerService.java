package pavel.mvc.service;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import pavel.mvc.model.Message;

@Service
public class ProducerService {
    private KafkaTemplate<String, Message> kafkaTemplate;

    public ProducerService(KafkaTemplate<String, Message> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void produce(Message message) {
            System.out.println("Producing the message: " + message);
            kafkaTemplate.send("messages", message);
        }

}