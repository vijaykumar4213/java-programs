// Binary search
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int[]arr=new int[7];
	    Scanner sc=new Scanner(System.in);
	    for(int i=0;i<arr.length;i++)
	    {
	        arr[i]=sc.nextInt();
	    }
	    int s=sc.nextInt();
	    int i=0;
	    int j=arr.length-1;
	 while(i<j)
	    {
	     int mid=(i+j)/2;
	     if(arr[mid]==s)
	        {
	            System.out.println(mid);
	            System.exit(0);
	        }
	        if(arr[mid]<s)i=mid+1;
	        if(arr[mid]>s)j=mid;
	    }
		System.out.println("not found");
	}
}
