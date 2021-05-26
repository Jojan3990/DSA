package Expression;
// import java.io.Serial;
//here i think i have change logic of tos
import java.util.Scanner;


class Stack {   //This is for Stack normal
    int tos,size=9;
    char arr[]=new char[size];
    Stack(){
        tos=-1;
        // tos=0;
     }
    // Stack (int s){
    //     this.size=s;
    // }
    
    boolean isFUll(){
        return tos==size-1;
    }
    boolean isEmpty(){
        return tos==-1;
    }
}
class Stack_Main{
    Stack st=new Stack();
    void push(char n){
        if (st.isFUll()){
            System.out.println("stack is full");
        }
        else {
            // System.out.println("in stack");
            ++st.tos;
            st.arr[st.tos]=n;
            // ++st.tos;
        }
    }
    void pop(){
        if (st.isEmpty()){
            System.out.println("Stack is empty");
        }
        else{
            int tmp;
            tmp=st.arr[st.tos];
            --st.tos;
            System.out.println("deleted data is ="+tmp);
        }
    }
    void display(){
        for(int i=0;i<=st.tos;i++){
            System.out.println(st.arr[i]);
            System.out.println("");
        }
    }
}

class StackForNew{  //THis is for stack evaluate store number
    int tos,size=9;
    int arr[]=new int[size];
    StackForNew(){
        tos=-1;
     }
    // Stack (int s){
    //     this.size=s;
    // }
    
    boolean isFUll(){
        return tos==size-1;
    }
    boolean isEmpty(){
        return tos==-1;
    }
}
class StackForNew_Main{
    StackForNew st=new StackForNew();
    void push(int n){
        if (st.isFUll()){
            System.out.println("stack is full");
        }
        else {
            // System.out.println("in stack");
            ++st.tos;
            st.arr[st.tos]=n;
            // ++st.tos;
        }
    }
}
//Program starts from here
public class Expression {
    
