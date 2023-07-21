import java.io.*;
import java.util.*;
class Targetsum{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("enter the array size");
int n=s.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
{
a[i]=s.nextInt();
}
System.out.println("enter the target");
int target=s.nextInt();
for(int i=0;i<n;i++)
{
for(int j=1;j<n;j++)
{
if(a[i]+a[j]==target)
{
System.out.print("true");
System.out.println(a[i]+"+"+a[j]+"="+target);

break;
}


}
}
}
}
