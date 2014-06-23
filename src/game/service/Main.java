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
     * @paramargs the command line arguments
     */
    public static void main(String[] args) {
        InitializeRoom  a = new InitializeRoom();
        a.InitializeRoom();
        a.InquireRoom();
        Display d = new Display();
        d.Display(InitializeRoom.r1);
        //login _login = new login();
	//_login.starServer();
        
    }
    



    }

