package spring4.tutorial;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring4.tutorial.config.DiConfig;
import spring4.tutorial.service.Communication;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        /**
         * DI via Property Setter
         */

       /* AbstractApplicationContext context = new ClassPathXmlApplicationContext("helloworld-config.xml");

        Communication communication = (Communication) context.getBean("communicateBean");

        communication.communicate();

        context.close();*/

        /**
         * DI via constructor
         */

        AbstractApplicationContext context1 = new AnnotationConfigApplicationContext(DiConfig.class);

        Communication communication1 = (Communication) context1.getBean("communicateBean");

        communication1.communicate();

        Communication communication2 = (Communication) context1.getBean("communicateBean");

        communication2.communicate();

        context1.close();
    }
}
