package Game;

import java.util.*;

class Gamet{
    Scanner sc=new Scanner(System.in);
    // Gamet gm=new Gamet();
    int storeVar[]=new int[9];
    int track=0;
    int sumA=0;
    int sumB=0;
    int a,b;
    int exeTrack;
    int setVal(int data){
        
        if(data==1){
            return 4;
        }
        else if(data==2){
            return 9;
        }
        else if(data==3){
            return 2;
        }
        else if(data==4){
            return 3;
        }
        else if(data==5){
            return 5;
        }
        else if(data==6){
            return 7;
        }
        else if (data==7){
            return 8;
        }
        else if(data==8){
            return 1;
        }
        else {
            return 6;
        }
    }
    void forA(){
        Gamet gm=new Gamet();
        if(track!=9){
            System.out.println("Enter data for A");
            a=sc.nextInt();
            for(int i=0;i<track;i++){
                if(storeVar[i]==a){ 
                    System.out.println("data exists");   
                    forA();
                }
            }
            int take=gm.setVal(a);
            sumA=sumA+take;
            storeVar[track]=a;
            ++track;
            exeTrack=exeTrack+1;
            if(sumA==15){
                System.out.println("A is winner");
            }
        }
        
        // int stA=gm.setVal(a);
        // sumA=sumA+a;
        // if(sumA==15){
        //     System.out.println("A is the winner");
        // }
    }
    void forB(){
        Gamet gm=new Gamet();
        if(track!=9){
            System.out.println("Enter data for B");
            b=sc.nextInt();
            for(int i=0;i<track;i++){
                if(storeVar[i]==b){ 
                    System.out.println("data exists");   
                    forB();
                    // System.exit(-1);
                }
            }
            int take=gm.setVal(b);
            sumB=sumB+take;
            storeVar[track]=b;
            ++track;
            exeTrack=exeTrack+1;
            System.out.println("Exe");
            if(sumB==15){
                System.out.println("B is winner");
            }
            
    }
}
}

public class Game {
    public static void main(String[] args) {
        Gamet gm=new Gamet();
        do{
            gm.forA();
            gm.forB();
        }while(gm.exeTrack!=9);
        System.out.println("Better luck next time");
    }
}
