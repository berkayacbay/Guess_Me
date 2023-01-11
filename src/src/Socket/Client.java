package Socket;

import GUI.MainPage;

import java.io.*;
import java.net.*;

public class Client {
    public static String AllChat="";
    private static DataOutputStream out;
    private static DataInputStream in;
    private static Socket socket;
    public static String receivemessage;
    private static  Game game;
    public Client() throws IOException {
        socket = new Socket("3.121.247.252", 100);
        out= new DataOutputStream(socket.getOutputStream());
        in= new DataInputStream(socket.getInputStream());
       game =new Game();


        Thread receiver = new Thread(new Runnable() {
            String msg;
            @Override
            public void run() {
                try {
                    msg = in.readUTF();
                    receivemessage=msg;
                    while(msg!=null){
                        AllChat=AllChat+msg;
                   //     a.cevap.setText(cevap);
                        MainPage.chatHistory.setText(AllChat);
                        msg = in.readUTF();
                        receivemessage=msg;
                    }
                    System.out.println("Server out of service");
                    out.close();
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
        receiver.start();
    }

    public static  void send(String Sender_msg){
        Thread sender = new Thread(new Runnable() {
            String msg;
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            @Override
            public void run() {
                while(true){
                    String message;
                    message =Sender_msg;
                    AllChat=AllChat+message;
                    try {
                        out.writeUTF(message);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    try {
                        out.flush();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    MainPage.chatHistory.setText(AllChat);
                    //   a.soru.setText(message);
                    //    MainPage.chatHistory.set
                    break;
                }
            }
        });

        sender.start();
        game.examineMessage();
        game.continueGame();
    }

}
