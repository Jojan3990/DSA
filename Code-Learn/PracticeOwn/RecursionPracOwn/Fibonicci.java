package PracticeOwn.RecursionPracOwn;


public class Fibonicci {
    int fibo(int data){
        if(data==0){
            return data;
        }
        else if(data==1) {
            return data;
        }
        else if(data==2){
            return data;
        }
        else{
            return fibo(data-1)+fibo(data-2);
        }
    }
    public static void main(String[] args) {
        Fibonicci f=new Fibonicci();
        int store=f.fibo(5);
        System.out.println(store);
    }
}
