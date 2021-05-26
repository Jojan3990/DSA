package Tree.BST;

import java.util.Scanner;

// import jdk.internal.org.jline.terminal.Size;

class Nodee{
    int data;
    Nodee left,right;
    Nodee(){
        this.data=0;
        left=null;
        right=null;
    }
    Nodee(int data){
        this.data=data;
        left=null;
        right=null;
    }
}

public class TreeAll {
    void insert(Nodee node,int data){
        if(node.data==0){
            System.out.println("this is first root node");
            node.data=data;
        }
        else if(data<node.data){
            if(node.left!=null){
                insert(node.left, data);
            }
            else{
                node.left =new Nodee(data);
            }
        }
        else if(data>=node.data){
            if(node.right!=null){
                insert(node.right, data);
            }
            else{
                node.right =new Nodee(data);
            }
        }
    }
    void preOrder(Nodee node){
        if (node==null){
            System.out.println("this part is null for ");
        }
        else{
            System.out.println(node.data);
            preOrder(node.left);
            preOrder(node.right);
        }
    }
    void inOrder(Nodee node){
        if(node==null){
            System.out.println("This part is null");
        }
        else{
            inOrder(node.left);
            System.out.println(node.data);
            inOrder(node.right);
        }
    }
    void postOrder(Nodee node){
        if(node==null){
            System.out.println("This part is Null");
        }
        else{
            postOrder(node.left);
            postOrder(node.right);
            System.out.println(node.data);
        }
    }
    void search(Nodee node,int data){
        if(node.data==data){
            System.out.println("data matched");
        }
        else if(node==null){
            System.out.println("the node has reached null");
        }
        else if(data<node.data){
            search(node.left, data);
        }
        else{
            search(node.right, data);
        }
    }
    // Nodee deleteLeaf(Nodee node){
    //     if(node==null){
    //         System.out.println("Null BAHAHAHA");
    //     }
    //     else if(node.left==null && node.right==null){
    //         return null;
    //     }
    //     else{
    //         node.left=deleteLeaf(node.left);
    //         node.right=deleteLeaf(node.right);
    //     }
    //     return node;
    // }
    int getRightLeft(Nodee node){
        while(node.left!=null){
            node=node.left;
        }
        return node.data;
    }
    //Program to find number of node in tree
    int nodeIntree(Nodee node){
        if(node==null){
            return 0;
            // nodeIntree(node.right);
            
        }
        return 1+ nodeIntree(node.left)+nodeIntree(node.right);
        // System.out.println("Total number of node is ="+node.total);
        // return c;
    }
    Nodee delete(Nodee node,int data){
        if(node==null){
            System.out.println("data not found or null");
        }
        else if(node.data<data){
            node.right=delete(node.right,data);
        }
        else if(node.data>data){
            node.left=delete(node.left, data);
        }
        else if(node.data==data){ 
            if(node.left==null && node.right==null){ //for leaf node
                System.out.println("Thos data "+node.data+" now deleting");
                // node= null;
                node=null;
                return null;
            }
            //for one child only case
            else if(node.left!=null && node.right==null){
                System.out.println("Thos data "+node.data+" now deleting");
                return node.left;
            }
            else if(node.right!=null && node.left==null){
                System.out.println("Thos data "+node.data+" now deleting");
                return node.right;
            }
            //for two child case
            // else if(node.left!=null && node.right!=null ){
            else{
                System.out.println("Thos data "+node.data+" is a leaf node now deleting");
                int min=getRightLeft(node.right);
                node.data=min;
                System.out.println("Now we have set node and now going to delete node smallest from right");
                node.right=delete(node.right, min);
            }
            
        }
        else{
            System.out.println("data not found");
        }
        return node;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // System.out.println("initialize data for Root node at first");
        // int d=sc.nextInt();
        Nodee node=new Nodee();
        TreeAll t=new TreeAll();
        System.out.println("Enter the options :- ");
        System.out.println("1 for insert \n 2 for preOrder \n 3 for Inorder \n 4 for PostOrder \n 5 to search data \n 6 to delete leaf node \n 7 for total number pf node in tree");
        int choice;
        do{     
            System.out.println("Enter choice");
            choice=sc.nextInt();
            switch(choice){
            case 1:
            System.out.println("Enter data for tree");
            int data=sc.nextInt();
            t.insert(node, data);
            break;

            case 2:
            System.out.println("printing in pre order");
            t.preOrder(node);
            break;
            
            case 3:
            System.out.println("printing in In order");
            t.inOrder(node);
            break;

            case 4:
            System.out.println("Printing in post order");
            t.postOrder(node);
            break;

            case 5:
            System.out.println("Enter the data to search");
            int dat=sc.nextInt();
            t.search(node, dat);
            break;

            case 6:
            System.out.println("Enter data to delete");
            int nodeDel=sc.nextInt();
            node=t.delete(node,nodeDel);
            break;
            
            case 7:
            System.out.println("Now searching number of node in tree");
            int c=t.nodeIntree(node);
            System.out.println("Total number of node is = "+c);
            break;

            default:
            System.out.println("wrong choice");
            break;
        }

        }while(choice<8);
        
        sc.close();
    }
}
