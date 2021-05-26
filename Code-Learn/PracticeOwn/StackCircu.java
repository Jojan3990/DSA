package PracticeOwn;

import java.util.*;

public class StackCircu {
    int n=5,front,rear;
    int item[]=new int[n];
    StackCircu(){
        front=-1;
        rear=-1;
    }
    boolean isFull(){
        return (rear+1)%n==front;
    }
    boolean isEmpty(){
        return front==-1;
    }
}
class StackCircuEn{
    StackCircu s=new StackCircu();
    void enque(int data){
        if (s.isFull()){
            System.out.println("the que is full");
        }
        else if(s.front==-1 && s.rear==-1){
            ++s.front;
            ++s.rear;
            s.item[s.rear]=data;
        }
        else if(s.front!=0 && s.rear==s.n-1) {
            s.rear=0;
            s.item[s.rear]=data;
        }
        else{
            ++s.rear;
            s.item[s.rear]=data;
        }
    }
    void deque(){
        if(s.isEmpty()){
            System.out.println("the que is empty");
        }
        else if(s.front==s.rear){
            int data;
            data=s.item[s.front];
            s.rear=-1;
            s.front=-1;
            System.out.println("the deleted item is "+data);
        }
        else if(s.front==s.n-1){
            int data=s.item[s.front];
            s.front=0;
            System.out.println("the deleted data is "+data);
        }
        else {
            int data=s.item[s.front];
            ++s.front;
            System.out.println("the deleted data is "+data);
        }
    }
    void display(){     //is this right displaying order reference in copy rough at last
        System.out.println("now displaying data");
        if (s.isEmpty()){
            System.out.println("the que is empty");
        }
        else{
            for(int i=s.front;i<=s.n-1;i++){
                System.out.println(s.item[i]);
            }
            for(int i=0;i<=s.front-1;i++){ 
                System.out.println(s.item[i]);
            }
        }
    }
    public static void main(String[] args) {
        StackCircuEn c=new StackCircuEn();
        Scanner sc=new Scanner(System.in);
        System.out.println("choose 1 for enque \n 2 for deque \n 3 for display");
        int data,choice;
        do{
            System.out.println("enter to choose");
            choice=sc.nextInt();
            switch(choice){
                case 1:
                System.out.println("enter data");
                data=sc.nextInt();
                c.enque(data);
                break;

                case 2:
                c.deque();
                break;

                case 3:
                c.display();
                break;

                default:
                System.out.println("entered wrong choice");
                break;
            }
        }while(choice<4);
        sc.close();
    }
}
