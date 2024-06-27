        
import java.util.*;
public class maxi{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        
        for(int i=0;i<n;i++)
        {
           arr[i]=sc.nextInt();
        }

        Arrays.sort(arr);
       

        
        System.out.print("The maximum is"+arr[n-1]);

       
       

    }
}

/* output:
4
45
78
63
89
The maximum is89 */