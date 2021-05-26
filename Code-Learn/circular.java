import java.util.Scanner;
class circular_queue{
    final int size=5;
    public int item[]=new int[size];
    public int rear,front;
    public circular_queue()
    {
        rear=-1;
        front=-1;
    }
    boolean Isfull()
    {
        return (rear+1)%size==front;
    }
    boolean Isempty()
    {
        return front==-1;
    }

}
public class circular {
    circular_queue q=new circular_queue();
    public void enqueue(int data)
        {
            if(q.Isfull())
            {
                System.out.println("overflow");
            }
            else if(q.rear==-1 && q.front==-1)
            {
                q.rear++;
                q.front++;
                q.item[q.rear]=data;
            }
            else if (q.front!=0 && q.rear==q.size-1)
            {
                q.rear=0;
                q.item[q.rear]=data;
            }
            else
            {
                q.rear=(q.rear+1)%q.size;   //rear = rear + 1
                q.item[q.rear]=data;
            }
        }
    public void dequeue()
    {
        if(q.Isempty())
        {
            System.out.println("underflow");
        }
        else if(q.rear==q.front)
        {
            int data;
            data=q.item[q.front];
            q.front=-1;
            q.rear=-1;
            System.out.println("deleted elment="+data);;
        }
        else if(q.front==q.size-1)//bujhena
        {
            int data;
            data=q.item[q.front];
            q.front=0;
            System.out.println("deleted element="+data);
        }
        else//thapeko
            {
                int x;
                x=q.item[q.front];
                q.front++;
                System.out.println("Deque element = "+x);
            }
    }
    public void display()
    {
        if(q.Isempty()){
            System.out.println("empty queue");
        }
        // else if(q.front>=q.rear){
        // for(int i=q.rear;i<=q.front;i++)
        // {
        //     System.out.println(q.item[i]);
        // }
        // }
        else 
        {
            for(int i=q.front;i<q.size;i++)
            {
                System.out.println(q.item[i]);
            }
            for (int i=0;i<q.front-1;i++)
            {
                if(q.front==q.rear){
                    break;
                }
                System.out.println(q.item[i]);
            }
        }
    } 
    public static void main(String[] args) {
        {
        circular s=new circular();
        Scanner sc=new Scanner(System.in);
            
            int choice;
            int data;
            System.out.println("1 for enque \n 2 for deque \n 3 for display \n 4 for exit");
        do
        {
            System.out.println("enter choice");
            choice=sc.nextInt();
            switch (choice)
            {
                case 1:
                System.out.println("enter data");
                data=sc.nextInt();
                s.enqueue(data);
                // System.out.println(s.q.rear);
                break;

                case 2:
                s.dequeue();;
                break;

                case 3:
                s.display();
                break;

                default:
                System.out.print("wrong choice");
                break;
            }
        }   
        while(choice<4);
        sc.close();
            }
        }
    }

    

