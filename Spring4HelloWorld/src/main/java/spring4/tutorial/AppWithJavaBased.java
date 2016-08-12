package spring4.tutorial;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

/**
 * Hello world!
 *
 */
public class AppWithJavaBased
{
    public static void main( String[] args )
    {
        /**
         * Inject to the bean
         */

        AbstractApplicationContext context = new AnnotationConfigApplicationContext(HelloWorldConfig.class);

        MessageService messageService = (MessageService) context.getBean("sayHelloWorldBean");

        messageService.sayHelloWorld("Thang java Based");

        context.close();
    }
}
