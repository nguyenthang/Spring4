package spring4.tutorial;



/**
 * Created by ThangN on 8/12/2016.
 */

public class MessageServiceImpl implements MessageService {

    public void sayHelloWorld(String message) {
        System.out.println("Hello World : " + message);
    }
}
