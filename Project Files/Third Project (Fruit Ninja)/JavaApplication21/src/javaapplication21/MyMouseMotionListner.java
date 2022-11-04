/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication21;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

/**
 *
 * @author OWNER 2
 */
public class MyMouseMotionListner implements MouseMotionListener {

    GamePanel g;

    public MyMouseMotionListner(GamePanel g) {
        this.g = g;
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();
        for (GameObject ob1 : g.gameobjects) {
            if (x >= ob1.getXLocation() && x <= ob1.getXLocation() + ob1.getBufferedImage().getIconWidth()) {
                if (y >= ob1.getYLocation() && y <= ob1.getYLocation() + ob1.getBufferedImage().getIconHeight()) {
                    if (!ob1.isSliced()) {
                        ob1.setMovingUp(false);
                        ob1.slice();
                        int sc = Player.getInstance().getScore();
                        Player.getInstance().setScore(sc + 20);
                    }
                }
            }
        }
    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }

}
