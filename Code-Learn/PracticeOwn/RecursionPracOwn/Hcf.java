package PracticeOwn.RecursionPracOwn;

import java.util.Scanner;
public class Hcf {

    void hcfCalculate(int min,int a,int b){
        if(a%min==0 && b%min==0){
            System.out.println(min+" is HCF");
        }
        else{
            hcfCalculate(min-1, a, b);
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Hcf h=new Hcf();
        System.out.println("Enter two number for HCF calculation");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Checking which one is max or min or equal");
        int toSend;
        if(a>b){
            toSend=b;
        }
        else if(a<b){
            toSend=a;
        }
        else{
            System.out.println("as it is equal we send any");
            toSend=a;
        }
        h.hcfCalculate(toSend, a, b);
        sc.close();
    }
}
