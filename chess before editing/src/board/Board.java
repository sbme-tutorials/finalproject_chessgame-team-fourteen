package board;
import frames.*;
import pieces.*;

import javax.swing.*;
import javax.swing.plaf.basic.BasicButtonUI;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashSet;
import java.util.Set;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashSet;
import java.util.Set;
public class Board implements ActionListener {
    public JPanel panel3_1 = new JPanel();
    public   JPanel panel3_3 = new JPanel();

    public static boolean firstplayer=true;
    public static int state=1;
    String selectedpiece;
    String secondedpiece;
    private Timer timerB;

    private Timer timerW;
    public static JLabel timerLabelB;
    public static JLabel timerLabelW;
    private int remainingTimeB;
    private int remainingTimeW;
   static JLabel label5B = new JLabel();
   static JLabel label4B = new JLabel();
   static JLabel label3B = new JLabel();
   static JLabel label2B = new JLabel();
   static JLabel label1B = new JLabel();
   static JLabel label1W = new JLabel();
   static JLabel label2W = new JLabel();
   static JLabel label3W = new JLabel();
   static JLabel label4W = new JLabel();
   static JLabel label5W = new JLabel();
   static int WP=0,WR=0,WN=0,WB=0,WQ=0;
     static  int BP=0,BR=0,BN=0,BB=0,BQ=0;

    public static Square[][] squares = new Square[8][8];
    int count = 0;
    int intialrow;
    int intialcol;
    int finalrow;
    int finalcol;

    static JFrame frame;
    public static Set<Pieces> piecesBox = new HashSet<Pieces>();

