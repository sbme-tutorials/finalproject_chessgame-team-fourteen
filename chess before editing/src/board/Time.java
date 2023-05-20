package board;

import frames.Final_Frame;
import frames.Game_Over_Frame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static board.Board.*;

public class Time {
    public static Timer timerB;
    public Timer timerW;
  //  public static JLabel timerLabelB;
    //public JLabel timerLabelW;
    public static int remainingTimeB;
    public static int remainingTimeW;


    public  Time(JPanel panel3_1,JPanel panel3_3 ) {
        //BLACK PLAYER'S TIMER
        timerLabelB = new JLabel("05:00");
        remainingTimeB = 300; // 5 minutes in seconds



        timerLabelB.setFont(new Font("Callibri", Font.BOLD, 28));
        timerLabelB.setForeground(Color.black);
        timerLabelB.setBounds(170, 10, 100, 78);
        Timer timerB = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (state==2){
                    remainingTimeB--;}
                int minutes = remainingTimeB / 60;
                int seconds = remainingTimeB % 60;
                timerLabelB.setText( String.format("%02d:%02d", minutes, seconds));
                if (remainingTimeB == 0) {
                   // JOptionPane.showMessageDialog(null, "Black Player's Timer ended.");
                    JFrame currentFrame = (JFrame) SwingUtilities.getWindowAncestor(timerLabelB);
                    currentFrame.dispose();

                    Game_Over_Frame g1  = new Game_Over_Frame();
                }
            }
        });
        timerB.start();

        if (remainingTimeB==0){
            timerB.stop();
        }


        panel3_1.setLayout(null);
       // panel3_1.add(label_B);
        panel3_1.add(timerLabelB);


//WHITE PLAYER'S TIMER


        timerLabelW = new JLabel("05:00");
        remainingTimeW = 300; // 5 minutes in seconds

        timerLabelW.setFont(new Font("Callibri", Font.BOLD, 28));
        timerLabelW.setForeground(Color.black);
        timerLabelW.setBounds(170, 10, 100, 78);


        Timer timerW = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(state==1){
                    remainingTimeW--;}

                int minutes = remainingTimeW / 60;
                int seconds = remainingTimeW % 60;

                String formattedTime = String.format("%02d:%02d", minutes, seconds);
                timerLabelW.setText(formattedTime);

                if (remainingTimeW == 0) {
                    //JOptionPane.showMessageDialog(null, "White Player's Timer ended.");
                    JFrame currentFrame = (JFrame) SwingUtilities.getWindowAncestor(timerLabelW);
                    currentFrame.dispose();
                    int timerW=0;
                    Game_Over_Frame g1  = new Game_Over_Frame();


                 //   frame.dispose();
                }
            }
        });
        timerW.start();

        if (remainingTimeW==0){
            timerW.stop();
            System.out.println("time stop");
        }



        panel3_3.setLayout(null);
    //    panel3_3.add(label_W);
        panel3_3.add(timerLabelW);

    }
}
