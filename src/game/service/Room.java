/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package game.service;

import java.util.Scanner;

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
        public boolean getPosion(){
        return Posion;
    }
        public boolean getUnPosion(){
            return UnPosion;
        }
        public boolean getClue(){
            return Clue;
        }
        
public void SetRoom(){
                Room r1,r2,r3,r4,r5,r6,r7,r8,r9,r10,r11,r12;

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
    
    int num[] = new int[]{0,0,0,0,0,0,0,0,0,0,0,0};
    Scanner in=new Scanner(System.in);
    //Room r1,r2,r3,r4,r5,r6,r7,r8,r9,r10,r11,r12;
        
public  void InitializeRoom(){
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
    System.out.println("请指定1个安全房间的号数（1—12）,按回车结束");
        short i;
        i=in.nextShort();
       r1.setRoomNum(i);
    System.out.println("请指定5个线索房间的号数（1—12）,按回车结束");
       i=in.nextShort();
       r6.setRoomNum(i);
    System.out.println("请再指定4个线索房间的号数（1—12）,按回车结束");
       i=in.nextShort();
       r7.setRoomNum(i);
    System.out.println("请再指定3个线索房间的号数（1—12）,按回车结束");
       i=in.nextShort();
       r8.setRoomNum(i);
    System.out.println("请再指定2个线索房间的号数（1—12）,按回车结束");
       i=in.nextShort();
       r9.setRoomNum(i);
    System.out.println("请指定1个线索房间的号数（1—12）,按回车结束");
       i=in.nextShort();
       r10.setRoomNum(i);
    System.out.println("请指定2个解毒房间的号数（1—12）,按回车结束");
       i=in.nextShort();
       r11.setRoomNum(i);
    System.out.println("请再指定1个解毒房间的号数（1—12）,按回车结束");
       i=in.nextShort();
       r12.setRoomNum(i);
    System.out.println("请指定4个危险房间的号数（1—12）,按回车结束");   
       i=in.nextShort();
       r2.setRoomNum(i);
    System.out.println("请再指定3个危险房间的号数（1—12）,按回车结束");   
       i=in.nextShort();
       r5.setRoomNum(i);
    System.out.println("请再指定2个危险房间的号数（1—12）,按回车结束");   
       i=in.nextShort();
       r3.setRoomNum(i);
    System.out.println("请再指定1个危险房间的号数（1—12）,按回车结束");   
       i=in.nextShort();
       r4.setRoomNum(i);

    }  

   public void InquireRoom(){
       Scanner i = new Scanner(System.in);
       Display d = new Display();
       System.out.println("请输入你要查询的房间号（1-12）");
        int a;
        a=i.nextShort();
        
        if(a==r1.getRoomNum()){
            d.Display(r1);
        }else if(a==r2.getRoomNum()){
            d.Display(r2);
        }else if(r3.getRoomNum()==a){
            d.Display(r3);
        }else if(r4.getRoomNum()==a){
            d.Display(r4);
        }else if(r5.getRoomNum()==a){
            d.Display(r5);
        }else if(r6.getRoomNum()==a){
            d.Display(r6);
        }else if(r7.getRoomNum()==a){
            d.Display(r7);
        }else if(r8.getRoomNum()==a){
            d.Display(r8);
        }else if(r9.getRoomNum()==a){
            d.Display(r9);
        }else if(r10.getRoomNum()==a){
            d.Display(r10);
        }else if(r11.getRoomNum()==a){
            d.Display(r11);
        }else if(r12.getRoomNum()==a){
            d.Display(r12);
        }
    
}
        
        
}