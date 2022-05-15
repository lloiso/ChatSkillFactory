package Server;

import Client.Client;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class ChatServer {
    ArrayList<Client> clients = new ArrayList<>();
    ServerSocket serverSocket;

    public ChatServer() throws IOException {
        serverSocket = new ServerSocket(8189);
    }

    public void sendAll(String msg){
        for (Client client : clients){
            client.recieve(msg);
        }
    }

    public void run(){
        while (true) {
            System.out.println("Waiting..");

            try {
                Socket socket = serverSocket.accept();
                System.out.println("Client conected");
                clients.add(new Client(socket,this));

            }catch (IOException e){
                e.printStackTrace();
            }

        }
    }

    public static void main(String[] args) throws IOException {
        new ChatServer().run();
    }
}
