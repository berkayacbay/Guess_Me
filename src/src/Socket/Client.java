package Socket;

import java.io.*;
import java.net.*;

public class Client {
    public static String cevap="";
    public static String soru="";
    private static DataOutputStream out;
    private static DataInputStream in;
    private static Socket socket;
    public Client() throws IOException {
        socket = new Socket("3.121.247.252", 100);
        out= new DataOutputStream(socket.getOutputStream());
        in= new DataInputStream(socket.getInputStream());
        Thread sender = new Thread(new Runnable() {
            String msg;
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            @Override
            public void run() {
                while(true){
                    String message = null;
                    try {
                        message = reader.readLine();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    soru=soru+message;
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
                 //   a.soru.setText(message);
                }
            }
        });
        sender.start();


        Thread receiver = new Thread(new Runnable() {
            String msg;
            @Override
            public void run() {
                try {
                    msg = in.readUTF();
                    while(msg!=null){
                        cevap=cevap+msg;
                   //     a.cevap.setText(cevap);
                        msg = in.readUTF();
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

}
