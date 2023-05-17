package frames;
import pieces.*;
import board.*;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Start_Frame extends JFrame {
    JButton button;
    JLabel label ;
    public Start_Frame() {




        JPanel panel = new JPanel(new BorderLayout());//create panel to hold button and label
        //jframe a windoew to add components to
        JFrame frame1 = new JFrame(); //CREATE FRAME

        // Get the screen dimensions
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        GraphicsDevice gd = ge.getDefaultScreenDevice();
        Rectangle screenBounds = gd.getDefaultConfiguration().getBounds();

        // Calculate the position of the frame
        int frameWidth = 560;  // Adjust the frame width as needed
        int frameHeight = 350; // Adjust the frame height as needed

        //set the frame location on any PC window to be constant according to the size of its screen
        int x = (screenBounds.width - frameWidth) / 2;
        int y = (screenBounds.height - frameHeight) / 2;
        frame1.setLocation(x, y);
        frame1.setSize(frameWidth, frameHeight);


        frame1.setTitle("Start!");
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// exit when we click the x
        frame1.setVisible(true);//make frame visible
        frame1.setResizable(false);//to prevent ersize by mouse *size is fixed*
        ImageIcon image = new ImageIcon("src/frames/backgrounds/ICON.jpg"); //create image icon
        frame1.setIconImage(image.getImage());//change icon of the frame
        frame1.getContentPane().setBackground(Color.white);//change panel color
        frame1.setVisible(true);//make frame visible
        JLabel label = new JLabel();//create label
        frame1.add(label);
        ImageIcon imagee = new ImageIcon("src/frames/backgrounds/START.png");
        label.setIcon(imagee);//image for the label
        // Border border = BorderFactory.createLineBorder(new Color(255, 215, 0), 3);
        // label.setBorder(border);//make it work
        label.setHorizontalAlignment(JLabel.CENTER);//set the horizontal pos for the icon and text at the center of the label
        label.setVerticalAlignment(JLabel.CENTER);//set the vertical pos for  the icon and the text at the center of label
        label.setHorizontalTextPosition(JLabel.CENTER);//set text center or right or left the image
        label.setVerticalTextPosition(JLabel.TOP);//set text top or down the image

        label.setBackground(null);
        label.setOpaque(true);//make change visible of background
        JButton button = new JButton();
        // frame1.add(button);
        button.setBackground(new Color(153,51,0));
        button.setBounds(40, 240, 110, 40);
        // ImageIcon iconn = new ImageIcon("shimaa.png");
        // button.setIcon(iconn);
        button.setText("START");
        button.setForeground(Color.white);

        frame1.add(button);
        button.setFont(new Font ("Callibri", Font.BOLD, 22));
        frame1.setLayout(null);// we use it when we use the bounds
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        //button.setForeground();


        frame1.setVisible(true);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame currentFrame = (JFrame) SwingUtilities.getWindowAncestor(button);
                currentFrame.dispose();

                Intro_Frame i1 = new Intro_Frame();
            }
        });





    }



}
