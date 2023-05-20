package board;
import pieces.*;

import javax.swing.*;
import javax.swing.plaf.basic.BasicButtonUI;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public  class Square extends JButton implements ActionListener {

    private int row;
    private int col;

    public Square (int row, int col){
        this.row = row;
        this.col = col;

        setPreferredSize(new Dimension(87, 87)); // Set the preferred size of the square

        if((row+col)%2 != 0){
            setBackground(new Color(139,92,9));
        }

        else {
            setBackground(new Color(250,229,192));
        }


        setUI(new BasicButtonUI());
        setFocusPainted(false);
        setBorderPainted(false);
        setOpaque(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }
    public int getRow(){
        return row;
    }

    public int getCol(){
        return col;
    }


    public  ImageIcon setPiece(Pieces piece){


        if(piece !=null) {
            ImageIcon icon = new ImageIcon(piece.getPath(piece.getColor()));
            icon.setImage(icon.getImage());
           setIcon(icon);
            return icon;
        }
        else{return null;
        }



    }


}
