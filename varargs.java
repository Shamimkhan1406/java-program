public class varargs {
    static int sum(int a,int b,int c,int d)
    {
        return a+b;
    }

    static int sum(int ...arr)
    {
        int result=0;
        for(int a: arr)
        {
            result += a;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(sum(2,4,7));
    }
}
