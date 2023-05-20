package frames;
import board.*;


import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Player_Name_Frame extends JFrame {


    JTextField txtplayer1, txtplayer2,txttime;
    JLabel lblplayer1, lblplayer2, lbltime;
    JButton btnsignin;

    public Player_Name_Frame() {

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


        frame.setTitle("Set your Name and Timer !");
        ImageIcon image = new ImageIcon("src/frames/backgrounds/ICON.jpg");
        frame.setIconImage(image.getImage());
        frame.setSize(338,600);
        frame.setLayout(null);// for use setbounds
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);//size of frame
        frame.getContentPane().setBackground(new Color(0x151212));
        frame.setResizable(false);


        JLabel label2 =new JLabel();
        ImageIcon image2 =new ImageIcon ("src/frames/backgrounds/LOGIN.png");
        label2.setIcon(image2);
        // label2.setHorizontalTextPosition(JLabel.CENTER);
        // label2.setVerticalTextPosition(JLabel.TOP);
        label2.setBounds(0,-5,600,600);
        // frame.add(label2);

        JLabel lblplayer1 = new JLabel("Player 1 Name: ");
        lblplayer1.setBounds(20, 150, 260, 25);
        lblplayer1.setFont(new Font("Callibri", Font.BOLD, 15));
        lblplayer1.setForeground(new Color(247, 252, 252));
        label2.add(lblplayer1);

        JTextField txtplayer1 = new JTextField();
        txtplayer1.setBounds(20, 180, 260, 25);
        txtplayer1.setFont(new Font("Callibri", Font.BOLD, 15));
        txtplayer1.setForeground(Color.black);
        label2.add(txtplayer1);


        JLabel lblplayer2 = new JLabel("Player 2 Name:");
        lblplayer2.setBounds(20, 230, 260, 25);
        lblplayer2.setFont(new Font("Callibri", Font.BOLD, 15));
        lblplayer2.setForeground(new Color(247, 252, 252));
        label2.add(lblplayer2);


        JTextField txtplayer2 = new JTextField();
        txtplayer2.setBounds(20, 260, 260, 25);
        txtplayer2.setFont(new Font("Callibri", Font.BOLD, 15));
        txtplayer2.setForeground(new Color(14, 14, 14));
        label2.add(txtplayer2);


        JRadioButton option1 = new JRadioButton("5 minutes");
        option1.setOpaque(false); // Set the radio button to be transparent
        option1.setForeground(Color.white); // Set the foreground color of the radio button text
        option1.setBorder(new EmptyBorder(5, 10, 5, 10)); // Add padding to the radio button

        JRadioButton option2 = new JRadioButton("10 minutes");
        option2.setOpaque(false); // Set the radio button to be transparent
        option2.setForeground(Color.white); // Set the foreground color of the radio button text
        option2.setBorder(new EmptyBorder(5, 10, 5, 10)); // Add padding to the radio button


        option1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });

        option2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Do something when option 2 is selected
            }
        });

        JPanel panel = new JPanel();
        panel.setOpaque(false) ;
        ButtonGroup group = new ButtonGroup();
        group.add(option1);
        group.add(option2);
        panel.add(option1);
        panel.add(option2);
        panel.setBounds(20, 320, 260, 30);





        JLabel lbltime  = new JLabel("Set Timer:");
        lbltime.setBounds(20, 290, 260, 30);
        lbltime.setFont(new Font("Callibri", Font.BOLD, 15));
        lbltime.setForeground(new Color(247, 252, 252));
        label2.add(lbltime);

        label2.add(panel);








        JButton btnsignin = new JButton("Let's Play!");
        btnsignin.setFont(new Font("Callibri", Font.BOLD, 18));
        btnsignin.setBounds(68, 420, 170, 50);
        btnsignin.setBackground(new Color(143, 92, 52));
        btnsignin.setForeground(new Color(255, 255, 255));
        btnsignin.setFocusable(false); // setting this to false makes the border around the text on the button be invisible and this is how it looks better
        label2.add(btnsignin);

        btnsignin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String player1 = txtplayer1.getText();
                String player2 = txtplayer2.getText();

                SwingUtilities.invokeLater(() -> new Board(player1,player2));

                //Chess_Board b1= new Chess_Board(player1,player2 );
                frame.dispose();
            }});


        frame.add(label2);
        frame.setVisible(true);





    }}
