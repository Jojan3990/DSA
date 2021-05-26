import java.util.Scanner;


class Singlyll //define node
{
    public int info;
    public Singlyll next;
    public Singlyll()
    {
        next=null;

    }
}
public class Sll{
    Singlyll head,tail;
    public Sll()
    {
        head=null;
        tail=null;
    }
public void insertbeg(int item)
{
    Singlyll ptr=new Singlyll();
    ptr.info=item;
    ptr.next=null;
    if(head==null)
    {
        head=ptr;
        tail=ptr;
    }
    else
    {
        ptr.next=head;
        head=ptr;
    }
}
    public void display()
    {
        Singlyll tmp=new Singlyll();
        if(head==null)
        {
            System.out.println("empty linked list");
        }
        else{
            tmp=head;
            while(tmp!=null)
            {
                System.out.println(tmp.info);
                tmp=tmp.next;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int choice;
        int item;
        Sll sl=new Sll();
        System.out.println("insert at beginning \n display \n 3 exit");
        do
        {
            System.out.println("enter choice");
            choice=sc.nextInt();
            switch(choice)
            {
            case 1:
            System.out.println("enter item");
            item=sc.nextInt();
            sl.insertbeg(item);
            break;
            case 2:
            System.out.println("Displaying");
            sl.display();
            break;
            default:
            System.out.println("wrong choice");
            break;
            }
        }
            while(choice<3);
            sc.close();
        }
    }

