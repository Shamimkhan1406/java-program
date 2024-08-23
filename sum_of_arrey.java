import javax.sound.sampled.SourceDataLine;

public class sum_of_arrey {
    public static void main(String[] args) {
        float sum=0;
        float []num={2.2f,5f,1.2f,4.0f,9.3f};
        for(int i=0;i<num.length;i++)
        {
            sum+=num[i];
        }
        System.out.println("total sum is:"+sum);
        System.out.println();
        int [][]matt1 = {{1,2,3},
                        {4,5,6}};
        int [][]matt2 = {{6,7,8},
                        {8,9,0}};
        int [][]result = {{0,0,0},
                         {0,0,0}};
        for(int i=0;i<matt1.length;i++)
        {
            for(int j=0;j<matt1[i].length;j++)
            {
                System.out.printf("value for i=%d and j= %d\n",i,j);
                result[i][j]= matt1[i][j]+matt2[i][j];
            }
            System.out.println("");
        }
        for(int i=0;i<matt1.length;i++)
        {
            for(int j=0;j<matt1[i].length;j++)
            {
                System.out.printf(result[i][j] + " ");
                // result[i][j]= matt1[i][j]+matt2[i][j];
            }
            System.out.println("");
        }
        
    }
    
}
