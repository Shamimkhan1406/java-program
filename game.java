
import java.util.Random;
import java.util.*;

class game1
{
    public int number;
    public int inputnum;
    public int noOfguesses;
    public int getnoOfguesses()
    {
        return noOfguesses;
    }
    public void setnoOfguesses(int noOfguesses)
    {
        this.noOfguesses=noOfguesses;
    }

    game1()
    {
        Random R=new Random();
        this.number=R.nextInt(100);
    }
    void takeuserinput()
    {
        System.out.println("guess any number between 0 to 100");
        Scanner sc=new Scanner(System.in);
        inputnum=sc.nextInt();
        
    }
    boolean iscorrectnum()
    {
        noOfguesses++;
        if(inputnum==number)
        {
            System.out.format("you guessed it right:\n it was %d\n you guessed it in %d attempts:\n",number,noOfguesses);
            return true;
            
        }
        else if (inputnum<number)
        {
            System.out.println("too Less...");
        }
        else if (inputnum>number)
        {
            System.out.println("too high..");
        }
        return false;
    }
}

public class game {
    public static void main(String[] args) {
        
        game1 G=new game1();
        boolean b=false;
        while(!b)
        {
        G.takeuserinput();
        G.iscorrectnum();
        // System.out.println(B);
        }
    }
}
