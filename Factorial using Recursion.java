// static input and dynamic array
import java.util.*;
public class  Main{
    public static void main(String[] args){
        int []a=new int[5];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
    }
}
