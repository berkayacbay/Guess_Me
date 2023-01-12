package Socket;

import javax.swing.*;

public class Game {
    public static String receivemessage;



    public static int chanceToAssumption = 3; // == 0 --> Assumption tuşuna basınca chate yazma !!!
    public static boolean guessMode = false;
    private boolean IsGameWon = false;




    public  void examineMessage() {
        if (Client.receivemessage.startsWith("/Yes") && (guessMode == true)) {
            IsGameWon = true;
        }
        if (Client.receivemessage.startsWith("/No") && (guessMode == true)) {
            guessMode = false;
        }
    }

    public void gamelose(String msg){
        if(guessMode==false && Client.receivemessage.startsWith("/Assumption") &&msg.equals("/Yes")){
            JOptionPane.showMessageDialog(null,"GAME LOSE!!!");
            System.exit(0);

        }

    }

    public void continueGame() {
        if (IsGameWon == false) {
            examineMessage();
        }
        if (IsGameWon){
            JOptionPane.showMessageDialog(null,"GAME WON!!!");
            System.exit(0);
        }
    }
}