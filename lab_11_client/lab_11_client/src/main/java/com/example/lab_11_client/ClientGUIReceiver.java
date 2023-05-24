package com.example.lab_11_client;

public class ClientGUIReceiver implements ClientReceiver {
    private HelloController helloController;

    public ClientGUIReceiver(HelloController helloController) {
        this.helloController = helloController;
    }

    @Override
    public void receiveBroadcast(String sender, String message) {
        helloController.broadcast(sender, message);
    }
}
