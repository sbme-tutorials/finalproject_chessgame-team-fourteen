[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-24ddc0f5d75046c5622901739e7c5dd533143b0c8e959d652212380cedb1ea36.svg)](https://classroom.github.com/a/s-rx3t9_)
# Chess Game
![](https://github.com/Shahd-A-Mahmoud/Shahd-A-Mahmoud/assets/127022375/3b46892c-03d0-4e23-a008-6ae46b560358)


## About game:
Chess is a game played between two opponents on opposite sides of a board containing 64 squares of alternating colors. Each player has 16 pieces: 1 king, 1 queen, 2 rooks, 2 bishops, 2 knights, and 8 pawns. The goal of the game is to checkmate the other king. Checkmate happens when the king is in a position to be captured (in check) and cannot escape from capture.”
## Our Project:
is to apply all of the fundamental concepts of OOP in making chess engine
## Visit our repo:
[github](https://github.com/sbme-tutorials/finalproject_chessgame-team-fourteen)_ChessGameOOP.
![](https://github.com/Shahd-A-Mahmoud/Shahd-A-Mahmoud/assets/127022375/f0b3bc96-f934-4557-86b0-d35881d8e2e3)

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
![](https://github.com/Shahd-A-Mahmoud/Shahd-A-Mahmoud/assets/127022375/a51fbd9c-4cbe-4715-b538-d2d53c14f922)

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
![](https://github.com/Shahd-A-Mahmoud/Shahd-A-Mahmoud/assets/127022375/de5d90c2-c577-4e84-ba2f-24a61ee66dc8)
![](https://github.com/Shahd-A-Mahmoud/Shahd-A-Mahmoud/assets/127022375/5e971f04-67a2-4629-a189-fff8d082877c)
![](https://github.com/Shahd-A-Mahmoud/Shahd-A-Mahmoud/assets/127022375/ec935c2d-4557-48b1-9453-a2e39a641b0a)
![](https://github.com/Shahd-A-Mahmoud/Shahd-A-Mahmoud/assets/127022375/a3798350-5395-42e7-b244-e8f4f699fd9a)
![](https://github.com/Shahd-A-Mahmoud/Shahd-A-Mahmoud/assets/127022375/2ce603f9-6c2c-440b-8eed-39296a536b04)






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
 
![Thank u](https://github.com/Shahd-A-Mahmoud/Shahd-A-Mahmoud/assets/127022375/9570d6fe-06d7-4b3e-b438-244d73a68034)








