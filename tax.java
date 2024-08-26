public class tax {
    public static void main(String[] args) {
        float tax = 0;
        float income=3f;
        if(income<=2.5f)
        {
            tax = tax+0;
        }
        else if(income>2.5f && income<=5f)
        {
            tax=tax+0.05f*(income-2.5f);
        }
        else if(income>5f && income<=10f)
        {
            tax=tax+0.05f*(5.0f-2.5f);
            tax=tax+0.2f*(income-5f);
        }
        else if(income>10f)
        {
            tax=tax+0.05f*(5.0f-2.5f);
            tax=tax+0.2f*(income-5f);
            tax=tax+0.3f*(income-10.0f);
        }
        System.out.println("total tax paid:"+tax);
    }
}
