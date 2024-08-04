import java.util.*;

public class percentage {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the total marks of a subject:");
        float totalM=sc.nextFloat();
        System.out.println("erter the obtain number or each subject");
        System.out.println("sub1:");
        float sub1 = sc.nextFloat();
        System.out.println("sub2:");
        float sub2 = sc.nextFloat();
        System.out.println("sub3:");
        float sub3 = sc.nextFloat();
        System.out.println("sub4:");
        float sub4 = sc.nextFloat();
        System.out.println("sub5:");
        float sub5 = sc.nextFloat();
        float avgPercentage = (sub1+sub2+sub3+sub4+sub5)/(totalM*5)*100;
        System.out.print("total percentage is: ");
        System.out.print(avgPercentage);
    }

}
