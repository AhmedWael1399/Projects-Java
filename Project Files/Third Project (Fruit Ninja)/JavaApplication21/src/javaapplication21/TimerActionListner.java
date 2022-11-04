package javaapplication21;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.Action;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author OWNER 2
 */
public class TimerActionListner implements ActionListener {

    GamePanel g;

    public TimerActionListner(GamePanel g) {
        this.g = g;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        List<GameObject> gameobjects = g.gameobjects;
        for (int i = 0; i < gameobjects.size(); i++) {
            GameObject go = gameobjects.get(i);
            if (go.isMovingUp()) {
                MoveUpCommand mv = new MoveUpCommand(go);
                mv.execute();
            } else {
                MoveDownCommand mv = new MoveDownCommand(go);
                mv.execute();
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
            g.generateObjects();
        }
        g.repaint();
    }

}
