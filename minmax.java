import java.io.*;
import java.util.*;
public class minmax {
    public static void main(String args[])
    {
        int i,min,max,j;
    Scanner sc=new Scanner(System.in);
    int x=sc.nextInt();
int a[]=new int[x];
for(i=0;i<x;i++)
{
    a[i]=sc.nextInt();
}
for(i=0;i<x;i++)
{
    for(j=0;j<x;j++)
    {
     if(a[i]<a[j])
     {
        max=a[j];
     }else{
        if(a[i]>a[j])
        {
            min=a[j];
        }
     }

    }
}


    
}
}

