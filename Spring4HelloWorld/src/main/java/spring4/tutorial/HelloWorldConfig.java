package spring4.tutorial;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Description;

/**
 * Created by ThangN on 8/12/2016.
 */

@Configuration
@ComponentScan(basePackages = "spring4.tutorial")
public class HelloWorldConfig {

    @Bean(name = "sayHelloWorldBean")
    @Description("This is the message bean")
    public MessageService messageService(){
        return new MessageServiceImpl();
    }
}
