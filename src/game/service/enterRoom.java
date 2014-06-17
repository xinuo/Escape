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
public class enterRoom {
    public static void enterRoom(){
        Scanner in=new Scanner(System.in);
        
        int[] num;
        num=new int[12];
        for(int x=0;x<12;x++){
         num[x]=0;
            }
        //初始化房号数组
        int[] tempArray;
        SetRoom r=new SetRoom();
    {System.out.println("请指定1个安全房间的号数（1—12）,按回车结束");
        int i;
        i=in.nextInt();
        Room i=new Room();
    }
        
    {System.out.println("请指定5个线索房间的号数（1—12）,按回车结束");
        int i,n,a;
        n=0;
        a=5;
        i=in.nextInt();
        tempArray=r.setBlue();
        System.arraycopy(tempArray, 0, rn[i-1], 0, 4);
        n++;
        while(a>1){
            a=5-n;
            System.out.println("请再次输入"+a+"个线索房间号码，按回车结束");
            i=in.nextInt();
        tempArray=r.setBlue();
        System.arraycopy(tempArray, 0, rn[i-1], 0, 4);
        n++;
    }
}
        
        {System.out.println("请指定1个解毒房间的号数（1—12）,按回车结束");
        int i;
        i=in.nextInt();
        tempArray=r.setGreen();
        System.arraycopy(tempArray, 0, rn[i-1], 0, 4);}
        
        {        System.out.println("请指定5个危险房间的号数（1—12）,按回车结束");
        int i,a,n;
        n=0;
        a=5;
        i=in.nextInt();
        tempArray=r.setRed();
        System.arraycopy(tempArray, 0, rn[i-1], 0, 4);
        n++;
           
        while(a>1){
            a=5-n;
            System.out.println("请再次输入"+a+"个危险房间号码，按回车结束");
            i=in.nextInt();
        tempArray=r.setBlue();
        System.arraycopy(tempArray, 0, rn[i-1], 0, 4);
        n++;
        }
        }
                
        printf(rn);
    }
    
    public static void printf(int[][] v){
    int i,j;
    for(i=0;i<12;i++){
        for(j=0;j<4;j++){
        
            System.out.printf(v[i][j]+"  ");

        }System.out.println();

        }
        
    }
    }

