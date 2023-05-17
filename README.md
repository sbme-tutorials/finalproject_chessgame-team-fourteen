[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-24ddc0f5d75046c5622901739e7c5dd533143b0c8e959d652212380cedb1ea36.svg)](https://classroom.github.com/a/s-rx3t9_)
# Chess Game
<img src="https://github.com/sbme-tutorials/finalproject_chessgame-team-fourteen/assets/127022375/1c943249-7471-4a66-b4c2-9b559dd66a30" width=1000, hight=200>

## About game:
Chess is a game played between two opponents on opposite sides of a board containing 64 squares of alternating colors. Each player has 16 pieces: 1 king, 1 queen, 2 rooks, 2 bishops, 2 knights, and 8 pawns. The goal of the game is to checkmate the other king. Checkmate happens when the king is in a position to be captured (in check) and cannot escape from capture.”
## Our Project:
is to apply all of the fundamental concepts of OOP in making chess engine
## Visit our repo:
[github](https://github.com/sbme-tutorials/finalproject_chessgame-team-fourteen)_ChessGameOOP.
![limusa-cat-playing-chess](https://github.com/sbme-tutorials/finalproject_chessgame-team-fourteen/assets/127022375/d36d09ee-cb16-4f67-8bda-896cd45b34c3)
## Instructions :
please Know that we made a non traditional chess ,we change some rules of movement of pieces 
### Edited Rules:
- For Pawn:pawn captures (eats) the squares diagonally or the piece in front.
- For Bishop:   the bishop can move up to three steps on the diagonal and one square on the horizontal axis so it changes the diagonal color.
- For Knight:The knight can move in an L shape with two squares horizontally or vertically, and then three squares in the perpendicular direction.
### Let's Review the steps of this project!
#### first: UML (class Diagram)
Visualization can be a helpful tool to manage some part of a design process.
and show the overall methods and fields
//add uml
#### second :GUI
- we use JavaSwing to make the gui of the game.
- GUI chess game provides a convenient and accessible way for chess enthusiasts of all levels to enjoy the game and improve their skills.
##### here is the libraries used:
```
import javax.swing.*;
import javax.swing.plaf.basic.BasicButtonUI;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashSet;
import java.util.Set;
```
##### some snap shots:
<img src="https://github.com/sbme-tutorials/finalproject_chessgame-team-fourteen/assets/127022375/3158d438-b882-42cb-9e27-d3716372c979">
<img src="https://github.com/sbme-tutorials/finalproject_chessgame-team-fourteen/assets/127022375/be019769-f791-436e-b2b1-c217140b3dcd">
<img src="https://github.com/sbme-tutorials/finalproject_chessgame-team-fourteen/assets/127022375/df5d5c1a-9c50-4f40-b3eb-c0cc6d3154b1">
<img src="https://github.com/sbme-tutorials/finalproject_chessgame-team-fourteen/assets/127022375/8d7fb95f-6cb4-4b26-8ad6-582125daa2bf">

#### Third: Logic Code
Please check our link and upload it in your device,we will wait for your opinion!
##### Logic used:
###### We make used of:
- ID: Carry the color and the type of All Pieces of the Board,created once pieces object is constructed.
- Hash set: Set that contains all live Pieces in the Board.
##### Summary of code:
- Board representation:This representation typically includes information such as the location of each piece, which player has the next move, and whether certain rules such as castling or en passant are currently available.
- Move generation: The engine able to generate all possible legal moves that can be made from the current game state. 
- Highlights: Knowing all available places and not allowed for any piece.
- Timer:You have a specific time, if you exceed it, you will lose.
- Death: Knowing which piece died, its type, and how many pieces of its kind died
- Score History: allows players to track their progress over time, and to compare their performance to that of other players.
##### Watch the video of our game
[![GHESS_Team14_Youtube]()


#### Developments to be added :
- Evaluation: Once all possible moves have been generated, the engine must evaluate each one to determine which is the best move to make
- Ai opponent in chess.

## Developers who work on this project
- Shahd Ahmed Mahmoud Ali 
[ Visit Shahd](https://github.com/Shahd-A-Mahmoud)
- Shaimaa kamal 
[Visit Shaimaa](https://github.com/Shaimaakamel474)
- Biatress Benyameen
[ Visit Biatress](https://github.com/Biatris-003)
- Rawan Ahmed
[Visit Rawan]()
- Aya tullah Ahmed
 [Visit Aya](https://github.com/Ayatullah-ahmed)
 
![Thanks](https://github.com/sbme-tutorials/finalproject_chessgame-team-fourteen/assets/127022375/606ed5bc-f3bf-4035-8f68-136ed9d69adb)



