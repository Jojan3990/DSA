import java.util.Scanner;
class Simple_queue
{
    final int size=5;
    public int item[]=new int[size];
    public int rear,front;
    public Simple_queue()
    {
        rear=-1;
        front=-1;
    }
    boolean Isfull()
    {
        return rear==size-1;
    }
    boolean Isempty()
    {
        return front==-1;
    }
}
    public class MyQue
    {
        Simple_queue q=new Simple_queue();
        public void enque(int data)
        {
            if(q.Isfull())
            {
                System.out.println("overflow");
            }
            else if(q.rear==-1 && q.front==-1)
            {
                q.front++;
                q.rear++;
                q.item[q.rear]=data;
            }
            else
            {
                q.rear++;
                q.item[q.rear]=data;
            }
        }
        public void deque()
        {
            if(q.Isempty())
            {
                System.out.println("underflow");
            }
            else if(q.rear==q.front)
            {
                int x;
                x=q.item[q.rear];
                q.front=-1;
                q.rear=-1;
                System.out.println("Deque element = "+x);

            }
            else
            {
                int x;
                x=q.item[q.front];
                q.front++;
                System.out.println("Deque element = "+x);
            }
        }
        public void display()
        {
            if(q.Isempty())
            {
                System.out.println("empty que");
            }
            else{
                System.out.println("element in que are:");
                for(int i=q.front;i<q.rear;i++)
                {
                    System.out.print(q.item[i]);
                }
            }
        }
        public static void main(String[] args) {
            {
            Scanner sc=new Scanner(System.in);
            MyQue s=new MyQue();
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
                s.enque(data);
                break;

                case 2:
                s.deque();
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
