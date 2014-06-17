/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package game.service;

/**
 *
 * @author 泣雨
 */
public class User {
    public String UserName;
    private boolean UserStatus;
    private short UserPower = 2;
    private boolean UserState;
    public short UserNum;
    public void setUserName(String n){
        UserName = n;
    }
    public void setUserStatus(boolean n){
        UserStatus = n;
    }
    public void setUserPower(short n){
        UserPower = n;
    }
    public void setUserNum(short n){
        UserNum = n;
}
    public String UserName(){return UserName;}
    public boolean UserStatus(){return UserStatus;}
    public short UserPower(){return UserPower;}
    public boolean UserState(){return UserState;}

}
