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
public interface GameObject {
    public void slice();
    public boolean hasMovedOffScreen();
    public void setMovedOff(boolean moved);
    public boolean isMovingUp();
    public boolean isSliced();
    public void setMovingUp(boolean movingUp);
    public int getXLocation();
    public void setXLocation(int x);
    public int getYLocation();
    public int getInitialVelocity();
    public int getFallingVelocity();
    public void setYLocation(int y);
    public ImageIcon getBufferedImage();
}
