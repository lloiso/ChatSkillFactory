package Server;

import Client.Client;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ChatServer {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(8189);

        while (true) {
            System.out.println("Waiting..");

            Socket socket = server.accept();
            System.out.println("Client conected");
            Client client = new Client(socket);
            Thread thread = new Thread();
            thread.start();
        }


//        InputStream is = socket.getInputStream();
//        OutputStream os = socket.getOutputStream();

//        Scanner in = new Scanner(is);
//        PrintStream out = new PrintStream(os);
//        out.println("Name?");
//        out.println("hi "+ in.nextLine());
    }
}
