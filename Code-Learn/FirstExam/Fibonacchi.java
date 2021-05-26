package FirstExam;
import java.util.Scanner;
public class Fibonacchi {
    int fibonaachiFind(int data){
        // if(data==0){
        //     return data;
        // }
        // else if(data==1){
        //     return data;
        // }
        if(data<=1){
            return data;
        }
        // else if(data==2){
        //     return data;
        // }
        else{
            return fibonaachiFind(data-1)+fibonaachiFind(data-2);
        }
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Fibonacchi fib=new Fibonacchi();
        System.out.println("Enter position to find fibonachhi");
        int pos=sc.nextInt();
        int show=fib.fibonaachiFind(pos);
        System.out.println("The pos is = "+show);
        sc.close();
    }
}
