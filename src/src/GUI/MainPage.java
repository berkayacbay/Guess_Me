package GUI;
import Socket.Client;
import Socket.Game;

import java.util.Random;

public class MainPage extends javax.swing.JFrame {

    //RADIOBUTTONS TO FLAG THE CHARACTERS
    private javax.swing.JRadioButton Frans_RBut;
    private javax.swing.JRadioButton George_RBut;
    private javax.swing.JRadioButton Tom_RBut;
    private javax.swing.JRadioButton Philip_RBut;
    private javax.swing.JRadioButton Peter_RBut;
    private javax.swing.JRadioButton David_RBut;
    private javax.swing.JRadioButton Charles_RBut;
    private javax.swing.JRadioButton Max_RBut;
    private javax.swing.JRadioButton Paul_RBut;
    private javax.swing.JRadioButton Richard_RBut;
   
    private javax.swing.JRadioButton Susan_RBut;
    private javax.swing.JRadioButton Maria_RBut;
    private javax.swing.JRadioButton Eric_RBut;
    private javax.swing.JRadioButton Claire_RBut;
    private javax.swing.JRadioButton Anne_RBut;
    private javax.swing.JRadioButton Anita_RBut;
    
    
    //CHARACTER BUTTONS
    private javax.swing.JButton Max;
    private javax.swing.JButton Frans;
    private javax.swing.JButton George;
    private javax.swing.JButton Tom;
    private javax.swing.JButton Philip;
    private javax.swing.JButton Peter;
    private javax.swing.JButton David;
    private javax.swing.JButton Charles;
    private javax.swing.JButton Paul;
    private javax.swing.JButton Richard;
    private javax.swing.JButton Susan;
    private javax.swing.JButton Maria;
    private javax.swing.JButton Eric;
    private javax.swing.JButton Claire;
    private javax.swing.JButton Anne;
    private javax.swing.JButton Anita;
    
    private javax.swing.JPanel ChatBoxPanel;
    private javax.swing.JTextField Chatbox;
    
    
    private int NUM_Guess=3;
    private javax.swing.JLabel NUM_Guess_Label;

    
    
    private javax.swing.JButton Q_Assumption;
    private javax.swing.JButton Q_No;
    private javax.swing.JButton Q_Yes;
    private javax.swing.JLabel GuessesLeft_label;
    private javax.swing.JButton SendText;
    public static javax.swing.JLabel chatHistory;
    private javax.swing.JLabel you_label;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel yourCharImageLabel;
    private javax.swing.JLabel yourCharNameLabel;

