package spring4.tutorial.service;

import spring4.tutorial.domain.MessageService;

/**
 * Created by ThangN on 8/12/2016.
 */
public class ActiveMQMessagingImpl implements MessageService {
    @Override
    public void sendMessage() {
        System.out.println("Send Message by ActiveMQ");
    }
}
