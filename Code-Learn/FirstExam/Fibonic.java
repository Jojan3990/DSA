package FirstExam;
import java.util.Scanner;
public class Fibonic {
    int fibo(int data){
        if(data==0){
            return 1;
        }
        int ret=data*fibo(data-1);
        return ret;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Fibonic fib=new Fibonic();
        System.out.println("Enter number to find fibonic");
        int f=sc.nextInt();
        int show=fib.fibo(f);
        System.out.println("The fibonaci of the entered data is ="+show);
        sc.close();
    }
}
