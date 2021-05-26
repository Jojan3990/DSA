package Game;
import java.util.Scanner;

class Print{
    void printArr(){
        System.out.println("Exiting now as Array full \n enter any key to exit");
    }
}
public class Alu {
    Scanner sc=new Scanner(System.in);
    Print p=new Print();
    int suma;
    int sumb;
    int track=0;
    int a,b;
    int arr[]=new int[9];
    void boxPrint(){
    }
    void forA(){
        int i;
        if(track!=9){
            System.out.println("Enter data for A");
            a=sc.nextInt();
        }
        
        if(track!=9){
            for(i=0;i<9;i++){
                if(arr[i]==a){
                    System.out.println("data already exists");
                    forA();
                    // break;
                } 
            }
        }
        
        if(track!=9){
            arr[track]=a;
            ++track;
        }
        
        if(track!=10){
            if(a==1){
                // store=6;
                suma=suma+6;
                // System.out.println("one "+sum);
                if(suma==15){
                    System.out.println("A is winner");
                }
            }
            else if(a==2){
                suma=suma+1;
                // System.out.println("two "+suma);
                if(suma==15){
                    System.out.println("A is winner");
                }
            }
            else if(a==3){
                // store=8;
                suma=suma+8;
                // System.out.println("Three "+suma);
                if(suma==15){
                    System.out.println("A is winner");
                }
            }
            else if(a==4){
                // store=7;
                suma=suma+7;
                if(suma==15){
                    System.out.println("A is winner");
                }
            }
            else if(a==5){
                // store=5;
                suma=suma+5;
                if(suma==15){
                    System.out.println("A is winner");
                }
            }
            else if(a==6){
                // store=3;
                suma=suma+3;
                if(suma==15){
                    System.out.println("A is winner");
                }
            }
            else if(a==7){
                // store=2;
                suma=suma+2;
                if(suma==15){
                    System.out.println("A is winner");
                }
            }
            else if(a==8){
                // store=9;
                suma=suma+9;
                if(suma==15){
                    System.out.println("A is winner");
                }
            }
            else if(a==9){
                // store=4;
                suma=suma+4;
                if(suma==15){
                    System.out.println("A is winner");
                }
            }
            else {
                System.out.println("Entered wrong number");
            }
        }
        // if(track==9){
        //     p.printArr();
        // }
        
        }

    void forB(){
        
        int i;
        if(track!=9){
            System.out.println("Enter data for B");
            b=sc.nextInt();
        }
        if(track!=9){
            for(i=0;i<9;i++){
                if(arr[i]==b){
                    System.out.println("data already exists");
                    forB(); //does the code down execute?
                    break;
                }
            }
        }
        if(track!=9){
            arr[track]=b;
            ++track;
        }
        
        if(track!=10){
            if(b==1){
                // store=6;
                sumb=sumb+6;
                if(sumb==15){
                    System.out.println("B is winner");
                }
            }
            else if(b==2){
                // store=1;
                sumb=sumb+1;
                if(sumb==15){
                    System.out.println("B is winner");
                }
            }
            else if(b==3){
                // store=8;
                sumb=sumb+8;
                if(sumb==15){
                    System.out.println("B is winner");
                }
            }
            else if(b==4){
                // store=7;
                sumb=sumb+7;
                if(sumb==15){
                    System.out.println("B is winner");
                }
            }
            else if(b==5){
                // store=5;
                sumb=sumb+5;
                if(sumb==15){
                    System.out.println("B is winner");
                }
            }
            else if(b==6){
                // store=3;
                sumb=sumb+3;
                if(sumb==15){
                    System.out.println("B is winner");
                }
            }
            else if(b==7){
                // store=2;
                sumb=sumb+2;
                if(sumb==15){
                    System.out.println("B is winner");
                }
            }
            else if(b==8){
                // store=9;
                sumb=sumb+9;
                if(sumb==15){
                    System.out.println("B is winner");
                }
            }
            else if(b==9){
                // store=4;
                sumb=sumb+4;
                if(sumb==15){
                    System.out.println("B is winner");
                }
            }
            else {
                System.out.println("Entered wrong number");
            }
        }
        // if(track==9){
        //     p.printArr();
        // }
        
    }
    void printFull(){
        System.out.println("Array is full exiting try again");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Alu a=new Alu();
        int i=0;
        do{
            a.forA();
            a.forB();
            i=i+2;
        }while(i<=8);
        System.out.println("Better luck next time");
        sc.close();
    }
}
