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
public class Display {
    public void Display(Room r){
        if(r.RoomColor==4){
          System.out.println("房间是蓝色安全房间");
        }else if(r.RoomColor==3){
          System.out.println("房间是绿色解毒房间");
        }else if(r.RoomColor==2){
          System.out.println("房间是红色危险房间");  
        }else if(r.RoomColor==1){
          System.out.println("房间是白色线索房间");
        }
}
}