    public Board(String player1, String player2) {

        //Time t1= new Time(timerLabelB,timerLabelW);

        JPanel panel2 = new JPanel(); //THIS PANEL HOLDS THE DIFFERENT PARTS OF THE MIDDLE PANEL

        JPanel panel2_1 = new JPanel(); //this is the TOP part of the middle panel
        JPanel panel2_2 = new JPanel(); //this is the LEFT part of the middle panel
        JPanel panel2_3 = new JPanel(); //this is the RIGHT part of the middle panel
        JPanel panel2_4 = new JPanel(); //this is the BOTTOM part of the middle panel
        JPanel panel2_5 = new JPanel(); //this is the MIDDLE part of the middle panel

        // int count =0;
       frame = new JFrame();


        ImageIcon image = new ImageIcon("src/frames/backgrounds/ICON.jpg"); //choose an icon image for our app from its path

        //FRAME SETTINGS

        frame.setTitle("Chess Game"); // setting a title for this frame which is "Chess Game"
        frame.setIconImage(image.getImage()); // adds the icon image we chose above to the actual window
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //to exit out of app when we hit the "x" button on top of the frame

        frame.setSize(1390, 780); //sets the x-dimension and the y-dimension of our frame
        frame.setLayout(null); //this is very important to be able to put the panels through the frame at the left,center,right
        frame.setResizable(false); //if we don't need the user to be able to change size of the window.

        // Get the screen dimensions
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        GraphicsDevice gd = ge.getDefaultScreenDevice();
        Rectangle screenBounds = gd.getDefaultConfiguration().getBounds();

        // Calculate the position of the frame
        int frameWidth = 1390;  // Adjust the frame width as needed
        int frameHeight = 780; // Adjust the frame height as needed

        //set the frame location on any PC window to be constant according to the size of its screen
        int x = (screenBounds.width - frameWidth) / 2;
        int y = (screenBounds.height - frameHeight) / 2;
        frame.setLocation(x, y);
        frame.setSize(frameWidth, frameHeight);




        //THE LEFT PANEL

        JPanel panel1_1 = new JPanel(); // this is the TOP part of the left panel
        panel1_1.setBackground(new Color(160, 160, 160)); //sets background color of panel to be red
        panel1_1.setBounds(0, 0, 318, 300); //we set the bounds for the top part of left panel
        frame.add(panel1_1); // add panel 1_1 to the left_top of the frame

        JPanel panel1_2 = new JPanel(); // this is the MIDDLE part of the left panel
        panel1_2.setBackground(new Color(200, 200, 200)); //sets background color of panel to be blue
        panel1_2.setBounds(0, 300, 318, 144); //we set the bounds for the middle part of left panel
        frame.add(panel1_2); // add panel 1_2 to the left_middle of the frame

        JPanel panel1_3 = new JPanel(); // this is the BOTTOM part of the left panel
        panel1_3.setBackground(new Color(160, 160, 160)); //sets background color of panel to be green
        panel1_3.setBounds(0, 444, 318, 300); //we set the bounds for the bottom part of left panel
        frame.add(panel1_3); // add panel 1_3 to the left_bottom of the frame

        //THE RIGHT PANEL

        //this is the TOP part of the right panel
        panel3_1.setBackground(new Color(200, 200, 200)); //sets background color of panel
        panel3_1.setBounds(1062, 0, 318, 122); //we set the bounds for the top part of right panel
        frame.add(panel3_1); // add panel 3_1 to the right_top of the frame

        JPanel panel3_2 = new JPanel(); //this is the MIDDLE part of the left panel
        panel3_2.setBackground(new Color(160, 160, 160)); //sets background color of panel to be blue
        panel3_2.setBounds(1062, 122, 318, 500); //we set the bounds for the middle part of right panel
        frame.add(panel3_2); // add panel 3_2 to the right_middle of the frame

        //this is the BOTTOM part of the left panel
        panel3_3.setBackground(new Color(200, 200, 200)); //sets background color of panel to be green
        panel3_3.setBounds(1062, 622, 318, 122); //we set the bounds for the bottom part of right panel
        frame.add(panel3_3); // add panel 3_3 to the right_bottom of the frame


//DEAD BLACK PIECES (PANEL1_1)

        JLabel label0B = new JLabel();
        label0B.setText("DEAD black pieces");
        label0B.setFont(new Font("Calibri", Font.BOLD, 18));
        label0B.setBounds(10, 10, 318, 20);
        label0B.setHorizontalAlignment(JLabel.CENTER);

        //   JLabel label1B = new JLabel();
        label1B.setIcon(new ImageIcon("src/pieces/assets/black/BlackPawn.png"));
        label1B.setText("x"+BP);
        label1B.setBounds(10, 30, 80, 78);
        label1B.setHorizontalAlignment(JLabel.LEFT);

        //  JLabel label2B = new JLabel();
        label2B.setIcon(new ImageIcon("src/pieces/assets/black/BlackRook.png"));
        label2B.setText("x"+BR);
        label2B.setBounds(120, 30, 80, 78);
        label2B.setHorizontalAlignment(JLabel.LEFT);

        //  JLabel label3B = new JLabel();
        label3B.setIcon(new ImageIcon("src/pieces/assets/black/BlackKnight.png"));
        label3B.setText("x"+BN);
        label3B.setBounds(10, 130, 80, 78);
        label3B.setHorizontalAlignment(JLabel.LEFT);

        // JLabel label4B = new JLabel();
        label4B.setIcon(new ImageIcon("src/pieces/assets/black/BlackBishop.png"));
        label4B.setText("x"+BB);
        label4B.setBounds(120, 130, 80, 78);
        label4B.setHorizontalAlignment(JLabel.LEFT);

        //   JLabel label5B = new JLabel();
        label5B.setIcon(new ImageIcon("src/pieces/assets/black/BlackQueen.png"));
        label5B.setText("x"+BQ);
        label5B.setBounds(230, 30, 80, 78);
        label5B.setHorizontalAlignment(JLabel.LEFT);


        //DEAD WHITE PIECES  (PANEL1_3)

        JLabel label0W = new JLabel();
        label0W.setText("DEAD white pieces");
        label0W.setFont(new Font("Calibri", Font.BOLD, 18));
        label0W.setBounds(10, 10, 318, 20);
        label0W.setHorizontalAlignment(JLabel.CENTER);

        //  JLabel label1W = new JLabel();
        label1W.setIcon(new ImageIcon ("src/pieces/assets/white/WhitePawn.png"));
        label1W.setText("x"+WP);
        label1W.setBounds(10, 30, 80, 78);
        label1W.setHorizontalAlignment(JLabel.LEFT);

        //  JLabel label2W = new JLabel();
        label2W.setIcon(new ImageIcon ("src/pieces/assets/white/WhiteRook.png"));
        label2W.setText("x"+WR);
        label2W.setBounds(120, 30, 80, 78);
        label2W.setHorizontalAlignment(JLabel.LEFT);

        // JLabel label3W = new JLabel();
        label3W.setIcon(new ImageIcon ("src/pieces/assets/white/WhiteKnight.png"));
        label3W.setText("x"+WN);
        label3W.setBounds(10, 130, 80, 78);
        label3W.setHorizontalAlignment(JLabel.LEFT);

        // JLabel label4W = new JLabel();
        label4W.setIcon(new ImageIcon ("src/pieces/assets/white/WhiteBishop.png"));
        label4W.setText("x"+WB);
        label4W.setBounds(120, 130, 80, 78);
        label4W.setHorizontalAlignment(JLabel.LEFT);

        // JLabel label5W = new JLabel();
        label5W.setIcon(new ImageIcon ("src/pieces/assets/white/WhiteQueen.png"));
        label5W.setText("x"+WQ);
        label5W.setBounds(230, 30, 80, 78);
        label5W.setHorizontalAlignment(JLabel.LEFT);


        //ADDING LABELS OF DEAD BLACK PIECES TO THE PANEL

        panel1_1.setLayout(null); //without this, label1.setBounds is useless, i'm not sure why till now
        panel1_1.add(label0B);
        panel1_1.add(label1B);
        panel1_1.add(label2B);
        panel1_1.add(label3B);
        panel1_1.add(label4B);
        panel1_1.add(label5B);


        //ADDING LABELS OF DEAD WHITE PIECES TO THE PANEL

        panel1_3.setLayout(null); //without this, label1.setBounds is useless, i'm not sure why till now
        panel1_3.add(label0W);
        panel1_3.add(label1W);
        panel1_3.add(label2W);
        panel1_3.add(label3W);
        panel1_3.add(label4W);
        panel1_3.add(label5W);

        //ADDING BUTTONS TO PANEL 1_2

        JButton pause_resumeButton = new JButton();
        pause_resumeButton.setText("Pause/Resume");
        pause_resumeButton.setFont(new Font("Calibri", Font.BOLD, 20));
        pause_resumeButton.setBounds(34, 10, 250, 50);
        pause_resumeButton.setFocusable(false); // setting this to false makes the border around the text on the button be invisible and this is how it looks better


        JButton loginFrameButton = new JButton();
        loginFrameButton.setText("Go back to Log in");
        loginFrameButton.setFont(new Font("Calibri", Font.BOLD, 20));
        loginFrameButton.setBounds(34, 80, 250, 50);
        loginFrameButton.setFocusable(false); // setting this to false makes the border around the text on the button be invisible and this is how it looks better
        loginFrameButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JFrame currentFrame = (JFrame) SwingUtilities.getWindowAncestor(loginFrameButton);
                currentFrame.dispose();
                Intro_Frame i1 = new Intro_Frame();
            }
        });


        panel1_2.setLayout(null); //without this, label1.setBounds is useless, i'm not sure why till now
        panel1_2.add(pause_resumeButton);
        panel1_2.add(loginFrameButton);


        //BOARD LABELLING

        //1. Labelling the TOP (Horizontally)

        JLabel label1 = new JLabel();
        label1.setText("              a                           b                           c                           d                           e                           f                           g                           h");
        label1.setForeground(Color.white);
        label1.setBounds(22, 2, 700, 18);
        panel2_1.setLayout(null);
        panel2_1.add(label1);


        //2. Labelling the LEFT (Vertically)

        JLabel label2_1 = new JLabel();
        label2_1.setText("1");
        label2_1.setForeground(Color.white);
        label2_1.setBounds(7, 38, 18, 15);

        JLabel label2_2 = new JLabel();
        label2_2.setText("2");
        label2_2.setForeground(Color.white);
        label2_2.setBounds(7, 125, 18, 15);

        JLabel label2_3 = new JLabel();
        label2_3.setText("3");
        label2_3.setForeground(Color.white);
        label2_3.setBounds(7, 212, 18, 15);

        JLabel label2_4 = new JLabel();
        label2_4.setText("4");
        label2_4.setForeground(Color.white);
        label2_4.setBounds(7, 299, 18, 15);

        JLabel label2_5 = new JLabel();
        label2_5.setText("5");
        label2_5.setForeground(Color.white);
        label2_5.setBounds(7, 386, 18, 15);

        JLabel label2_6 = new JLabel();
        label2_6.setText("6");
        label2_6.setForeground(Color.white);
        label2_6.setBounds(7, 473, 18, 15);

        JLabel label2_7 = new JLabel();
        label2_7.setText("7");
        label2_7.setForeground(Color.white);
        label2_7.setBounds(7, 560, 18, 15);

        JLabel label2_8 = new JLabel();
        label2_8.setText("8");
        label2_8.setForeground(Color.white);
        label2_8.setBounds(7, 647, 18, 15);

        panel2_2.setLayout(null);
        panel2_2.add(label2_1);
        panel2_2.add(label2_2);
        panel2_2.add(label2_3);
        panel2_2.add(label2_4);
        panel2_2.add(label2_5);
        panel2_2.add(label2_6);
        panel2_2.add(label2_7);
        panel2_2.add(label2_8);
        //RIGHT TOP PANEL
       JLabel label_B = new JLabel();
        label_B.setIcon(new ImageIcon("C:\\Users\\lenovo\\IdeaProjects\\CHESSSS AFTER EDITT\\src\\pieces\\assets\\black\\BlackPawn.png"));
        label_B.setText(player1);
        label_B.setFont(new Font("Callibri", Font.BOLD, 16));
        label_B.setForeground(Color.black);
        label_B.setBounds(10, 10, 150, 78);

