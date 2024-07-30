public class arrey {
    public static void main(String[] args) {
        int []marks=new int[5];
        float []per={22.3f,44f,55.34f,7f,2.01f};
        System.out.println(per.length);
        System.out.println(per[3]);

        for(int i=0;i<per.length;i++)
        {
            System.out.println(per[i]);
        }

        for(float element: per)
        {
            System.out.println("\n\t"+element);
        }
    }
}
