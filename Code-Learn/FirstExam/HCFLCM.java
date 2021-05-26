package FirstExam;
import java.util.Scanner;
public class HCFLCM {
    void hcf(int min,int a,int b){
        if(a%min==0 && b%min==0){
            System.out.println("The HCF is = "+min);
        }
        else{
            hcf(min-1,a,b);
        }
    }
    void lcm(int max,int a,int b){
        if(max%a==0 && max%b==0){
            System.out.println("The Lcm is ="+max);
        }
        else{
            lcm(max+1,a,b);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HCFLCM h=new HCFLCM();
        System.out.println("Enter two data to find hcf and lcm");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int min,max;
        if(a<b){
            min=a;
        }
        else if(a>b){
            min=b;
        }
        else{
            System.out.println("Choosen same data so i take any data");
            min=a;
        }
        h.hcf(min,a, b);
        if(a>b){
            max=a;
        }
        else if(b>a){
            max=b;
        }
        else{
            System.out.println("as data is sama i take any data");
            max=a;
        }
        h.lcm(max, a, b);
        sc.close();
    }
}
