import java.util.*;
public class Zero
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int[] arr=new int[5];
        int max=9999;
        int dif=9999;
        int n=0,m=0;
        for(int i=0;i<5;i++)
        {
            arr[i]=s.nextInt();
        }
        for(int j=0;j<5;j++)
        {
            for(int k=j;k<5;k++)
            {
                if((arr[k]+arr[j])<max && j!=k)
                {
                    max=Math.abs(arr[j]+arr[k]);
                    if(Math.abs(max)-0<dif)
                    {
                        dif=max;
                    n=arr[j];
                    m=arr[k];
                }
            }
        }
        }
        System.out.println(n+","+m);
}
}


