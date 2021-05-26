package PracticeOwn.RecursionPracOwn;

import java.util.Scanner;
public class Lcm {
    void lcmCalculate(int max,int a,int b){
        if(max%a==0 && max%b==0){
            System.out.println(max+" is LCM");
        }
        else{
            lcmCalculate(max+1, a, b);
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Lcm l=new Lcm();
        System.out.println("Enter two number for HCF calculation");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Checking which one is max or min or equal");
        int toSend;
        if(a>b){
            toSend=a;
        }
        else if(a<b){
            toSend=b;
        }
        else{
            System.out.println("as it is equal we send any");
            toSend=a;
        }
        l.lcmCalculate(toSend, a, b);
        sc.close();
    }
}
