import java.io.*;

public class pattern_recr {
    static void printPattern(int n)
    {
        if(n==0)
        {
            
            return;
        }
        System.out.print("*");
        printPattern(n-1);
    }
    static void pattern(int n,int i)
    {
        if(n==0)
        {
            return;
        }
        // call
        // printPattern(i);
        //for normal pattern
        printPattern(n);
        System.out.println();
        pattern(n-1,i+1);
    }
    public static void main(String[] args) {
        int n=5;
        pattern(n,1);

    }
}
