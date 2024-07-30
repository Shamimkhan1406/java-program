class Student
{
    int salary;
    String name;

    public int getsalary()
    {
        return salary;
    }

    public String getname()
    {
        return name;
    }

    public void setName(String n)
    {
        name = n;
    }
}

class cellphone
{
    public void vibrate()
    {
        System.out.println("vibrate....");

    }
    public void ring()
    {
        System.out.println("ring...");
    }
    public void call()
    {
        System.out.println("call shamim");
    }
}

class Square
{
    int side;
    public int area()
    {
        return side*side;
    }
    public int perimeter()
    {
        return 4*side;
    }
}

class Myemployee
{
    private int id;
    private String name;

    public String getname()
    {
        return name;
    }

    public void setname(String n)
    {
        name =n;
    }

    public void setid(int i)
    {
        id = i;
    }

    public int getid()
    {
        return id;
    }
}

public class class2 {
    public static void main(String[] args) {
        // Employee shamim = new Employee();
        // shamim.setName("My name is shamim");
        // shamim.salary= 900;
        // //shamim.name= 
        // System.out.println(shamim.getsalary());
        
        // System.out.println(shamim.getname());

        cellphone vivo = new cellphone();
        vivo.call();
        vivo.ring();
        vivo.vibrate();
        
        Square sq = new Square();
        sq.side = 3;
        System.out.println(sq.area());
        System.out.println(sq.perimeter());

        Myemployee shamim=new Myemployee();

        shamim.setname("My name is khan");
        System.out.println(shamim.getname());

        shamim.setid(789);
        System.out.println(shamim.getid());

    }
}
