package edu.uok.myencrypt.service;

import java.util.Random;

/**
 * Created by Renuka on 06/03/2016.
 */
public class EncryptService {

    private static String encryptPassword(String password) {
        StringBuilder newPassword = new StringBuilder();
        char[] passwordCharArray = password.toCharArray();
        Long seed = 418L;

        for (char letter : passwordCharArray) {
            seed *= (letter * 2857);
        }
        Random rnd = new Random(seed);

        for (char letter : passwordCharArray) {
            newPassword.append((char) ((letter) ^ rnd.nextInt(128)));
        }

        return newPassword.toString();
    }

    private static String encrypt(String input, String password) {
        StringBuilder result = new StringBuilder();

        char[] inputCharArray = input.toCharArray();
        char[] passwordCharArray = password.toCharArray();
        int inputLen = inputCharArray.length;
        int passwordLen = password.length();

        for (int i = 0; i < inputLen; i++) {
            if(i % 10000 == 0) System.out.println(i + " / " + inputLen);
            result.append((char) (inputCharArray[i] ^ passwordCharArray[i % passwordLen] ^ 57));
        }
        return result.toString();
    }

    public static String encryptMessage(String input, String password) {
        return encrypt(input, encryptPassword(password));
    }
}
