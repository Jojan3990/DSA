package PracticeOwn;

import java.util.Scanner;

public class stack {
    int tos,n=5;
    int[] item = new int[n];
    stack(){
        tos=-1;
    }    
    boolean isfull(){
        return tos==n-1;
    }
    boolean isempty(){
        return tos==-1;
    }
}
class stackHere{
    stack s=new stack();
    void push(int data){
        if(s.isfull()){
            System.out.println("Overflow");
        }
        else{
            s.tos++;
            s.item[s.tos]=data;
        }
    }
    void pop(){
        if(s.isempty()){
            System.out.println("Underflow");
        }
        else{
            int data=s.item[s.tos];
            s.tos--;
            System.out.println(data);
        }
    }
    void display(){
        if(s.isempty()){
            System.out.println("this is underflow so cannt print");
        }
        else{
            for(int i=0;i<=s.tos;i++){
                System.out.println(s.item[i]);
            }
        }
    }
    public static void main(String[] args) {
        stackHere q=new stackHere();
        System.out.println("Now choose");
        Scanner sc=new Scanner(System.in);
        int data,choice;
        do{
            System.out.println("Enter choice");
            choice=sc.nextInt();
            switch(choice){
                case 1:
                System.out.println("Enter data");
                data=sc.nextInt();
                q.push(data);
                break;

                case 2:
                System.out.println("Now taking out data");
                q.pop();
                break;

                case 3:
                System.out.println("Displaying data");
                q.display();
                break;

                default:
                System.out.println("wrong choice");
                break;
            }
        }
        while(choice<5);
        sc.close();
    }
}
