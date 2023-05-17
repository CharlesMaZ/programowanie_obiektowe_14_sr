package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try {
            ConnectionThread connectionThread = new ConnectionThread("localhost", 5000);
            connectionThread.start();
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            while (true) {
                String message = reader.readLine();
                connectionThread.sendMessage(message);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}