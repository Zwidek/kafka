package com.zwidek;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(topics = "zwidek",
            groupId = "groupId")
    void listener(String data) {
        System.out.println("Listener receiver: " + data + " :)");
    }
}
