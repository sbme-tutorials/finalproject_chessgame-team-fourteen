package frames;
import board.*;
import pieces.*;


import javax.swing.*;
import java.awt.*;

public class Final_Frame extends JFrame {
    public Final_Frame(){
        ImageIcon image = new ImageIcon("src/frames/backgrounds/ICON.jpg"); //choose an icon image for our app from its path
        JFrame frame = new JFrame("Game Result");

        // Get the screen dimensions
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        GraphicsDevice gd = ge.getDefaultScreenDevice();
        Rectangle screenBounds = gd.getDefaultConfiguration().getBounds();

        // Calculate the position of the frame
        int frameWidth = 200;  // Adjust the frame width as needed
        int frameHeight = 400; // Adjust the frame height as needed

        //set the frame location on any PC window to be constant according to the size of its screen
        int x = (screenBounds.width - frameWidth) / 2;
        int y = (screenBounds.height - frameHeight) / 2;
        frame.setLocation(x, y);
        frame.setSize(frameWidth, frameHeight);


        frame.setIconImage(image.getImage());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200, 400);



        JPanel panel = new JPanel();

        Object[][] data = {

                {"  n.ofwins ","          5","  n.ofwins","          4"},
                {"  n.oflose ","          3","  n.oflose","          1"},
                {"  n.score ", "          2","  n.score","          3"},

        };

        String[] columnNames = {"Player1", "Data", "player2","Data"};

        JTable table = new JTable(data, columnNames);




        table.getColumnModel().getColumn(0).setPreferredWidth(25);
        table.getColumnModel().getColumn(1).setPreferredWidth(75);

        table.getColumnModel().getColumn(2).setPreferredWidth(25);
        table.getColumnModel().getColumn(3).setPreferredWidth(75);

        table.setRowHeight(132);

        JScrollPane scrollPane = new JScrollPane(table);
        frame.add(scrollPane);
        frame.setVisible(true);

        frame.pack();


    }}
