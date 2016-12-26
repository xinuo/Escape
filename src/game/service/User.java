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
    static public String UserName;
    static private boolean UserStatus;
    static private int UserPower = 2;
    static private boolean UserState=true; //发言的权限
    static public int UserNum;
    static public int UID;//user ID
    public void setUserName(String n){
        UserName = n;
    }
    public void setUserStatus(boolean n){
        UserStatus = n;
    }
    public void setUserPower(int n){
        UserPower = n;
    }
    public void setUserNum(int n){
        UserNum = n;
}
    public String getUserName(){return UserName;}
    public boolean getUserStatus(){return UserStatus;}
    public int getUserPower(){return UserPower;}
    public boolean getUserState(){return UserState;}

}
