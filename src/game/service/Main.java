/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package game.service;

/**
 *
 * @author 泣雨
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Room a = new Room();
        a.Room();
    initializeRoom r = new initializeRoom();
        Display();
        //login _login = new login();
	//_login.starServer();
    

    }
    
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


