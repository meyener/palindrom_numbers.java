import java.util.Scanner;

/**
 * try_
 */
public class try_ {
    static int f(int a){
        int last,res=0;
        while (a!=0) {
            last=a%10;
            a=a/10;
            res=(res*10)+last;
        }

    
        return res;
    }
    public static void main(String[] args) {
        System.out.println("Please enter a number : ");
        Scanner scn= new Scanner(System.in);
        int b=scn.nextInt();

    
        for (int i = 0; i <=b ; i++) {
            int c= f(i);
            if (i==c) {
                System.out.println(i);
                
            } else {continue;
                
            }
            
        }
        
    }
}