import javax.swing.*;
import java.awt.*;
public class promptFrame {
    //i make constructor that has the body to do when i crate an object fronm it.
    public promptFrame() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);//good for temporary window
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2, 2));
        JButton queenButton = new JButton("Queen");
        JButton rookButton = new JButton("Rook");
        JButton bishopButton = new JButton("Bishop");
        JButton knightButton = new JButton("Knight");

        panel.add(queenButton);
        panel.add(rookButton);
        panel.add(bishopButton);
        panel.add(knightButton);
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);


    }
}