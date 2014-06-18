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
    public void  Room(){
    System.out.println("RoomNum = "+RoomNum+"\nRoomColor = "+RoomColor+"\nPosion = "+Posion+"\nUnPosion = "+UnPosion+"\nLock = "+Lock);
    }
    private int RoomNum;
    private int RoomColor;
    private boolean Posion;
    private boolean UnPosion;
    private boolean Lock=true;
    private boolean Clue;
    public void setRoomNum(int n){RoomNum =  n;}
    public void setRoomColor(int n){RoomColor = n;}
    public void setPosion(boolean n){Posion = n;}
    public void setUnPosion(boolean n){UnPosion = n;}
    public void setLock(boolean n){Lock = n;}
    public void setClue(boolean n){Clue = n;}
    public int getRoomNum(){
        return RoomNum;
    }
    public boolean getLock(){return Lock;}
        public int getRoomColor(){
        return RoomColor;
    }
            public boolean getRoomPosion(){
        return Posion;
    }
        public boolean getUnPosion(){
            return UnPosion;
        }
        public boolean getClue(){
            return Clue;
        }
        
        
        
        
        
}