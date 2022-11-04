package javaapplication21;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author OWNER 2
 */
public class Player {

    private static Player p = null;
    private int Score;
    List<Observer> myobservers = new ArrayList<>();

    public void attach(Observer o) {
        myobservers.add(o);
    }

    public void notifyallObservers() {
        for (Observer x : myobservers) {
            x.Update();
        }
    }

    public int getScore() {
        return Score;
    }

    public void setScore(int Score) {
        this.Score = Score;
        // notify observer
        notifyallObservers();
    }

    private Player() {

    }

    public static Player getInstance() {
        if (p == null) {
            p = new Player();
        }
        return p;
    }

}
