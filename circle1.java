
class circle
{
    public int radius;
    circle()
    {
        System.out.println("i am non perm circle");
    }
    circle(int r)
    {
        System.out.println("i am circle constractor");
        this.radius=r;
    }

    public double area()
    {
        return Math.PI*this.radius*this.radius;
    }
}
class cylender extends circle
{
    public int hight;
    cylender()
    {
        System.out.println("bla bla");
    }
    cylender(int r,int h)
    {
        super(r);
        System.out.println("shamim khan\t"+volume());
        this.hight=h;
    }
    public double volume()
    {
        return Math.PI * this.radius*this.radius*this.hight;
    }
}

public class circle1 {
    public static void main(String[] args) {
        
        // circle obj=new circle(12);
        cylender obj=new cylender(7, 5);
        
        
    }
}
