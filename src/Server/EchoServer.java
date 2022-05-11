package Server;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class EchoServer {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(8189);
        System.out.println("Waiting..");

        Socket socket = server.accept();
        System.out.println("Client conected");
        System.out.println("Client conected");

        InputStream is = socket.getInputStream();
        OutputStream os = socket.getOutputStream();

        Scanner in = new Scanner(is);
        PrintStream out = new PrintStream(os);
        out.println("Name?");
        out.println("hi "+ in.nextLine());
    }
}
