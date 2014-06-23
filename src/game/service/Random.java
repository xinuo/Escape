package game.service;


public class Random {
    public int[] Random(){
        int[] intRet = new int[12]; 
                        int intRd = 0; //存放随机数
                        int count = 0; //记录生成的随机数个数
                        int flag = 0; //是否已经生成过标志
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
                       int a=t+1;
                       System.out.println(a+"->"+intRet[t]);
                   }
                       return intRet;
                }

    }

