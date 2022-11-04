package javaapplication21;

import java.util.Random;
import javax.swing.ImageIcon;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author OWNER 2
 */
public class Apple implements GameObject {

    boolean movingUp = true;
    boolean movedoffScreen = false;

    boolean sliced = false;
    int x, y;

    @Override
    public boolean isMovingUp() {
        return movingUp;
    }

    @Override
    public void setMovingUp(boolean movingUp) {
        this.movingUp = movingUp;
    }

    @Override
    public void slice() {
        sliced = true;
    }

    @Override
    public int getXLocation() {
        return x;
    }

    @Override
    public void setXLocation(int x) {
        this.x = x;
    }

    @Override
    public int getYLocation() {
        return y;
    }

    @Override
    public void setYLocation(int y) {
        this.y = y;
    }

    @Override
    public ImageIcon getBufferedImage() {
        ImageIcon i = new ImageIcon("Apple.png");//path 
        return i;
    }

    @Override
    public int getInitialVelocity() {
        return 10;
    }

    @Override
    public int getFallingVelocity() {
        return 20;
    }

    @Override
    public boolean isSliced() {
        return sliced;
    }

    public boolean hasMovedOffScreen() {
        return movedoffScreen;
    }

    @Override
    public void setMovedOff(boolean moved) {
        this.movedoffScreen = moved;
    }

    @Override
    public void MoveUp() {
        Random r = new Random();
        int m = r.nextInt(5);
        int newy = y - m;
        int newx = x - m;
        x = newx;
        y = newy;
        if (newy < 20) {
            setMovingUp(false);
        }
    }

    @Override
    public void MoveDown() {
        int newy = y + getFallingVelocity();
        setYLocation(newy);
        if (newy > 800) {
            setMovedOff(true);
        }
        //To change body of generated methods, choose Tools | Templates.
    }
}
