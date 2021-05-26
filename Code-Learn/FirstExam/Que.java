package FirstExam;
import java.util.Scanner;
public class Que {
    int front,rear;
    int size=5;
    int que[]=new int[size];
    Que(){
        front=-1;
        rear=-1;
    }
    boolean isFull(){
        return (rear+1)%size==front;
    }
    boolean isEmpty(){
        return  front==-1;
    }
}
class Que_Main{
    Que q=new Que();

    void insert(int data){
        if(q.isFull()){
            System.out.println("Stack is full");
        }
        else if(q.rear==-1 && q.front==-1){
            ++q.front;
            ++q.rear;
            q.que[q.rear]=data;
        }
        else if(q.front!=0 && q.rear==q.size-1){
            q.rear=0;
            q.que[q.rear]=data;
        }
        else{
            ++q.rear;
            q.que[q.rear]=data;
        }
    }
    void delete(){
        if(q.isEmpty()){
            System.out.println("The que is empty");
        }
        else if(q.front==q.rear){
            int tmp=q.que[q.front];
            q.front=-1;
            q.rear=-1;
            System.out.println(tmp);
        }
        else if(q.front==q.size-1){
            int tmp=q.front;
            q.front=0;
            System.out.println(tmp);
        }
        else {
            int tmp=q.que[q.front];
            ++q.front;
            System.out.println(tmp);
        }
    }
    void display(){
        if(q.front!=0 && q.rear!=q.size-1){
            for(int i=0;i<=q.rear;i++){
                System.out.println(q.que[i]);
            }
        }
        for(int i=q.front;i<=q.size-1;i++){
            System.out.println(q.que[i]);
        }
    }
    public static void main(String[] args) {
        Que_Main qu=new Que_Main();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1 for insert \n 2 for delete \n 3 for display ");
        int choice;
        do{
            System.out.println("Enter choice");
            choice=sc.nextInt();
            switch(choice){
                case 1:
                System.out.println("Enter data to insert");
                int data=sc.nextInt();
                qu.insert(data);
                break;

                case 2:
                qu.delete();
                break;

                case 3:
                qu.display();
                break;

                default:
                System.out.println("You have entered wrong choice");
                break;
            }
        }while(choice<4);
        sc.close();
    }
}
