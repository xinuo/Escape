/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package game.service;

/**
 *
 * @author z
 */
public class SetRoom extends Room{
    public void setBlue(){
    RoomColor=1;
    Posion = false;
    UnPosion = false;
    clue = ture;
}
    public void setRed(){
    RoomColor=2;
    Posion = true;
    UnPosion = false;
}
    public void setGreen(){
    RoomColor=3;
    Posion = false;
    UnPosion = true;
}
    public void setGreen(){
    RoomColor=3;
    Posion = false;
    UnPosion = true;
}
}
