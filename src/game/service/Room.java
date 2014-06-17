/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package game.service;

/**
 *
 * @author 泣雨
 */
public class Room {
    public void Room(){
       System.out.println("RoomNum = "+RoomNum+"\nRoomColor = "+RoomColor+"\nPosion = "+Posion+"\nUnPosion = "+UnPosion+"\nLock = "+Lock);
    }
    short RoomNum;
    static short RoomColor;
    boolean Posion;
    boolean UnPosion;
    boolean Lock=true;
    boolean clue;
    public void  setRoomNum(short n){RoomNum =  n;}
    public void setRoomColor(short n){RoomColor = n;}
    public void setRoomPosion(boolean n){Posion = n;}
    public void setUnPosion(boolean n){UnPosion = n;}
    public void setLock(boolean n){Lock = n;}
    public short getRoomNum(){
        return RoomNum;
    }
    public boolean getLock(){return Lock;}
        public short getRoomColor(){
        return RoomColor;
    }
            public boolean getRoomPosion(){
        return Posion;
    }
        public boolean getUnPosion(){
            return UnPosion;
        }
}