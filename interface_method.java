
interface camera
{
    void takeSnap();
    void recordVideo();
    default void record4k()
    {
        System.out.println("recording in 4k");
    }
}

interface wifi
{
    String[] getNetwork();
    void connectNetwork(String network);
}
class Mycellphone
{
    void callNumber(int phoneNumber)
    {
        System.out.println("calling"+phoneNumber);
    }

    void picCall(int phoneNumber)
    {
        System.out.println("connecting");
    }
}
class Mysmartphone extends Mycellphone implements wifi,camera
{
    public void takeSnap()
    {
        System.out.println("taking snap");
    }
    public void recordVideo()
    {
        System.out.println("recording video");
    }
    public String[] getNetwork()
    {
        System.out.println("getting list of network");
        String[] networklist={"shamim","khan","MD"};
        return networklist;
    }
    public void connectNetwork(String network)
    {
        System.out.println("connecting to the network"+network);
    }
    
}

public class interface_method {
    public static void main(String[] args) {
        Mysmartphone ms=new Mysmartphone();
        ms.record4k();
        String[] ar=ms.getNetwork();
        for(String item:ar)
        {
            System.out.println(item);
        }
        // polymorphism
        camera obj=new Mysmartphone(); // this is a smartphone use it as camera
        obj.record4k();
        
    }
}
