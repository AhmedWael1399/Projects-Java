/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication21;

/**
 *
 * @author OWNER 2
 */
public class MoveUpCommand implements Command {

    GameObject gameobject;

    public MoveUpCommand(GameObject gameobject) {
        this.gameobject = gameobject;
    }

    @Override
    public void execute() {
        gameobject.MoveUp();
    }
}
