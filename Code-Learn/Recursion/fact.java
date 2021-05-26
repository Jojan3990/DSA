package Recursion;

public class fact {
    int facto(int n){    //this condition doesnt work for n when o as it have to reutrn 0
        if(n==0){
            return 1;
        }
        else{
            int store= n*facto(n-1);
            return store;
        }
    }
    public static void main(String[] args) {
        fact f=new fact();
        System.out.println(f.facto(5));
    }
}
