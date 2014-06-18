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
public class initializeRoom {
    public initializeRoom(){
        SetRoom r1 = new SetRoom();
        SetRoom r2 = new SetRoom();
        SetRoom r3 = new SetRoom();
        SetRoom r4 = new SetRoom();
        SetRoom r5 = new SetRoom();
        SetRoom r6 = new SetRoom();
        SetRoom r7 = new SetRoom();
        SetRoom r8 = new SetRoom();
        SetRoom r9 = new SetRoom();
        SetRoom r10 = new SetRoom();
        SetRoom r11 = new SetRoom();
        SetRoom r12 = new SetRoom();
            r1.setBlue();
            r2.setRed();
            r3.setRed();
            r4.setRed();
            r5.setRed();
            r6.setWhite();
            r7.setWhite();
            r8.setWhite();
            r9.setWhite();
            r10.setWhite();
            r11.setGreen();
            r12.setGreen();
    EnterRoom er=new EnterRoom();
    for (short i=0;i<12;i++){
        if (er.num[i]==4){
            if(r1.RoomNum!=0){
            r1.RoomNum=i;
            }

    }else if(er.num[i]==3){
        r11.RoomNum=i;
    }
    }
    }
    
}
