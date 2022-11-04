/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication21;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author OWNER 2
 */
public class GamePanel extends JPanel implements ActionListener {

    ArrayList<GameObject> gameobjects = new ArrayList<>();
    Factory f = new Factory();
    Timer t = new Timer(100, this);

    public GamePanel() {
        generateObjects();
        t.start();
    }

    public void generateObjects() {
        int noofshapes;
        Random r = new Random();
        noofshapes = r.nextInt(4) + 1;
        int xloc = 400;
        int yloc = 500;
        for (int i = 0; i < noofshapes; i++) {
            GameObject g = generateRandomObject();
            g.setXLocation(xloc);
            g.setYLocation(yloc);
            gameobjects.add(g);
            xloc += 80;
        }
    }

    public GameObject generateRandomObject() {
        Random r = new Random();
        int x = r.nextInt(2);
        if (x == 0) {
            return f.getObject("apple");
        } else {
            return f.getObject("Orange");
        }

    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (int i = 0; i < gameobjects.size(); i++) {
            GameObject go = gameobjects.get(i);
            g.drawImage(go.getBufferedImage().getImage(), go.getXLocation(), go.getYLocation(), this);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < gameobjects.size(); i++) {
            GameObject go = gameobjects.get(i);
            if (go.isMovingUp()) {
                int oldy = go.getYLocation();
                int newy = oldy - go.getInitialVelocity();
                go.setYLocation(newy);
                if (newy < 20) {
                    go.setMovingUp(false);
                }
            } else {
                int oldy = go.getYLocation();
                int newy = oldy + go.getFallingVelocity();
                go.setYLocation(newy);
                if (newy > 800) {
                    go.setMovedOff(true);
                }
            }
        }
        boolean alloffscreen = true;
        for (int i = 0; i < gameobjects.size(); i++) {
            GameObject go = gameobjects.get(i);
            if (!go.hasMovedOffScreen()) {
                alloffscreen = false;
                break;
            }

        }
        if (alloffscreen) {
            gameobjects.clear();
            generateObjects();
        }
        repaint();

    }
}
