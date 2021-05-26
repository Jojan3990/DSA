package Tree.Btrees;

//Here in this program i am going to try to 
//implement B tree in program


//Definition:-
//B-Tree is also multiway search tree and also balanched.
//It is specialized m-way tree that can be used for disk access
//A B-tree of order m can have at most m-1 keys & m children
import java.util.Scanner;
class Node{
    int data;
    Node left,right;
    Node(){
        this.data=0;
        left=null;
        right=null;
    }
    Node(int data){
        this.data=data;
        left=null;
        right=null;
    }
}

public class Btree {
    int i=1;
    int m;//order of data while inserting will have m-1 keys or data value hold
    void getOrder(int data){
        this.m=data;
    }
    void initializeNode(Node node){
        Scanner sc=new Scanner(System.in);
        while(i<m){
            if(node.data==0){
                System.out.println("Enter data");
                int d=sc.nextInt();
                node.data=d;
                System.out.println("pp");
                ++i;
                }
            else if(node.right==null){
                ++i;
                System.out.println("Enter data");
                int d=sc.nextInt();
                node.right=new Node(d);
                initializeNode(node.right);
            }
        }
        sc.close();
    }

    void normalFLow(Node node,int data){
        if(data<node.data){
            if(node.left==null){
                node.left=new Node(data);
            }
            else if(node.left!=null){
                normalFLow(node.left, data);
            }
            else {
                
            }
        }
        else if(data>=node.data){

        }
    }

    void displayInitial(Node node){
        if(node.right!=null){
            System.out.println(node.data);
            displayInitial(node.right);
        }
        else{
            System.out.println(node.data);
        }
        

    }
    public static void main(String[] args) {
        Node node=new Node();
        Btree bt=new Btree();
        Scanner sc=new Scanner(System.in);
        System.out.println("how mny elemnts do you think you will want to enter \n # Just for prediction");
        int n=sc.nextInt();
        System.out.println("How many order size do you want ?");
        int m=sc.nextInt();
        if(n<m){
            System.out.println("elements to be entered are low than ordered try again");
        }
        else{
            bt.getOrder(m);
            bt.initializeNode(node);
            System.out.println("");
            bt.displayInitial(node);
            System.out.println("Now first set of order are initialized in nodes");
            int choice;
            do{
                System.out.println("Enter choice 1 for insertion");
                choice=sc.nextInt();
                switch(choice){
                    case 1:
                    System.out.println("Enter data");
                    int data=sc.nextInt();
                    bt.normalFLow(node, data);
                    break;

                    default:
                    System.out.println("Exiting");
                    break;
                }
            }while (choice<=1);
        }
        sc.close();
    }
}