    public MainPage() {
        initComponents();
    }
    private void initComponents() {

   
        jPanel1 = new javax.swing.JPanel();
        Paul = new javax.swing.JButton();
        Susan = new javax.swing.JButton();
        Max = new javax.swing.JButton();
        Richard = new javax.swing.JButton();
        Anne = new javax.swing.JButton();
        Maria = new javax.swing.JButton();
        Eric = new javax.swing.JButton();
        Claire = new javax.swing.JButton();
        Tom = new javax.swing.JButton();
        Anita = new javax.swing.JButton();
        Frans = new javax.swing.JButton();
        George = new javax.swing.JButton();
        Charles = new javax.swing.JButton();
        Philip = new javax.swing.JButton();
        Peter = new javax.swing.JButton();
        David = new javax.swing.JButton();
        yourCharImageLabel = new javax.swing.JPanel();
        you_label = new javax.swing.JLabel();
        Susan_RBut = new javax.swing.JRadioButton();
        Max_RBut = new javax.swing.JRadioButton();
        Paul_RBut = new javax.swing.JRadioButton();
        Richard_RBut = new javax.swing.JRadioButton();
        Maria_RBut = new javax.swing.JRadioButton();
        Eric_RBut = new javax.swing.JRadioButton();
        Claire_RBut = new javax.swing.JRadioButton();
        Anne_RBut = new javax.swing.JRadioButton();
        Frans_RBut = new javax.swing.JRadioButton();
        George_RBut = new javax.swing.JRadioButton();
        Tom_RBut = new javax.swing.JRadioButton();
        Anita_RBut = new javax.swing.JRadioButton();
        Peter_RBut = new javax.swing.JRadioButton();
        David_RBut = new javax.swing.JRadioButton();
        Charles_RBut = new javax.swing.JRadioButton();
        Philip_RBut = new javax.swing.JRadioButton();
        ChatBoxPanel = new javax.swing.JPanel();
        Chatbox = new javax.swing.JTextField();
        chatHistory = new javax.swing.JLabel();
        Q_Yes = new javax.swing.JButton();
        SendText = new javax.swing.JButton();
        Q_No = new javax.swing.JButton();
        Q_Assumption = new javax.swing.JButton();
        GuessesLeft_label = new javax.swing.JLabel();
        NUM_Guess_Label = new javax.swing.JLabel();
        yourCharNameLabel = new javax.swing.JLabel();
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 153));



        Max.setText("Max");

        Max.addActionListener(new java.awt.event.ActionListener() {
            int count=0;
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                count++;
                if(count%2==0){
                    Max.setText("abc");
                }
                else{

                    Max.setText("Max");

                }


            }
        });

        Paul.setText("Paul");
        Paul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {

            }
        });

       SendText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
               String chat= Chatbox.getText();
                Client.send(chat);
                Chatbox.setText("");
                NUM_Guess--;
                NUM_Guess_Label.setText(String.valueOf(NUM_Guess));
            }
        });
        Q_No.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {

                Chatbox.setText("/No ");
            }
        });
        Q_Yes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {

                Chatbox.setText("/Yes ");
            }
        });
        Q_Assumption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                if(Game.chanceToAssumption>0) {
                    Chatbox.setText("/Assumption ");
                }
            }
        });

        Richard.setText("Max");
        Richard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {

            }
        });

        



        Maria.setText("Max");
        Maria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {

            }
        });

        Eric.setText("Max");
        Eric.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {

            }
        });

        Claire.setText("Max");
        Claire.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {

            }
        });




        Anne.setText("Max");
        Anne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {

            }
        });
        Anita.setText("Max");
        Anita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {

            }
        });

        Frans.setText("Max");
        Frans.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {

            }
        });

        George.setText("Max");
        George.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {

            }
        });

        Tom.setText("Max");
        Tom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {

            }
        });
        Philip.setText("Max");
        Philip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {

            }
        });

        Peter.setText("Max");
        Peter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {

            }
        });

        David.setText("Max");
        David.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {

            }
        });

        Charles.setText("Max");
        Charles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {

            }
        });

       //TODO: Pick a random character and set the character pic label on "yourCharImageLabel"

        javax.swing.GroupLayout yourCharImageLabelLayout = new javax.swing.GroupLayout(yourCharImageLabel);
        yourCharImageLabel.setLayout(yourCharImageLabelLayout);

        yourCharImageLabelLayout.setHorizontalGroup(
                yourCharImageLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 94, Short.MAX_VALUE)
        );

        yourCharImageLabelLayout.setVerticalGroup(
                yourCharImageLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 100, Short.MAX_VALUE)
        );



        you_label.setFont(new java.awt.Font("Phosphate", 1, 18)); // NOI18N
        you_label.setForeground(new java.awt.Color(255, 0, 51));
        you_label.setText("You");


//TODO: set names of characters on radiobuttons

        Max_RBut.setText("MAX");
        Paul_RBut.setText("PAUL");

        Richard_RBut.setText("RICHARD");

        Susan_RBut.setText("SUSAN");


        Maria_RBut.setText("MARIA");

        Eric_RBut.setText("ERIC");

        Claire_RBut.setText("CLAIRE");

        Anne_RBut.setText("ANNE");

        Anita_RBut.setText("ANITA");

        Frans_RBut.setText("FRANS");

        George_RBut.setText("GEORGE");

        Tom_RBut.setText("TOM");

        Philip_RBut.setText("PHILIP");

        Peter_RBut.setText("PETER");

        David_RBut.setText("DAVID");

        Charles_RBut.setText("CHARLES");


