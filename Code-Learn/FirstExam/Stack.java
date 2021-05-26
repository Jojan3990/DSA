package FirstExam;
import java.util.Scanner;
//Stack is a linear data structure . collections of object
// import PracticeOwn.stack;
public class Stack { 
    //tos is top of stack
    // it holds top most element on stack
    int tos,size=5; // size here is size of array ranging(0-4) or n-1
    int arr[]=new int[size];
    Stack(){ // it is called automatically upon initializing(making) its object
        tos=-1; 
    }
    boolean isFUll(){
        return tos==size-1; 
    }
    boolean isEmpty(){
        return tos==-1; 
    }
}
class Stack_Main{
    Stack st=new Stack();
    void push(int n){  
        if (st.isFUll()){ //is full true or false
            System.out.println("stack is full");
        }
        else {
            ++st.tos; 
            st.arr[st.tos]=n;
        }
    }
    void pop(){
        if (st.isEmpty()){
            System.out.println("Stack is empty");
        }
        else{
            int tmp;
            tmp=st.arr[st.tos];
            --st.tos;
            System.out.println("deleted data is ="+tmp);
        }
    }
    void display(){
        for(int i=0;i<=st.tos;i++){
            System.out.println(st.arr[i]);
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Stack_Main sm=new Stack_Main();
        System.out.println("Enter choice 1 for push 2 for pop 3 for display");
        int ch;
        do{
            System.out.println("Choice");
            ch=sc.nextInt();
            switch(ch){
                case 1:
                System.out.println("Enter data for push");
                int dat=sc.nextInt();
                sm.push(dat);
                break;

                case 2:
                sm.pop();
                break;

                case 3:
                sm.display();
                break;

                default:
                System.out.println("Wrong choice");
                break;
            }
        }while(ch<4);

        sc.close();
    }
}
