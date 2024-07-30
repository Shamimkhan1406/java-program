class base1
{
    
    int f;
    base1()
    {
        System.out.println("i am a constractor:");

    }
    base1(int x)
    {
        this.f=x;
        System.out.println("i am a overload constractor with value of x as:"+x);

    }
}
class Drived1 extends base1
{
    Drived1()
    {
        super(0);
        System.out.println("i am a drived base constractor");
    }
    Drived1(int x,int y)
    {
        super(x);
        System.out.println("i am a over loaded drived constractor with value of y as:"+y);
    }
    //System.out.println("i am a drived base constractor");
}
class childOfDrive extends Drived1
{
    childOfDrive()
    {
        System.out.println("i am child of drive");
    }
    childOfDrive(int x,int y,int z)
    {
        super(x,y);
        System.out.println("i am an overloaded constractor of child of drived with value of z as:"+z);

    }
}

public class constractor_inheritance {
    public static void main(String[] args) {
        // base1 b= 
        // new base1();
        // new Drived1(14,9);
        // new childOfDrive(12,13,14);
        new childOfDrive(1, 2, 3);

    }
}
