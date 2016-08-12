package spring4.tutorial;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class AppWithXmlBased
{
    public static void main( String[] args )
    {
        /**
         * Inject to the bean
         */

        AbstractApplicationContext context = new ClassPathXmlApplicationContext("helloworld-config.xml");

        MessageService messageService = (MessageService) context.getBean("sayHelloWorldBean");

        messageService.sayHelloWorld("Thang XML based");

        context.close();
    }
}
