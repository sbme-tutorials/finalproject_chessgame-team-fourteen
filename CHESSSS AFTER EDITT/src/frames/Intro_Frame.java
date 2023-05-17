package frames;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;


public class Intro_Frame extends JFrame {


    JTextField txtusername1, txtusername2;
    JPasswordField txtpassword1, txtpassword2;
    //private JTextField password ;
    JLabel lblusername1, lblpassword1, lblusername2, lblpassword2;
    JButton btnsignin, btnclose, btnplay;

    JFrame frame;
    public Intro_Frame() {

        frame = new JFrame();

        // Get the screen dimensions
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        GraphicsDevice gd = ge.getDefaultScreenDevice();
        Rectangle screenBounds = gd.getDefaultConfiguration().getBounds();

        // Calculate the position of the frame
        int frameWidth = 340;  // Adjust the frame width as needed
        int frameHeight = 590; // Adjust the frame height as needed

        //set the frame location on any PC window to be constant according to the size of its screen
        int x = (screenBounds.width - frameWidth) / 2;
        int y = (screenBounds.height - frameHeight) / 2;
        frame.setLocation(x, y);
        frame.setSize(frameWidth, frameHeight);

        frame.setTitle("LOGIN to Chess Game");
        ImageIcon image = new ImageIcon("src/frames/backgrounds/ICON.jpg");
        frame.setIconImage(image.getImage());
        frame.setLayout(null);// for use setbounds
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);//size of frame
        frame.getContentPane().setBackground(new Color(0x151212));
        frame.setResizable(false);


        JLabel label2 =new JLabel();
        ImageIcon image2 =new ImageIcon ("src/frames/backgrounds/NAME.png");
        label2.setIcon(image2);
        label2.setBounds(0,-5,600,600);



        JLabel label = new JLabel();
        label.setText("Welcome to Chess Game ");
        label.setBounds(35,50,270,60);
        label.setFont(new Font("mo",Font.BOLD,21));
        label.setForeground(new Color(153,51,0));
        label2.add(label);

        JLabel lblusername1 = new JLabel("Username for Player1: ");
        lblusername1.setBounds(20, 150, 260, 25);
        lblusername1.setFont(new Font("Callibri", Font.BOLD, 15));
        lblusername1.setForeground(new Color(153,51,0));
        label2.add(lblusername1);

        JTextField txtusername1 = new JTextField();
        txtusername1.setBounds(20, 180, 260, 25);
        txtusername1.setFont(new Font("Callibri", Font.BOLD, 15));
        txtusername1.setForeground(Color.black);
        label2.add(txtusername1);


        JLabel lblpassword1 = new JLabel("Password for Player1:");
        lblpassword1.setBounds(20, 230, 260, 25);
        lblpassword1.setFont(new Font("Callibri", Font.BOLD, 15));
        lblpassword1.setForeground(new Color(153,51,0));
        label2.add(lblpassword1);


        JPasswordField txtpassword1 = new JPasswordField();
        txtpassword1.setBounds(20, 260, 260, 25);
        txtpassword1.setFont(new Font("Callibri", Font.BOLD, 15));
        txtpassword1.setForeground(new Color(14, 14, 14));
        label2.add(txtpassword1);


        JLabel lblusername2 = new JLabel("Username for Player2: ");
        lblusername2.setBounds(20, 150, 260, 25);
        lblusername2.setFont(new Font("Callibri", Font.BOLD, 15));
        lblusername2.setForeground(new Color(153,51,0));

        JTextField txtusername2 = new JTextField();
        txtusername2.setBounds(20, 180, 260, 25);
        txtusername2.setFont(new Font("Callibri", Font.BOLD, 15));
        txtusername2.setForeground(new Color(14, 14, 14));


        JLabel lblpassword2 = new JLabel("Password for Player2: ");
        lblpassword2.setBounds(20, 230, 260, 25);
        lblpassword2.setFont(new Font("Callibri", Font.BOLD, 15));
        lblpassword2.setForeground(new Color(153,51,0));

