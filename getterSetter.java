class cylender
{
    private int radius;
    private int hight;

    //constractor
    public cylender(int radius,int hight)
    {
        this.radius=radius;
        this.hight=hight;
    }

    public int getradius()
    {
        return radius;
    }
    public void setradius(int radius)
    {
        this.radius = radius;
    }
    public int gethight()
    {
        return hight;
    }
    public void sethight(int hight)
    {
        this.hight = hight;
    }
    public double surfaceArea()
    {
        return 2*3.142*radius*radius+2*3.142*radius*hight;
    }
    public double volume()
    {
        return 3.142*radius*radius*hight;
    }
}

public class getterSetter {
    public static void main(String[] args) {
        cylender Mycylender=new cylender(9,12);
        // Mycylender.sethight(12);
        // int h=Mycylender.gethight();
        // System.out.println(h);
        // Mycylender.setradius(9);
        // System.out.println(Mycylender.getradius());
        System.out.println(Mycylender.surfaceArea());
        System.out.println(Mycylender.volume());


    }
}
