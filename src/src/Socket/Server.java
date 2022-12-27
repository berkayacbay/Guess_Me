package Socket;

import GUI.ChatBoxPanel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server extends Thread{
    private Socket Socket;
    private ServerSocket serverSocket ;
    private BufferedReader in;
    private PrintWriter out;

    public Server(Socket Socket) {
        this.Socket = Socket;


    }

    public void runServer(String msg) throws IOException {
        serverSocket = new ServerSocket(5000);
        Socket = serverSocket.accept();
        out = new PrintWriter(Socket.getOutputStream());
        in = new BufferedReader (new InputStreamReader(Socket.getInputStream()));

    }

    private void sender(String msg){
        Thread sender= new Thread(new Runnable() {
            String msg; //variable that will contains the data writter by the user
            @Override   // annotation to override the run method
            public void run() {
                while(true){
                    msg=msg;
                    out.println(msg);    // write data stored in msg in the clientSocket
                    out.flush();   // forces the sending of the data
                    ChatBoxPanel.ChatBoxUpdate(msg);
                }
            }
        });
        sender.start();
    }

    public void receiver(){
        Thread receiver = new Thread(new Runnable() {
            String msg;
            @Override
            public void run() {
                try {
                    msg = in.readLine();
                    while(msg!=null){
                        System.out.println("Server : "+msg);
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
        receiver .start();
    }




}