//TODO: ChatBoxField

        Chatbox.setBackground(new java.awt.Color(255, 255, 255));
        Chatbox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));


        javax.swing.GroupLayout ChatboxLayout = new javax.swing.GroupLayout(Chatbox);
        Chatbox.setLayout(ChatboxLayout);
        ChatboxLayout.setHorizontalGroup(
                ChatboxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
        );
        ChatboxLayout.setVerticalGroup(
                ChatboxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 60, Short.MAX_VALUE)
        );

        chatHistory.setBackground(new java.awt.Color(255, 255, 255));
        chatHistory.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));


        Q_Yes.setFont(new java.awt.Font("Rockwell", 1, 13)); // NOI18N
        Q_Yes.setForeground(new java.awt.Color(153, 255, 0));


        //TODO: If the Question on the text is correct button
        Q_Yes.setText("YES");

        Q_Yes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {

            }
        });
        //TODO: If the Question on the text is false button


        Q_No.setFont(new java.awt.Font("Rockwell", 1, 13)); // NOI18N
        Q_No.setForeground(new java.awt.Color(255, 51, 51));
        Q_No.setText("NO");

        Q_No.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {

            }
        });

        //TODO: If the user wants to guess the opponent's character
        //NOTE: MUST CONSIDER THAT THE FIELD THAT STATES GUESS ATTEMPTS SHOULD DECREASE AFTER CLICKED.


        Q_Assumption.setFont(new java.awt.Font("Rockwell", 1, 13)); // NOI18N
        Q_Assumption.setForeground(new java.awt.Color(153, 0, 153));
        Q_Assumption.setText("ASSUMPTION");

        Q_Assumption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {

            }
        });


        //TODO: If the user wants to send his question to the opponent

        //NOTE: MUST CONSIDER THAT THE FIELD THAT STATES QUESTION ATTEMPTS SHOULD DECREASE AFTER CLICKED.

        SendText.setBackground(new java.awt.Color(51, 153, 255));
        SendText.setFont(new java.awt.Font("Rockwell", 1, 13)); // NOI18N
        SendText.setForeground(new java.awt.Color(153, 255, 255));
        SendText.setText("SEND");









        //CHATBOXPANEL

        javax.swing.GroupLayout ChatBoxPanelLayout = new javax.swing.GroupLayout(ChatBoxPanel);
        ChatBoxPanel.setLayout(ChatBoxPanelLayout);
        ChatBoxPanelLayout.setHorizontalGroup(
                ChatBoxPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(ChatBoxPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(ChatBoxPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(ChatBoxPanelLayout.createSequentialGroup()
                                                .addGroup(ChatBoxPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(Q_Yes, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(Q_No, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(Chatbox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ChatBoxPanelLayout.createSequentialGroup()
                                                .addComponent(Q_Assumption, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 688, Short.MAX_VALUE)
                                                .addComponent(SendText, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap())
                                        .addComponent(chatHistory)))
        );
        ChatBoxPanelLayout.setVerticalGroup(
                ChatBoxPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(ChatBoxPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(chatHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(ChatBoxPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Chatbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(ChatBoxPanelLayout.createSequentialGroup()
                                                .addComponent(Q_Yes, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(Q_No, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(ChatBoxPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(SendText, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Q_Assumption))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );


        //TODO: STATES THE GUESSES LEFT FIELD. NUM_GUESS IS A VARIABLE THAT CHANGES ACCORDINGLY

        GuessesLeft_label.setFont(new java.awt.Font("Impact", 0, 13)); // NOI18N
        GuessesLeft_label.setForeground(new java.awt.Color(255, 51, 51));
        GuessesLeft_label.setText("GUESSES LEFT");



        NUM_Guess_Label.setBackground(new java.awt.Color(255, 255, 255));
        NUM_Guess_Label.setFont(new java.awt.Font("Phosphate", 1, 36)); // NOI18N
        NUM_Guess_Label.setForeground(new java.awt.Color(255, 51, 102));

        NUM_Guess_Label.setText((String.valueOf(NUM_Guess)));



        //TODO: SHOWS THE NAME OF THE RANDOMLY PICKED USER
        randomCharacterGenerator();
        yourCharNameLabel.setForeground(new java.awt.Color(255, 51, 51));






        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(255, 255, 255)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGap(87, 87, 87)
                                                .addComponent(NUM_Guess_Label)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(GuessesLeft_label))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(44, 44, 44)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(yourCharImageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(yourCharNameLabel))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(you_label)
                                                .addGap(38, 38, 38)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(2, 2, 2)
                                                                .addComponent(Max_RBut))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(2, 2, 2)
                                                                .addComponent(Maria_RBut))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(2, 2, 2)
                                                                .addComponent(Anita_RBut))
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                        .addGap(7, 7, 7)
                                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                        .addComponent(Max, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                .addComponent(Paul_RBut)
                                                                                                .addComponent(Paul, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                .addComponent(Richard, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addComponent(Richard_RBut))
                                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                .addComponent(Susan_RBut)
                                                                                                .addComponent(Susan, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                                                        .addComponent(Maria, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                .addComponent(Eric, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addComponent(Eric_RBut))
                                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                .addComponent(Claire, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addComponent(Claire_RBut))
                                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                .addComponent(Anne_RBut)
                                                                                                .addComponent(Anne, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                        .addComponent(Anita, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                .addComponent(Frans, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addComponent(Frans_RBut))
                                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                .addComponent(George, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addComponent(George_RBut))
                                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                .addComponent(Tom_RBut)
                                                                                                .addComponent(Tom, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                                                        .addGap(7, 7, 7)
                                                                                        .addComponent(Philip, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                        .addComponent(Philip_RBut)
                                                                                        .addGap(58, 58, 58)))
                                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(Peter, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(Peter_RBut))
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(David, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(David_RBut))
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(Charles_RBut)
                                                                                .addComponent(Charles, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(79, 79, 79)
                                                .addComponent(ChatBoxPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)


                                        .addComponent(NUM_Guess_Label)
                                        .addComponent(GuessesLeft_label, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(Paul, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Max, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Richard, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Susan, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(1, 1, 1)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(Max_RBut)
                                                        .addComponent(Paul_RBut)
                                                        .addComponent(Susan_RBut, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(Richard_RBut))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(Eric, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(Maria, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(Claire, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(Anne, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(1, 1, 1)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(Maria_RBut)
                                                        .addComponent(Eric_RBut)
                                                        .addComponent(Anne_RBut, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(Claire_RBut))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(21, 21, 21)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(yourCharImageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(you_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(yourCharNameLabel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(Frans, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Anita, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(George, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Tom, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(1, 1, 1)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(Anita_RBut)
                                        .addComponent(Frans_RBut)
                                        .addComponent(Tom_RBut, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(George_RBut))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(Peter, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Philip, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(David, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Charles, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(1, 1, 1)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(Philip_RBut)
                                        .addComponent(Peter_RBut)
                                        .addComponent(Charles_RBut, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(David_RBut))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                                .addComponent(ChatBoxPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );

        pack();
    }

    private void randomCharacterGenerator(){
        Random rand=new Random();
        int index=rand.nextInt(16);


        switch(index) {
            case 0:
                // MAX
                yourCharNameLabel.setText("Max");

                break;
            case 1:
                // PAUL
                yourCharNameLabel.setText("Paul");
                break;
            case 2:
                // RICHARD
                yourCharNameLabel.setText("Richard");
                break;
            case 3:
                // SUSAN
                yourCharNameLabel.setText("Susan");
                break;
            case 4:
                //MARIA
                yourCharNameLabel.setText("Maria");
                break;
            case 5:
                // ERIC
                yourCharNameLabel.setText("Eric");
                break;
            case 6:
                // CLAIRE
                yourCharNameLabel.setText("Claire");
                break;
            case 7:
                // ANNE
                yourCharNameLabel.setText("Anne");
                break;
            case 8:
                // ANITA
                yourCharNameLabel.setText("Anita");
                break;
            case 9:
                // FRANS
                yourCharNameLabel.setText("Frans");
                break;
            case 10:
                // GEORGE
                yourCharNameLabel.setText("George");
                break;
            case 11:
                // TOM
                yourCharNameLabel.setText("Tom");
                break;
            case 12:
                // PHILIP
                yourCharNameLabel.setText("Philip");
                break;
            case 13:
                // PETER
                yourCharNameLabel.setText("Peter");
                break;
            case 14:
                // DAVID
                yourCharNameLabel.setText("David");
                break;
            case 15:
                // CHARLES
                yourCharNameLabel.setText("Charles");
                break;

            default:
                // NULL
        }

    }


            public static void run() {
                new MainPage().setVisible(true);
            }


}
