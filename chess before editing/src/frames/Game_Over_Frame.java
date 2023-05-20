package frames;
import board.*;


import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Game_Over_Frame extends JFrame {


    JLabel playerWon1, playerWon2, gameOver, checkScore;
    JButton viewScore;

    public Game_Over_Frame() {

        JFrame frame = new JFrame();

        // Get the screen dimensions
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        GraphicsDevice gd = ge.getDefaultScreenDevice();
        Rectangle screenBounds = gd.getDefaultConfiguration().getBounds();

        // Calculate the position of the frame
        int frameWidth = 332;  // Adjust the frame width as needed
        int frameHeight = 594; // Adjust the frame height as needed

        //set the frame location on any PC window to be constant according to the size of its screen
        int x = (screenBounds.width - frameWidth) / 2;
        int y = (screenBounds.height - frameHeight) / 2;
        frame.setLocation(x, y);
        frame.setSize(frameWidth, frameHeight);


        frame.setTitle("GAME ENDED !");
        ImageIcon image = new ImageIcon("src/frames/backgrounds/ICON.jpg");
        frame.setIconImage(image.getImage());
        frame.setSize(338,600);
        frame.setLayout(null);// for use setbounds
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);//size of frame
        frame.getContentPane().setBackground(new Color(0x151212));
        frame.setResizable(false);

        JLabel label1 =new JLabel();
        ImageIcon image2 =new ImageIcon ("src/frames/backgrounds/LOGIN.png");
        label1.setIcon(image2);
        label1.setBounds(0,-5,338,605);



        gameOver = new JLabel("GAME ENDED!");
        gameOver.setBounds(60, 30, 200, 70);
        gameOver.setFont(new Font("Callibri", Font.BOLD, 28));
        gameOver.setForeground(new Color(247, 252, 252));
        label1.add(gameOver);


        playerWon1 = new JLabel("White Player Won");
        playerWon1.setFont(new Font("Callibri", Font.BOLD, 30));
        playerWon1.setForeground(new Color(247, 252, 252));
        playerWon1.setBounds(40, 100 , 300, 100);

        if((Move.winner==1)||(Time.remainingTimeB==0)) {
    label1.add(playerWon1);
}

        playerWon2 = new JLabel("Black Player Won");
        playerWon2.setFont(new Font("Callibri", Font.BOLD, 30));
        playerWon2.setForeground(new Color(247, 252, 252));
        playerWon2.setBounds(40, 100, 300, 100);


        if((Move.winner==2)||(Time.remainingTimeW==0)) {
        label1.add(playerWon2);
        }


        checkScore = new JLabel("Check Score:  ");
        checkScore .setBounds(20, 320, 180, 30);
        checkScore .setFont(new Font("Callibri", Font.BOLD, 20));
        checkScore .setForeground(new Color(247, 252, 252));
        label1.add(checkScore);



        viewScore = new JButton("Score ");
        viewScore.setFont(new Font("Callibri", Font.BOLD, 18));
        viewScore.setBounds(180, 310, 100, 50);
        viewScore.setBackground(new Color(143, 92, 52));
        viewScore.setForeground(new Color(255, 255, 255));
        viewScore.setFocusable(false); // setting this to false makes the border around the text on the button be invisible and this is how it looks better
        label1.add(viewScore);

        viewScore.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame currentFrame = (JFrame) SwingUtilities.getWindowAncestor(viewScore);
                currentFrame.dispose();

                Final_Frame f1 = new Final_Frame();
            }});


        frame.add(label1);
        frame.setVisible(true);





    }}