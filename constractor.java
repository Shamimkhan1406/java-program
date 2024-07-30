class Myemployee
{
    public Myemployee()
    {
        id=789;
        name = "khanshamim";
    }

    public Myemployee(String Myname,int Myid)
    {
        id=Myid;
        name = Myname;
    }

    private int id;
    private String name;

    public String getNmae()
    {
        return name;
    }

    public void setName(String n)
    {
        this.name = n;
    }

    public void setId(int i)
    {
        this.id=i;
    }

    public int getId()
    {
        return id;
    }

}

public class constractor {
    public static void main(String[] args) {
        Myemployee shamim = new Myemployee("khan shamim",678);
        // shamim.setName("shamim khan");
        // shamim.setId(67);
        System.out.println(shamim.getId());
        System.out.println(shamim.getNmae());
    }
}
