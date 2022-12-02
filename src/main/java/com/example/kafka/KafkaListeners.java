package com.example.kafka;

import org.springframework.stereotype.Component;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.web.bind.annotation.RequestBody;

@Component
public class KafkaListeners {

    @KafkaListener(
            topics = "practice",
            groupId = "groupID")
    public void listener(MessageRequest request) {
        System.out.println("Listener received: " + request.getMessage() + " ***");
    }
}
