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
public class InquireRoom {
   InquireRoom(){
       Scanner i = new Scanner(System.in);
       System.out.println("请输入你要查询的房间号（1-12）");
        i.nextShort();
        InitializeRoom r;
        
        for(int j=0;j<12;j++){
            if(r.num[j]==i){
                
            }
        }
   }
    
}
