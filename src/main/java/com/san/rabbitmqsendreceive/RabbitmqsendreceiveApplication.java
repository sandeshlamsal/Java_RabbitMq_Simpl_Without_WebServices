package com.san.rabbitmqsendreceive;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class RabbitmqsendreceiveApplication {

    //added
    static Logger logger= LoggerFactory.getLogger(RabbitmqsendreceiveApplication.class);


    public static void main(String[] args) {
        SpringApplication.run(RabbitmqsendreceiveApplication.class, args);
    }

}
