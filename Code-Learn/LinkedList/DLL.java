package LinkedList;

import java.util.*;

class Node{
    int data;
    Node next,prev;
    Node(){
        next=null;
        prev=null;
    }
}
public class DLL {
    Node Head,Tail;
    DLL(){
        Head=null;
        Tail=null;
    } 
    // This is for beginning or insert at beginning
    void insertAtBeg(int data){
        Node node=new Node(); //We cannot define or make this Node object outside as if 
                              // we define it outside same node might have bee kept on using
        node.data=data;
        // node.next=null;
        // node.prev=null;
        if(Head==null){
            Head=node;
            Tail=node;
        }
        else{
            node.next=Head;
            Head.prev=node;
            Head=node;
        }
    }
    void insertAtEnd(int data){
        Node node=new Node();
        node.data=data;
        if(Head==null){
            Head=node;
            Tail=node;
        }
        else{
            node.prev=Tail;
            Tail.next=node;
            Tail=node;
        }
    }
    void insertAtParticularPos(int data){
        Scanner sc=new Scanner(System.in);
        Node node=new Node();
        node.data=data;
        Node tmp=new Node();
        System.out.println("Enter Postion");
        int pos=sc.nextInt();
        if(pos==0){
            node.next=Head;
            Head.prev=node;
            Head=node;
        }
        else{
            tmp=Head;
            while(--pos>0){
                tmp=tmp.next;
            }
            node.next=tmp.next;
            tmp.next.prev=node;
            tmp.next=node;
            node.prev=tmp;
            sc.close();
        }
    }
    void deleteFirst(){
        if(Head==null){
            System.out.println("The LL is empty");
        }
        else if(Head==Tail){
            Head=null;
            Tail=null;
        }
        else{
            Head=Head.next;
            Head.prev=null;
        }
    }
    void deleteEnd(){
        if(Head==null){
            System.out.println("The DLL is empty");
        }
        else if(Head==Tail){
            Head=null;
            Tail=null;            
        }
        else{
            Tail=Tail.prev;
            Tail.next=null;
        }
    }

    //This is for Display
    void display(){
        Node tmp=new Node();
        if(Head==null){
            System.out.println("Empty as head is null");
        }
        else{
            tmp=Head;
            while(tmp!=null){
                System.out.println(tmp.data);
                tmp=tmp.next;
            }
        }
    } 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int choice,data;
        DLL dl=new DLL();
        System.out.println("1 to insert at beginning \n 2 to insert at end \n 3 to insert into particular node\n 4 to delete in first \n 5 to delete in last \n 6 to display data in LL");
        do{
            System.out.println("Enter your Choice");
            choice=sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Enter data to send");
                    data=sc.nextInt();
                    dl.insertAtBeg(data);
                break;

                case 2:
                    System.out.println("Enter data to send");
                    data=sc.nextInt();
                    dl.insertAtEnd(data);
                break;
                case 3:
                    System.out.println("Enter data to send");
                    data=sc.nextInt();
                    dl.insertAtParticularPos(data);
                break;
                case 4:
                    System.out.println("Data is to be deleted in first");
                    dl.deleteFirst();
                break;
                case 5:
                    System.out.println("data to be deleted is last");
                    dl.deleteEnd();
                break;
                case 6:
                    System.out.println("Data in LL are");
                    dl.display();
                break;
                default:
                    System.out.println("Entered wrong choice");
                break;
            }
        }while(choice<7);
        
        sc.close();
    }
}
