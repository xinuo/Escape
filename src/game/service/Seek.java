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
public class Seek {
    public Seek(User n,Room a){
        if (a.getPosion()==true){
            n.setUserPower(1);
    }else if (a.getUnPosion()){
            n.setUserStatus(true);
    }else if (a.getClue()==true){
        System.out.println("线索1");
    }
    }
}