    void inArr(String s){
        Scanner sc=new Scanner(System.in);
        Stack_Main st=new Stack_Main();
        StackForNew stk1=new StackForNew();
        // StackForNew_Main stk2=new StackForNew_Main(); 
        Stack sta=new Stack();
        int countEx=s.length();
        char arr[]=new char[countEx];
        // sta.arr[sta.tos]='#';
        int post=0;
        char arrPost[]= new char[countEx];
        for(int i=0;i<countEx;i++){
            arr[i]=s.charAt(i);
        }
        for(int i=0;i<countEx;i++){
            if(arr[i]=='('){
                ++sta.tos;
                sta.arr[sta.tos]=arr[i];
            }
            else if(arr[i]==')'){
                while(sta.arr[sta.tos]!='('){
                    arrPost[post]=sta.arr[sta.tos];
                    --sta.tos;
                    ++post;
                }
                if(sta.arr[sta.tos]!=')'){
                    --sta.tos;
                }
            }
            else if(Character.isAlphabetic(arr[i])){
                arrPost[post]=arr[i];
                ++post;
            }
            else if(arr[i]=='+' || arr[i]=='-'){
                do{
                    if(sta.tos==-1){
                        ++sta.tos;
                        sta.arr[sta.tos]=arr[i];
                        break;
                    }
                    else if(sta.arr[sta.tos]=='+' || sta.arr[sta.tos]=='-' || sta.arr[sta.tos]=='*' || sta.arr[sta.tos]=='/' || sta.arr[sta.tos]=='^' && sta.tos==0){ //this condition we might not need in future
                        // System.out.println("inside inside");
                        arrPost[post]=sta.arr[sta.tos];
                        ++post;
                        sta.arr[sta.tos]=arr[i];
                        // --sta.tos;
                        // System.out.println("at nlast");
                        
                    }
                    else if(sta.arr[sta.tos]=='+' || sta.arr[sta.tos]=='-' || sta.arr[sta.tos]=='*' || sta.arr[sta.tos]=='/' || sta.arr[sta.tos]=='^' && sta.tos!=0){ //this condition we might not need in future
                        arrPost[post]=sta.arr[sta.tos];
                        ++post;
                        sta.arr[sta.tos]=arr[i];
                        --sta.tos;
                        // System.out.println("at nlast");
                        
                    }
                    else{
                        ++sta.tos;
                        sta.arr[sta.tos]=arr[i];
                        break;
                    }
                // }while (arr[i]!='*' || arr[i]!='/' || arr[i]!='^' || arr[i]!='(');
                
                
                // System.out.println(sta.tos);
            }while (sta.arr[sta.tos]!=arr[i]);
            // System.out.println("hello");
        }
        
            else if(arr[i]=='*' || arr[i]=='/'){
                // System.out.println("I am mul");
                do{
                    if(sta.tos==-1){
                        ++sta.tos;
                        sta.arr[sta.tos]=arr[i];
                        break;
                    }
                    else if(sta.arr[sta.tos]=='*' || sta.arr[sta.tos]=='/' || sta.arr[sta.tos]=='^'){
                        arrPost[post]=sta.arr[sta.tos];
                        ++post;
                        // --sta.tos;
                        sta.arr[sta.tos]=arr[i];
                    }
                    else{
                        ++sta.tos;
                        sta.arr[sta.tos]=arr[i];
                        break;
                    }
                }while (sta.arr[sta.tos]!=arr[i]);
                
                st.push(arr[i]);
                
            }
            else if(arr[i]=='^'){
                do{
                    if(sta.tos==-1){
                        ++sta.tos;
                        sta.arr[sta.tos]=arr[i];
                        break;
                    }
                    else if(sta.arr[sta.tos]=='^'){
                        arrPost[post]=sta.arr[sta.tos];
                        ++post;
                        sta.arr[sta.tos]=arr[i];
                    }
                    else{
                        ++sta.tos;
                        sta.arr[sta.tos]=arr[i];
                        break;
                    }
                }while (sta.arr[sta.tos]!=arr[i]);
            }
            else if(arr[i]=='#'){
                while(sta.tos!=-1){
                    // System.out.println(sta.arr[sta.tos]);
                    arrPost[post]=sta.arr[sta.tos];
                    ++post;
                    --sta.tos;;
                }

                //Here the exeuction has finished
                System.out.println("Completed now exiting");
                System.out.println("DO you want to print 1 for yes 2 for no");
                int choice=sc.nextInt();
                if(choice==1){
                    System.out.println("Printing");
                    for(i=0;i<countEx;i++){
                        System.out.print(arrPost[i]);
                    }
                    System.out.println("");
                    System.out.println("Evaluate Expression press 1 for yes any number for no");
                    int ch=sc.nextInt();
                    if(ch==1){
                        System.out.println("In future we will introduce other possible number");
                        System.out.println("For now enter number for evaluation ");
                        // char chooseNum=sc.next().charAt(0);
                        String chooseNum=sc.next();
                        // System.out.println("you have been trolled working here");
                        String storeEva[]=new String[countEx];
                        int varEva;
                        for(i=0;i<countEx;i++){
                            if(Character.isAlphabetic(arrPost[i])){
                                storeEva[i]= chooseNum;
                            }
                            else{
                                storeEva[i]=String.valueOf(arrPost[i]); //Here we have converted char to String for futher processing
                            }
                        }
                        for(i=0;i<countEx;i++){ //This is simply for displaying
                            System.out.print(storeEva[i]+" ");
                        }
                            for(i=0;i<countEx;i++){
                                //This condition is for check it the string is number
                                if(storeEva[i].charAt(0)=='0' || storeEva[i].charAt(0)=='1' || storeEva[i].charAt(0)=='2' || storeEva[i].charAt(0)=='3' || storeEva[i].charAt(0)=='4' || storeEva[i].charAt(0)=='5' || storeEva[i].charAt(0)=='6'  || storeEva[i].charAt(0)=='7' || storeEva[i].charAt(0)=='8' || storeEva[i].charAt(0)=='9'){
                                    // System.out.println("TRy");
                                    int forPush=Integer.parseInt(storeEva[i]);
                                    ++stk1.tos;
                                    stk1.arr[stk1.tos]=forPush;
                                    // System.out.println(forPush);
                                }
                                else if(storeEva[i].charAt(0)=='+'){
                                    if(stk1.tos==-1){
                                        System.out.println("Nothing in stack");
                                    }
                                    else if(stk1.tos==0){
                                        System.out.println(stk1.arr[i]);
                                    }
                                    else{
                                        varEva=stk1.arr[stk1.tos]+stk1.arr[stk1.tos-1];
                                        --stk1.tos;
                                        stk1.arr[stk1.tos]=varEva;
                                    }
                                }
                                else if(storeEva[i].charAt(0)=='-'){
                                    if(stk1.tos==-1){
                                        System.out.println("Nothing in stack");
                                    }
                                    else if(stk1.tos==0){
                                        System.out.println(stk1.arr[i]);
                                    }
                                    else{
                                        varEva=stk1.arr[stk1.tos]-stk1.arr[stk1.tos-1];
                                        --stk1.tos;
                                        stk1.arr[stk1.tos]=varEva;
                                    }
                                }
                                else if(storeEva[i].charAt(0)=='*'){ //if(storeEva[i]=="*") why isnt this condition working
                                    
                                    if(stk1.tos==-1){
                                        System.out.println("Nothing in stack");
                                    }
                                    else if(stk1.tos==0){
                                        System.out.println(stk1.arr[i]);
                                    }
                                    else{
                                        varEva=stk1.arr[stk1.tos]*stk1.arr[stk1.tos-1];
                                        --stk1.tos;
                                        stk1.arr[stk1.tos]=varEva;
                                    }
                                    
                                }
                                else if(storeEva[i].charAt(0)=='/'){
                                    if(stk1.tos==-1){
                                        System.out.println("Nothing in stack");
                                    }
                                    else if(stk1.tos==0){
                                        System.out.println(stk1.arr[i]);
                                    }
                                    else{
                                        varEva=stk1.arr[stk1.tos]/stk1.arr[stk1.tos-1];
                                        --stk1.tos;
                                        stk1.arr[stk1.tos]=varEva;
                                    }
                                }
                                else if(storeEva[i].charAt(0)=='^'){
                                    if(stk1.tos==-1){
                                        System.out.println("Nothing in stack");
                                    }
                                    else if(stk1.tos==0){
                                        System.out.println(stk1.arr[i]);
                                    }
                                    else{
                                        varEva=stk1.arr[stk1.tos]^stk1.arr[stk1.tos-1];
                                        --stk1.tos;
                                        stk1.arr[stk1.tos]=varEva;
                                    }
                                }
                            }
                            System.out.println("");
                            System.out.println("");
                            System.out.println("The evaluated answer is "+stk1.arr[stk1.tos]);



                    }

                }
                else{
                    System.out.println(" choosed Either 2 or other number anyway closing program");
                }

            }
            else{
                System.out.println("Only Enter Operand and operators for now");
            }
        }
        sc.close();
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Expression e=new Expression();
        System.out.println("Enter the expression");
        String ex=sc.next();
        e.inArr(ex);
        sc.close();
    }
}
