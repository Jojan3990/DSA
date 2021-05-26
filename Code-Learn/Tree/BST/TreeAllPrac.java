package Tree.BST;


    class Node{ //this is for node we take node with as like pointer left and right where the
        //node is always initialized left as null and right as null too
        Node left,right;
        int data;
        Node(int data){
            this.data=data; //here the data is for node
            left=null;
            right=null;
        }
    }
    public class TreeAllPrac {
        void insert(Node node,int data){
            if(data < node.data){ //this is condition for if data is less than the root node or relative to it
                if(node.left!=null){
                    insert(node.left, data);
                }
                else{ //this is if case there is null in node.left example at first the root node has node.left as null
                    System.out.println("Insert into left "+data);
                    node.left=new Node(data);
                }
            }
            else if(data > node.data){
                if(node.right!=null){
                    insert(node.right, data);
                }
                else{
                    System.out.println("Insert into right "+data);
                    node.right=new Node(data);
                }
            }
        }
        void preOrder(Node node){
            if(node==null){
                System.out.println("the node is empty");
            }
            else{
                System.out.println(node.data);
                preOrder(node.left);
                preOrder(node.right);
            }
        }

        public static void main(String[] args) { 
            Node r=new Node(5);//this is as i am assuming as root
            TreeAllPrac t=new TreeAllPrac();
            //here i will show you root value
            System.out.println("the root value at first is "+r.data);
            //from here we insert data
            t.insert(r, 4);
            t.insert(r, 5);
            t.insert(r, 3);
            t.insert(r, 7);
            t.insert(r, 2);
            t.preOrder(r);
        }
    }


