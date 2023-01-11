package Socket;

import java.io.*;
import java.net.*;

public class Server {

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(100);
        System.out.println("Server started. Waiting for clients...");
        Socket client1 = serverSocket.accept();
        System.out.println("Client 1 connected");
        Socket client2 = serverSocket.accept();
        System.out.println("Client 2 connected");

        DataOutputStream out1 = new DataOutputStream(client1.getOutputStream());
        DataInputStream in1 = new DataInputStream(client1.getInputStream());
        DataOutputStream out2 = new DataOutputStream(client2.getOutputStream());
        DataInputStream in2 = new DataInputStream(client2.getInputStream());

        while (true) {
            String message1 = in1.readUTF();
            out2.writeUTF(message1);
            out2.flush();
            String message2 = in2.readUTF();
            out1.writeUTF(message2);
            out1.flush();

        }
    }
}
