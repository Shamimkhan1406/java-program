//In this code, I'm taking input from user out of 0,1,2 and generating random value using random method from 0 to 2. And then
//comparing input value with random value. As 0 stands for rock if user input 0 and generated random value is 1 then user lost as 
// 1 stand for paper. Along with this, I put whole function into while loop so that user can get 5 chance and with with chance
//there is one count variable which is counting every lost, win and tie game. In last I'm comparing these count variable for final result
//but my while loop is not working. '!!!!Please help me out with this!!!!""

import java.util.*;
import java.util.Random;

public class rockPaperScissor{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rc = new Random();
        

        //game logic
        int c=0,h=0;
        int n=1;
        while(n<6)
        {
            int comp_choice=rc.nextInt(3);
            System.out.println("choose 0 --> rock\nchoose 1 --> paper\nchoose 2 --> scissor\n");
            int userChoice=sc.nextInt(3);
            System.out.printf("you have chosed %d\n",userChoice);
            System.out.printf("computer have chosed %d\n",comp_choice);

            if(comp_choice==userChoice)
            {
                System.out.println("It's a draw");
            }
            else if(comp_choice==0)
            {
                if(userChoice==1)
                {
                    System.out.println("you won");
                    h++;
                }
                else
                {
                    System.out.println("computer Won");
                    c++;
                }
            }
            else if(comp_choice==1)
            {
                if(userChoice==0)
                {
                    System.out.println("computer Won");
                    c++;
                }
                else
                {
                    System.out.println("you Won");
                    h++;
                }
            }
            else if(comp_choice==2)
            {
                if(userChoice==0)
                {
                    System.out.println("you Won");
                    h++;
                }
                else
                {
                    System.out.println("computer Won");
                    c++;
                }
            }
            n++;
        }
        System.out.printf("your scoor is = %d\ncomputer's scoor is = %d\n",h,c);
    }
}