import java.util.*;

public class fib {
    static int fib(int n)
    {
        if(n==1 || n==2)
        {
            return n-1;
        }
        else{
            return fib(n-1)+fib(n-2);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the range ");
        int range=sc.nextInt();
        int result = fib(range);
        System.out.println(result);

    }
}
