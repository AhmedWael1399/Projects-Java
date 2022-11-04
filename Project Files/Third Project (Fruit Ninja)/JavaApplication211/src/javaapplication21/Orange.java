package javaapplication21;


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
public class Orange implements GameObject {

    public boolean isMovingUp() {
        return movingUp;
    }

    public void setMovingUp(boolean movingUp) {
        this.movingUp = movingUp;
    }

    boolean movingUp = true;
    boolean movedoffScreen = false;

    boolean sliced = false;
    int x, y;

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
        ImageIcon i = new ImageIcon("Orange.png");
        return i;
    }

    @Override
    public int getInitialVelocity() {
        return 20;
    }

    @Override
    public int getFallingVelocity() {
        return 30;
    }

    @Override
    public boolean isSliced() {
        return sliced;
    }

    @Override
    public boolean hasMovedOffScreen() {
        return movedoffScreen;
    }

    @Override
    public void setMovedOff(boolean moved) {
        this.movedoffScreen = moved;
    }

}
