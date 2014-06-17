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
    clue = true;
}
    //蓝色房间，线索房，探索获得线索。
    public void setRed(){
    RoomColor=2;
    Posion = true;
}
    //红色房间，危险房，探索会失去1点体力
    public void setGreen(){
    RoomColor=3;
    UnPosion = true;
}
    //绿色房间，解毒。去除身上的毒性。
    public void setWhite(){
    RoomColor=4;
}
    //白色房间，没有东西。探索不产生东西
}
