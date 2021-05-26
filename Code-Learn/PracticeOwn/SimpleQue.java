package PracticeOwn;
import java.util.*;
public class SimpleQue {
    int front,rear;
    int n=4;
    int item[]=new int[n];
    SimpleQue(){
        front=-1;
        rear=-1;
    }
    boolean isFull(){
        return rear==n-1;
    }
    boolean isEmpty(){
        return front==-1;
    }
}
class SimpleQueEn{
    SimpleQue s=new SimpleQue();
    void enque(int data){
        if (s.isFull()){
            System.out.println("The que is full");
        }
        else if(s.front==-1){
            ++s.front;
            ++s.rear;
            s.item[s.rear]=data;
        }
        else{
            ++s.rear;
            s.item[s.rear]=data;
        }
    }
    void deque(){
        if(s.isEmpty()){
            System.out.println("the stack is empty");
        }
        else if (s.rear==s.front) {
            int data=s.item[s.rear];
            --s.front;
            --s.rear;
            System.out.println("the last data is = "+data);
        }
        else{
            int data;
            data=s.item[s.rear];
            --s.rear;
            System.out.println("the dequed data is = "+data);
        }
    }
    void display(){
        for(int i=0;i<=s.rear;i++){
            System.out.println("the data to be displayed are "+s.item[i]);
        }
    }
    public static void main(String[] args) {
        SimpleQueEn q=new SimpleQueEn();
        Scanner sc=new Scanner(System.in);
        System.out.println("Choose the option \n 1 for enque \n 2 for deque \n 3 for display");
        int data,choice;
        do{
            System.out.println("Enter choice");
            choice=sc.nextInt();
            switch(choice){
                case 1:
                System.out.println("enter your data");
                data=sc.nextInt();
                q.enque(data);
                break;

                case 2:
                q.deque();
                break;

                case 3:
                q.display();
                break;

                default :
                System.out.println("wrong choice");
                break;
            }
        }while(choice<4);

        sc.close();
    }
}
