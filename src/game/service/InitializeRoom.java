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
public class InitializeRoom extends Room{
    int num[] = new int[]{0,0,0,0,0,0,0,0,0,0,0,0};
    Scanner in=new Scanner(System.in);
        SetRoom r1 = new SetRoom();
        SetRoom r2 = new SetRoom();
        SetRoom r3 = new SetRoom();
        SetRoom r4 = new SetRoom();
        SetRoom r5 = new SetRoom();
        SetRoom r6 = new SetRoom();
        SetRoom r7 = new SetRoom();
        SetRoom r8 = new SetRoom();
        SetRoom r9 = new SetRoom();
        SetRoom r10 = new SetRoom();
        SetRoom r11 = new SetRoom();
        SetRoom r12 = new SetRoom();
            
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
    

}

      //初始化房号数组
      //输入安全房间号码
  /* System.out.println("请指定1个安全房间的号数（1—12）,按回车结束");
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
          */