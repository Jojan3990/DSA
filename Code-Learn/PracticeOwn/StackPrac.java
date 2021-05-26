package PracticeOwn;

import java.util.Scanner;


class StackPrac {
    int tos,n=4;
    int item[]=new int[n];
    StackPrac(){
        tos=-1;
    }
    boolean isFull(){
        return tos==n-1;
    }
    boolean isEmpty(){
        return tos==-1;
    }
}
class StacHere{
    StackPrac st=new StackPrac();
    void push(int data){
        if (st.isFull()){
            System.out.println("the stack is full");
        }
        else{
            st.tos++;
            st.item[st.tos]=data;
        }
    }
    void pop(){
        if(st.isEmpty()){
            System.out.println("the stack is empty");
        }
        else{
            int data=st.item[st.tos];
            --st.tos;
            System.out.println("the deleted data is "+data);
        }
    }
    void display(){
        System.out.println("printing the data in stack");
        if(st.isEmpty()){
            System.out.println("the stack is empty");
        }
        else{
            for(int i=0;i<=st.tos;i++){
                System.out.println(st.item[i]);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        StacHere s=new StacHere();
        System.out.println("now enter choice \n 1 for enque \n 2 for deque \n 3 for display");
        int choice,data;
        do{
            System.out.println("enter choice");
            choice=sc.nextInt();
            switch(choice){
                case 1:
                System.out.println("Enter data");
                data=sc.nextInt();
                s.push(data);
                break;

                case 2:
                System.out.println("Popping data");
                s.pop();
                break;

                case 3:
                System.out.println("displaying data");
                s.display();
                break;

                default:
                System.out.println("entered wrong choice");
                break;
            }
        }while(choice<4);
        sc.close();
    }
}