//BLACK PLAYER'S TIMER
        panel3_1.add(label_B);
        //RIGHT BOTTOM PANEL

    JLabel label_W = new JLabel();
        label_W.setIcon(new ImageIcon("C:\\Users\\lenovo\\IdeaProjects\\CHESSSS AFTER EDITT\\src\\pieces\\assets\\white\\WhitePawn.png"));
        label_W.setText(player2);
        label_W.setFont(new Font("Callibri", Font.BOLD, 16));
        label_W.setForeground(Color.black);
        label_W.setBounds(10, 10, 150, 78);
//WHITE PLAYER'S TIMER
        panel3_3.add(label_W);
      Time time=new Time(this.panel3_1,this.panel3_3);

        //THE MIDDLE PANEL

        panel2.setBackground(Color.black); //sets background color of panel to be white
        panel2.setBounds(318, 0, 744, 744); //we set the bounds for panel 2 "the one in the middle"
        panel2.setLayout(new BorderLayout()); // we write this to make the border out of panels we made, from panel2_1 to panel2_5


        panel2_1.setBackground(Color.DARK_GRAY);
        panel2_2.setBackground(Color.DARK_GRAY);
        panel2_3.setBackground(Color.DARK_GRAY);
        panel2_4.setBackground(Color.DARK_GRAY);

        panel2_1.setPreferredSize(new Dimension(744, 22));
        panel2_2.setPreferredSize(new Dimension(22, 744));
        panel2_3.setPreferredSize(new Dimension(22, 744));
        panel2_4.setPreferredSize(new Dimension(744, 22));
        panel2_5.setPreferredSize(new Dimension(700, 700));





        for (int row = 0; row <= 7; row++) {
            for (int col = 0; col <= 7; col++) {
                squares[row][col] = new Square(row, col);
                int finalR = row;
                int finalC = col;
                squares[row][col].addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        count += 1;
                        if (count % 2 != 0) {
                            intialrow = squares[finalR][finalC].getRow();
                            intialcol = squares[finalR][finalC].getCol();
                            if((Pieces.getId(intialrow,intialcol).charAt(0)=='W'&&state==1)||(Pieces.getId(intialrow,intialcol).charAt(0)=='B'&&state==2)){
                                Highlighting.makeHighlihts(intialrow, intialcol);}
                        } else {
                            finalrow = squares[finalR][finalC].getRow();
                            finalcol = squares[finalR][finalC].getCol();
                            if((Pieces.getId(intialrow,intialcol).charAt(0)=='W'&&state==1)||(Pieces.getId(intialrow,intialcol).charAt(0)=='B'&&state==2)){
                                Highlighting.resetHighlights();
                                Move.movePiece(intialrow, intialcol, finalrow, finalcol);}
                        }
                        if(firstplayer)
                        {
                            firstplayer=false;
                        }
                        else{
                            firstplayer=true;
                        }
                    }
                });
                panel2_5.add(squares[row][col]);
            }
        }

        panel2_5.setLayout(new GridLayout(8, 8)); // We made this middle part to be the chess board consisting of 64 squares

        panel2.add(panel2_1, BorderLayout.NORTH);
        panel2.add(panel2_2, BorderLayout.WEST);
        panel2.add(panel2_3, BorderLayout.EAST);
        panel2.add(panel2_4, BorderLayout.SOUTH);
        panel2.add(panel2_5, BorderLayout.CENTER);

        squares[0][0].setPiece(new Rook(PieceType.Rook, ColorPiece.Black, 0, 0));
        squares[0][1].setPiece(new Knight(PieceType.Knight, ColorPiece.Black, 0, 1));
        squares[0][2].setPiece(new Bishop(PieceType.Bishop, ColorPiece.Black, 0, 2));
        squares[0][3].setPiece(new Queen(PieceType.Queen, ColorPiece.Black, 0, 3));
        squares[0][4].setPiece(new King(PieceType.King, ColorPiece.Black, 0, 4));
        squares[0][5].setPiece(new Bishop(PieceType.Bishop, ColorPiece.Black, 0, 5));
        squares[0][6].setPiece(new Knight(PieceType.Knight, ColorPiece.Black, 0, 6));
        squares[0][7].setPiece(new Rook(PieceType.Rook, ColorPiece.Black, 0, 7));

        for (int col = 0; col < 8; col++) {
            squares[1][col].setPiece(new Pawn(PieceType.Pawn, ColorPiece.Black, 1, col));
            squares[6][col].setPiece(new Pawn(PieceType.Pawn, ColorPiece.White, 6, col));
        }
        squares[7][0].setPiece(new Rook(PieceType.Rook, ColorPiece.White, 7, 0));
        squares[7][1].setPiece(new Knight(PieceType.Knight, ColorPiece.White, 7, 1));
        squares[7][2].setPiece(new Bishop(PieceType.Bishop, ColorPiece.White, 7, 2));
        squares[7][3].setPiece(new Queen(PieceType.Queen, ColorPiece.White, 7, 3));
        squares[7][4].setPiece(new King(PieceType.King, ColorPiece.White, 7, 4));
        squares[7][5].setPiece(new Bishop(PieceType.Bishop, ColorPiece.White, 7, 5));
        squares[7][6].setPiece(new Knight(PieceType.Knight, ColorPiece.White, 7, 6));
        squares[7][7].setPiece(new Rook(PieceType.Rook, ColorPiece.White, 7, 7));

        // set of updated piece.
        piecesBox.add(new Rook(PieceType.Rook, ColorPiece.White, 7, 0));
        piecesBox.add(new Rook(PieceType.Rook, ColorPiece.White, 7, 7));
        piecesBox.add(new Rook(PieceType.Rook, ColorPiece.Black, 0, 0));
        piecesBox.add(new Rook(PieceType.Rook, ColorPiece.Black, 0, 7));
        piecesBox.add(new Queen(PieceType.Queen, ColorPiece.White, 7, 3));
        piecesBox.add(new Queen(PieceType.Queen, ColorPiece.Black, 0, 3));
        piecesBox.add(new King(PieceType.King, ColorPiece.White, 7, 4));
        piecesBox.add(new King(PieceType.King, ColorPiece.Black, 0, 4));
        piecesBox.add(new Knight(PieceType.Knight, ColorPiece.White, 7, 1));
        piecesBox.add(new Knight(PieceType.Knight, ColorPiece.White, 7, 6));
        piecesBox.add(new Knight(PieceType.Knight, ColorPiece.Black, 0, 1));
        piecesBox.add(new Knight(PieceType.Knight, ColorPiece.Black, 0, 6));
        piecesBox.add(new Bishop(PieceType.Bishop, ColorPiece.White, 7, 2));
        piecesBox.add(new Bishop(PieceType.Bishop, ColorPiece.White, 7, 5));
        piecesBox.add(new Bishop(PieceType.Bishop, ColorPiece.Black, 0, 2));
        piecesBox.add(new Bishop(PieceType.Bishop, ColorPiece.Black, 0, 5));
        piecesBox.add(new Pawn(PieceType.Pawn, ColorPiece.White, 6, 0));
        piecesBox.add(new Pawn(PieceType.Pawn, ColorPiece.White, 6, 1));
        piecesBox.add(new Pawn(PieceType.Pawn, ColorPiece.White, 6, 2));
        piecesBox.add(new Pawn(PieceType.Pawn, ColorPiece.White, 6, 3));
        piecesBox.add(new Pawn(PieceType.Pawn, ColorPiece.White, 6, 4));
        piecesBox.add(new Pawn(PieceType.Pawn, ColorPiece.White, 6, 5));
        piecesBox.add(new Pawn(PieceType.Pawn, ColorPiece.White, 6, 6));
        piecesBox.add(new Pawn(PieceType.Pawn, ColorPiece.White, 6, 7));
        piecesBox.add(new Pawn(PieceType.Pawn, ColorPiece.Black, 1, 0));
        piecesBox.add(new Pawn(PieceType.Pawn, ColorPiece.Black, 1, 1));
        piecesBox.add(new Pawn(PieceType.Pawn, ColorPiece.Black, 1, 2));
        piecesBox.add(new Pawn(PieceType.Pawn, ColorPiece.Black, 1, 3));
        piecesBox.add(new Pawn(PieceType.Pawn, ColorPiece.Black, 1, 4));
        piecesBox.add(new Pawn(PieceType.Pawn, ColorPiece.Black, 1, 5));
        piecesBox.add(new Pawn(PieceType.Pawn, ColorPiece.Black, 1, 6));
        piecesBox.add(new Pawn(PieceType.Pawn, ColorPiece.Black, 1, 7));


        frame.add(panel2); // add panel 2 to the center of the frame
        frame.setVisible(true);




        if((Time.remainingTimeB==0)||(Time.remainingTimeW==0)) {
            frame.dispose();
            Game_Over_Frame g1 = new Game_Over_Frame();
        }




    }


  public static   Pieces pieceAt(int row, int col) {
        for (Pieces loopSelect : piecesBox) {
            if (loopSelect.getCurrentRow() == row && loopSelect.getCurrentColumn() == col) {
                return loopSelect;
            }
        }
        return null;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}