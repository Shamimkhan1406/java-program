public class reverse_arrey {

    public static void main(String[] args) {
        int []arr = {1,2,3,4,5,6};
        int l=arr.length;
        int n= Math.floorDiv(l,2);
        int temp;
        int min = Integer.MAX_VALUE;
        // System.out.println("minimum value is :"+min);
        int max=min;
        for(int e:arr)
        {
            if(e<max)
            {
                max=e;
            }
        }
        System.out.println("minimum element is"+max);

        for (int i=0;i<n;i++)
        {
            temp=arr[i];
            arr[i]=arr[l-i-1];
            arr[l-i-1]=temp;
        }
        for(int element:arr)
        {
            System.out.println(element +" ");
        }
    }
}
