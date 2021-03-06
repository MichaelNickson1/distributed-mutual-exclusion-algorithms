package Agrawalas;

import java.models.Message;
import java.models.Node;
import java.Utils.Log;

import java.io.*;
import java.net.InetSocketAddress;
import java.net.Socket;

public class TCPClient implements Runnable {

    private String address;
    private int port;
    private Socket clientSocket;
    private Node server;

    public TCPClient(String server) {
        String[] serverArray = server.split(":");
        address = serverArray[0];
        port = Integer.parseInt(serverArray[1]);

    }

    public Node getServer() {
        return server;
    }

    public void setServer(Node server) {
        this.server = server;
    }

    public void run() {
        try {
            clientSocket = new Socket();
            clientSocket.connect(new InetSocketAddress(address, port), 1000);
            server = new Node(null, clientSocket, true);
            BufferedReader inFromServer = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            Message messageSent = new Message(Message.Type.HANDSHAKE, Main.pid, null, null);
            server.write(messageSent);
            while (!clientSocket.isClosed()) {
                NetworkController.processMessage(server, inFromServer.readLine());
            }
        } catch (Exception e) {
            Log.LogError(Log.SUBTYPE.CLIENTSOCKET, "Message: " + e.getMessage());
        } finally {
            NetworkController.restartClient();
        }
    }
}
