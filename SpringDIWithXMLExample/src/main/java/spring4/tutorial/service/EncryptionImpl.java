package spring4.tutorial.service;

import spring4.tutorial.domain.Encryption;

/**
 * Created by ThangN on 8/12/2016.
 */
public class EncryptionImpl implements Encryption{
    @Override
    public void encryptData() {
        System.out.println("Encrypting data");
    }
}
