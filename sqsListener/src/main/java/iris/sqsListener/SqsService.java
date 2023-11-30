package iris.sqsListener;

import io.awspring.cloud.sqs.annotation.SqsListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import software.amazon.awssdk.services.sqs.model.Message;

@Service
public class SqsService {

    @SqsListener("eventos-criacao-contatos-telefonicos")
    public void receiveMessage(Message message) {
        System.out.println("Message received: " + message);
    }
}
