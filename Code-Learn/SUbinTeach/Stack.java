package SUbinTeach;

class Simple_stack{
    int tos;
    int size=5;
    int arr[]=new int[size];
    Simple_stack(){
        tos=-1;
    }
    boolean isFull(){
        return tos==size-1;
    }
    boolean isEmpty(){
        return tos==-1;
    }
}

public class Stack {
    Simple_stack st=new Simple_stack();
    void push(int data){
        if(st.isFull()){
            System.out.println("Stak is full");
        }
        else{
            
        }
    }
    void pop(){

    }
    void display(){

    }
}
