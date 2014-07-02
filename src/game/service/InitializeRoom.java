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
        static SetRoom r1 = new SetRoom();
        static SetRoom r2 = new SetRoom();
        static SetRoom r3 = new SetRoom();
        static SetRoom r4 = new SetRoom();
        static SetRoom r5 = new SetRoom();
        static SetRoom r6 = new SetRoom();
        static SetRoom r7 = new SetRoom();
        static SetRoom r8 = new SetRoom();
        static SetRoom r9 = new SetRoom();
        static SetRoom r10 = new SetRoom();
        static SetRoom r11 = new SetRoom();
        static SetRoom r12 = new SetRoom();
          Random r = new Random();  
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
        short a,b,c;
        a=in.nextShort();
       r1.setRoomNum(a);
       
    /*System.out.println("请指定5个线索房间的号数（1—12）,按回车结束");
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
            */
    System.out.println("请指定2个解毒房间的号数（1—12）,按回车结束");
       b=in.nextShort();
       r11.setRoomNum(b);
    System.out.println("请再指定1个解毒房间的号数（1—12）,按回车结束");
       c=in.nextShort();
       r12.setRoomNum(c);
       
       ////////////////随机生成除输入的数字之外的房间号///////////////////////
       System.out.println("duandian1");
                        int[] intRet = new int[12]; 
                        int intRd = 0; //存放随机数
                        int count = 0; //记录生成的随机数个数
                        int flag = 0; //是否已经生成过标志
                        intRet[0]=a;
                        intRet[10]=b;
                        intRet[11]=c;
                        while(count<12){
                             java.util.Random rdm = new java.util.Random(System.currentTimeMillis());
                             intRd = Math.abs(rdm.nextInt())%12+1;
                             for(int i=0;i<count;i++){
                                 if(intRet[i]==intRd){
                                     flag = 1;
                                     break;
                                 }else{
                                     flag = 0;
                                 }
                             }
                             if(flag==0){
                                 intRet[count] = intRd;
                                 count++;
                             }
                    }
                   for(int t=0;t<12;t++){
                       int d=t+1;
                       System.out.println(d+"->"+intRet[t]);
                   }
                
             
         //////////////生成完毕//////////////
    /*
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
*/
    }
    
   public void InquireRoom(){
       Scanner i = new Scanner(System.in);
       Display d = new Display();
       System.out.println("请输入你要查询的房间号（1-12）");
        int a;
        a=i.nextShort();
        
        if(a==r1.getRoomNum()){
            d.Display(r1);
        }else if(a==r2.getRoomNum()){
            d.Display(r2);
        }else if(r3.getRoomNum()==a){
            d.Display(r3);
        }else if(r4.getRoomNum()==a){
            d.Display(r4);
        }else if(r5.getRoomNum()==a){
            d.Display(r5);
        }else if(r6.getRoomNum()==a){
            d.Display(r6);
        }else if(r7.getRoomNum()==a){
            d.Display(r7);
        }else if(r8.getRoomNum()==a){
            d.Display(r8);
        }else if(r9.getRoomNum()==a){
            d.Display(r9);
        }else if(r10.getRoomNum()==a){
            d.Display(r10);
        }else if(r11.getRoomNum()==a){
            d.Display(r11);
        }else if(r12.getRoomNum()==a){
            d.Display(r12);
        }
    
}
}