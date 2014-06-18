/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package game.service;

import java.util.Scanner;

/**
 *
 * @author z
 */
public class InquireRoom extends Room{
   public void InquireRoom(){
       Scanner i = new Scanner(System.in);
       Display d = new Display();
       System.out.println("请输入你要查询的房间号（1-12）");
        int a;
        a=i.nextShort();
        InitializeRoom r = new InitializeRoom();
        
        if(r.r1.getRoomNum()==a){
            d.Display(r.r1);
        }else if(r.r2.getRoomNum()==a){
            d.Display(r.r2);
        }else if(r.r3.getRoomNum()==a){
            d.Display(r.r3);
        }else if(r.r4.getRoomNum()==a){
            d.Display(r.r4);
        }else if(r.r5.getRoomNum()==a){
            d.Display(r.r5);
        }else if(r.r6.getRoomNum()==a){
            d.Display(r.r6);
        }else if(r.r7.getRoomNum()==a){
            d.Display(r.r7);
        }else if(r.r8.getRoomNum()==a){
            d.Display(r.r8);
        }else if(r.r9.getRoomNum()==a){
            d.Display(r.r9);
        }else if(r.r10.getRoomNum()==a){
            d.Display(r.r10);
        }else if(r.r11.getRoomNum()==a){
            d.Display(r.r11);
        }else if(r.r12.getRoomNum()==a){
            d.Display(r.r12);
        

   }
    
}
}