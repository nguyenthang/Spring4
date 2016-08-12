package spring4.tutorial.service;

import spring4.tutorial.domain.Encryption;
import spring4.tutorial.domain.MessageService;

/**
 * Created by ThangN on 8/12/2016.
 */
public class Communication {

    /**
     * Dependency Injection via Setter
     */

    private MessageService message;

    private Encryption encryption;

    public void setMessaging(MessageService messaging){
        this.message = messaging;
    }

    /**
     * DI via constructor
     */

    public Communication(Encryption encryption){
        this.encryption = encryption;
    }

    public void communicate(){
        encryption.encryptData();
        message.sendMessage();
    }
}
