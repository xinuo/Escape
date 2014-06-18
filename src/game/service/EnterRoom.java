/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package game.service;
import java.util.*;
/**
 *
 * @author 泣雨
 */
public class EnterRoom {
    int num[] = new int[]{0,0,0,0,0,0,0,0,0,0,0,0};
    public  EnterRoom(){
        Scanner in=new Scanner(System.in);

      //初始化房号数组
      //输入安全房间号码
        System.out.println("请指定1个安全房间的号数（1—12）,按回车结束");
        int i;
        int n,a;
        i=in.nextInt();
         num[i-1]=4;
         
    
        //输入线索房间号码
    System.out.println("请指定5个线索房间的号数（1—12）,按回车结束");

        n=0;
        a=5;
        i=in.nextInt();
        num[i-1]=1;
        n++;
        while(a>1){
            a=5-n;
            System.out.println("请再次输入"+a+"个线索房间号码，按回车结束");
            i=in.nextInt();
            num[i-1]=1;
        n++;
    }

        //输入解毒房间号码
        System.out.println("请指定1个解毒房间的号数（1—12）,按回车结束");

        i=in.nextInt();
        num[i-1]=3;
        
       //输入危险房间号码
                System.out.println("请指定5个危险房间的号数（1—12）,按回车结束");

        n=0;
        a=5;
        i=in.nextInt();
            num[i-1]=2;
        n++;
           
        while(a>1){
            a=5-n;
            System.out.println("请再次输入"+a+"个危险房间号码，按回车结束");
            i=in.nextInt();
            num[i-1]=2;
        n++;
        }
        
                
        printf(num);
        

    }
    
    public static void printf(int[] num){
    int i;
        for(i=0;i<12;i++){        
            System.out.printf(num[i]+"  ");

        }
    System.out.println();

        }

       
    }
    

