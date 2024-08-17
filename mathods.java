// mathods = function;

public class mathods {
    static void telljoke()
    {
        System.out.println("bla bla bla\nkhan");
    }
    static int logic(int x,int y)
    {
        int z;
        if(x>y)
        {
            z=x+y;
        }
        else{
            z=(x+y)*5;
        }
        return z;
    }
    public static void main(String[] args) {
        int c=logic(5,9);
        System.out.println(c);
        System.out.println(logic(5,6));
        telljoke();
    }
}
