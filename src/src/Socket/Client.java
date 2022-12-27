package Socket;

import GUI.ChatBoxPanel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Client {
    private Socket Socket; // socket used by client to send and recieve data from server
    private BufferedReader in;   // object to read data from socket
    private PrintWriter out;


    public Client(String ip) throws IOException {
        Socket = new Socket(ip, 5000);
        out = new PrintWriter(Socket.getOutputStream());
        in = new BufferedReader(new InputStreamReader(Socket.getInputStream()));
    }

    public void Send (String msg){
        Thread sender = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    out.println(msg);
                    out.flush();
                }
            }
        });
        sender.start();
    }

    public void receiver () {
        Thread receiver = new Thread(new Runnable() {
            String msg;

            @Override
            public void run() {
                try {
                    msg = in.readLine();
                    while (msg != null) {
                        System.out.println("Server : " + msg);
                        msg = in.readLine();
                        ChatBoxPanel.ChatBoxUpdate(msg);
                    }
                    out.close();
                    Socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
        receiver.start();
    }
}
