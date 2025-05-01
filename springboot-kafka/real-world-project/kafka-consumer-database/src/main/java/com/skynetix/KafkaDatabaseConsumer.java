package com.skynetix;


import com.skynetix.entity.WikimediaData;
import com.skynetix.repository.WikimediaDataRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaDatabaseConsumer {

    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaDatabaseConsumer.class);

    private final WikimediaDataRepository dataRepository;

    // Constructor injection for the repository
    public KafkaDatabaseConsumer(WikimediaDataRepository dataRepository) {
        this.dataRepository = dataRepository;
    }

    @KafkaListener(
            topics = "${spring.kafka.topic.name}",
            groupId = "${spring.kafka.consumer.group-id}"
    )
    public void consume(String eventMessage) {
        LOGGER.info("Received event message: {}", eventMessage);

        // Create and save WikimediaData entity
        WikimediaData wikimediaData = new WikimediaData(eventMessage);
//        wikimediaData.setWikiEventData(eventMessage);

        dataRepository.save(wikimediaData);

        LOGGER.info("Saved event to database.");
    }
}
