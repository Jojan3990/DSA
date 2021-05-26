import java.util.Scanner;
class Simple_stack
{
    final int size=5;
    public int tos;
    public int item[]=new int[size];

    public Simple_stack()
    {
        tos=-1;
    }
    boolean IsFull()
    {
        return tos==size-1;
    }
    boolean Isempty()
    {
        return tos==-1;
    }
}
public class stack {
    Simple_stack q = new Simple_stack();

    public void push(int data) {
        if (!q.IsFull())

        {
            q.tos++;
            q.item[q.tos] = data;
        } else {
            System.out.println("Overflow");
        }
    }

    public void pop()
    {
        if(q.Isempty())
        {
            System.out.println("underflow");
        }
        else{
            int data;
            data=q.item[q.tos];
            q.tos--;
            System.out.println("Deleted item="+data);
        }
    }

    public void display() {
        if (q.Isempty()) {
            System.out.println("empty stack");
        } else {
            System.out.println("element in stack are;");
            for (int i = 0; i < q.tos; i++) {
                System.out.println(q.item[i]);
            }
        }
    }

    public static void main(String args[]) {
        int choice;
        int data;
        Scanner sc=new Scanner(System.in);
        stack s1 = new stack();
        System.out.println("1 for push \n 2 for pop \n 3 for display \n 4 for exit");
        do
        {
            System.out.println("enter choice");
            choice=sc.nextInt();
            switch (choice)
            {
                case 1:
                System.out.println("enter data");
                data=sc.nextInt();
                s1.push(data);
                break;

                case 2:
                s1.pop();
                break;

                case 3:
                s1.display();
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
