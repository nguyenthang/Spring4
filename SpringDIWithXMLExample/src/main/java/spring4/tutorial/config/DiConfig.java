package spring4.tutorial.config;

import org.springframework.context.annotation.*;
import spring4.tutorial.domain.Encryption;
import spring4.tutorial.domain.MessageService;
import spring4.tutorial.service.ActiveMQMessagingImpl;
import spring4.tutorial.service.Communication;
import spring4.tutorial.service.EncryptionImpl;

/**
 * Created by ThangN on 8/12/2016.
 */
@Configuration
@ComponentScan(basePackages = "spring4.tutorial")
public class DiConfig {


    @Bean(name = "communicateBean")
    @Scope(value = "prototype")
    public Communication communication(){
        Communication communication = new Communication(encryption());
        communication.setMessaging(messageService());

        return communication;
    }

    @Bean(name = "encryptDataBean")
    @Description("this is the bean to encrypt data")
    public Encryption encryption(){
        return new EncryptionImpl();
    }

    @Bean(name = "messageBean")
    @Description("this is the bean to send a message")
    public MessageService messageService(){
        return new ActiveMQMessagingImpl();
    }
}
