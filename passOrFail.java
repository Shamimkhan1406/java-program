import java.util.*;

public class passOrFail {
    public static void main(String[] args) {
        int sub1,sub2,sub3;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter obtain marks of sub1:");
        sub1 = sc.nextInt();
        System.out.println("enter the obtain marks of sub2:");
        sub2 = sc.nextInt();
        System.out.println("enter the ibtain marks of sub3:");
        sub3 = sc.nextInt();
        int total = sub1+sub2+sub3;
        System.out.println("total is:"+total);
        float totalPercentage = (sub1+sub2+sub3)/300.0f*100;
        System.out.println("your overall percentage is :"+totalPercentage);
        if(sub1>=33 && sub2>=33 && sub3>=33 && totalPercentage>=40)
        {
            System.out.println("you are pass:");
        }
        else{
            System.out.println("you are fail");
        }
    }
}
