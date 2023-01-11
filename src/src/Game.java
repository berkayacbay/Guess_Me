public class Game {
    private String receivemessage;
    private int chanceToAssumption = 3; // == 0 --> Assumption tuşuna basınca chate yazma !!!
    private boolean guessMode = false;
    private boolean IsGameWon = false;


    public boolean canGuess() {
        return chanceToAssumption > 0;
    }

    public void examineMessage() {
        if (receivemessage.startsWith("/Assumption")) {
            chanceToAssumption--;
            guessMode = true;
        }
        if (receivemessage.startsWith("/Yes") && (guessMode == true)) {
            IsGameWon = true;
        }
        if (receivemessage.startsWith("/No") && (guessMode == true)) {
            guessMode = false;
        }
    }

    public void continueGame() {
        while (IsGameWon == false) {
            examineMessage();
        }
    }
}