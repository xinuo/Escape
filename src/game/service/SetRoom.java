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
    public SetRoom(){
        
    }
       //白色房间5个，线索房，探索获得线索。
    public void setWhite(){
    setRoomColor(1);
    setClue(true);
}
    //红色房间4个，危险房，探索会失去1点体力
    public void setRed(){
    setRoomColor(2);
    setPosion(true);
}
    //绿色房间2个，解毒。去除身上的毒性。
    public void setGreen(){
    setRoomColor(3);
    setUnPosion(true);
}
    //蓝色房间1个，安全房间。游戏结束后站在这房间的人赢。
    public void setBlue(){
    setRoomColor(4);
}
    
    
}
