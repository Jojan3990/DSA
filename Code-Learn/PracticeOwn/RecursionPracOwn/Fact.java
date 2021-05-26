package PracticeOwn.RecursionPracOwn;
import java.util.Scanner;

public class Fact {
    int facto(int data){
        if(data==0){
            return 1;
        }
        else{
            return data*facto(data-1);
            // or
            // int store=data*facto(data-1);
            // return store;
        }
    }
    public static void main(String[] args) {
        Fact f=new Fact();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter data for factorial");
        int data=sc.nextInt();
        // int factoan=f.facto(data);
        System.out.println(f.facto(data));
        sc.close();
    }
}
