package GUI;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;

public class EnterGamePage extends JFrame {

    JLabel label_welcome, label_intro;
    JButton HostGameButton,JoinServerButton;

    public EnterGamePage() throws IOException {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setUndecorated(true);
        this.setTitle("Guess Me!");
        this.setLocationRelativeTo(null);
        this.setLayout(null);


        label_welcome = new JLabel("G U E S S  M E ");
        label_welcome.setBounds(300, 200, 300, 300);
        label_welcome.setFont(new Font("Serif", Font.BOLD, 30));
        label_welcome.setForeground(Color.YELLOW);


        HostGameButton = new JButton("HOST A GAME");
        HostGameButton.setBounds(300, 400, 200, 50);
       // HostGameButton.setBorderPainted(false);
        HostGameButton.setForeground(Color.RED);
        HostGameButton.setEnabled(true);
        HostGameButton.addActionListener(new HostGameButton_Action());


        JoinServerButton = new JButton("JOIN A SERVER");
        JoinServerButton.setBounds(300, 500, 200, 50);
       // JoinServerButton.setBorderPainted(false);
        JoinServerButton.setForeground(Color.RED);
        JoinServerButton.setEnabled(true);
        JoinServerButton.addActionListener(new JoinServerButton_Action());







        this.add(label_welcome);

        //TODO: image not shown.

       // BufferedImage myPicture = ImageIO.read(new URL("https://raw.githubusercontent.com/berkayacbay/Guess_Me/51765f3f37a61dd66dcedc6dbfd0500390593a7f/src/src/GUI/images/gameLogo/guessMeLogo.png?token=GHSAT0AAAAAAB35EYEV7E6LE3OPFNEZAU5AY5K74IQ"));
        // BufferedImage scaledPic = resize(myPicture, 200, 200);
        JLabel picLabel = new JLabel();
        picLabel.setBackground(Color.orange);
        picLabel.setOpaque(true);
        picLabel.setBorder(BorderFactory.createLineBorder(Color.ORANGE));
        picLabel.setBounds(300, 100, 200, 200);
        this.add(picLabel, SwingConstants.CENTER);
        this.getContentPane().setBackground(Color.ORANGE);
        this.add(HostGameButton);
        this.add(JoinServerButton);
        //this.add(panel);

        //this.getContentPane().get


        this.setVisible(true);

    }

    public static BufferedImage resize(BufferedImage img, int newW, int newH) {
        Image tmp = img.getScaledInstance(newW, newH, Image.SCALE_SMOOTH);
        BufferedImage dimg = new BufferedImage(newW, newH, BufferedImage.TYPE_INT_ARGB);

        Graphics2D g2d = dimg.createGraphics();
        g2d.drawImage(tmp, 0, 0, null);
        g2d.dispose();

        return dimg;
    }

    static class HostGameButton_Action implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            MainPage.run();



        }
    }

    static class JoinServerButton_Action implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try {
                EnterServerPage.run();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }


        }
    }

}

