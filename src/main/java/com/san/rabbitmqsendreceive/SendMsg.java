package com.san.rabbitmqsendreceive;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Profile;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

@Profile("send")
public class SendMsg {

    static Logger logger= LoggerFactory.getLogger(SendMsg.class);

    private static String QUEUE_NAME="demoqueque";

    //This will run seperately, as diff profile
    public  static void main(String[] argv)
            throws IOException, TimeoutException {
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("localhost");
        Connection connection = factory.newConnection();
        Channel channel = connection.createChannel();
        channel.queueDeclare(QUEUE_NAME,false,false,false, null);
        String message = "Welcome to RabbitMQ from Sender";
        channel.basicPublish("", QUEUE_NAME, null, message.getBytes("UTF-8"));
        logger.debug("[!] Sent '" + message + "'");
        channel.close();
        connection.close();
    }
}
