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
        InitializeRoom  a = new InitializeRoom();
        a.InitializeRoom();
        InquireRoom I = new InquireRoom();
        I.InquireRoom();
        Display x = new Display();
        x.Display(a.r1);
        //login _login = new login();
	//_login.starServer();
            
            
    }
    



    }

