package board;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class Player {

    String color;
    String name;
    boolean inCheck;
    double totalTimeSpent;

    int score;

    public Player(String color, String name) {
        this.color = color;
        this.name = name;
        inCheck = false;
        totalTimeSpent = 0.0;
        score = 0;
    }













   /* public boolean isInChecked(Move move) {
        return inCheck;
    }

    public boolean hasWone( Move move) {
if(isInChecked(move))
    return true;
return false;
    }*/

    public double getTotalTimeSpent() {
        return totalTimeSpent;
    }

    public void setTotalTimeSpent(double totalTimeSpent) {
        this.totalTimeSpent = totalTimeSpent;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getScore() {
        return score;
    }

    public void incrementScore()
    {
        // if the player win
        score+=100;
    }

    public void resetScore() {
        score=0;
    }

}