        JPasswordField txtpassword2 = new JPasswordField();
        txtpassword2.setBounds(20, 260, 260, 25);
        txtpassword2.setFont(new Font("Callibri", Font.BOLD, 15));
        txtpassword2.setForeground(new Color(24, 26, 26));



        JButton btnsignin = new JButton("Log in");
        btnsignin.setFont(new Font("Callibri", Font.BOLD, 14));
        btnsignin.setBounds(30, 350, 100, 35);
        btnsignin.setBackground(new Color(143, 92, 52));
        btnsignin.setForeground(new Color(255, 255, 255));
        btnsignin.setFocusable(false); // setting this to false makes the border around the text on the button be invisible and this is how it looks better
        label2.add(btnsignin);


        JButton btnclose = new JButton("Close");
        btnclose.setFont(new Font("Callibri", Font.BOLD, 14));
        btnclose.setBounds(180, 350, 100, 35);
        btnclose.setBackground(new Color(143, 92, 52));
        btnclose.setForeground(new Color(255, 255, 255));
        btnclose.setFocusable(false); // setting this to false makes the border around the text on the button be invisible and this is how it looks better
        label2.add(btnclose);


        JButton btnplay = new JButton("Play");
        btnplay.setFont(new Font("Callibri", Font.BOLD, 14));
        btnplay.setBounds(20, 350, 100, 35);
        btnplay.setBackground(new Color(143, 92, 52));
        btnplay.setForeground(new Color(255, 255, 255));
        btnplay.setFocusable(false); // setting this to false makes the border around the text on the button be invisible and this is how it looks better


        frame.add(label2);
        frame.setVisible(true);

        btnclose.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
            }});
        btnsignin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = txtusername1.getText();
                String password = txtpassword1.getText();
                if ((function(username, password)).equals("utpt")) {

                    label2.remove(lblusername1);
                    label2.remove(lblpassword1);
                    label2.remove(btnsignin);
                    label2.remove(txtusername1);
                    label2.remove(txtpassword1);
                    label2.add(lblusername2);
                    label2.add(lblpassword2);
                    label2.add(btnplay);
                    label2.add(txtusername2);
                    label2.add(txtpassword2);

                    frame.getContentPane().setBackground(new Color(0x151212));
                    frame.revalidate();
                    frame.repaint();

                    btnplay.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            String username2 = txtusername2.getText();
                            String password2 = txtpassword2.getText();
                            if (function(username2, password2) == "utpt") {
                                frame.dispose();
                                Player_Name_Frame d1= new Player_Name_Frame();

                                // Game_Frame g1 = new Game_Frame();
                            } else if (function(username2, password2) == "inp") {
                                showmsg(" Incorrect password ");}
                            else {
                                showmsg(" Incorrect username ");
                            }}});}
                else if((function(username, password)).equals("inp")) {
                    showmsg(" Incorrect password  ");
                }
                else {
                    showmsg(" Incorrect username ");
                }
            } });

    }
    public static String function(String x, String y){
        String result= "i don't know";
        String usernameplayer="dddd";
        String passwordplayer ="hdhg";
        int usernameline  = 2; // the line number you want to read
        int passwordline   = 3;
        boolean test = false;
        File directory = new File("src/frames/files" );
        File[] files = directory.listFiles();
        for (File file : files) {
            BufferedReader bufferedReader = null;
            try {FileReader fileReader = new FileReader(file);
                bufferedReader = new BufferedReader(fileReader);
                String line;
                LineNumberReader lineNumberReader = new LineNumberReader(bufferedReader);
                while ((line = lineNumberReader.readLine()) != null) {
                    if (lineNumberReader.getLineNumber() ==usernameline) {
                        usernameplayer = line;
                    } else if (lineNumberReader.getLineNumber() == passwordline) {
                        passwordplayer = line;}}
                lineNumberReader.close();
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();}
            if(usernameplayer.equals(x)){
                if(passwordplayer.equals(y))
                {result="utpt";
                    //user true password true
                }
                else {
                    result ="inp" ;
                    //invalid password
                }
                test=true;}}
        if (test==false){
            result=  "iu";}
        return result;  }

    public void showmsg(String msg){
        JOptionPane.showMessageDialog(this,msg);}


}
















