import java.io.*;

import java.util.*;

class patten

{

public static void main(String args[])

{

int i,j;

Scanner s=new Scanner(System.in);

int a[][]=new int[3][3];

for(i=0;i<a.length;i++)

{

for(j=0;j<a.length;j++)

{

a[i][j]=s.nextInt();

}
}

for(i=0;i<a.length;i++)

{

for(j=0;j<a.length;j++)

{

if(i==1 && j==1 )

{

System.out.print(" "+a[i][j]);

}

else 

{

System.out.print(" *");

}
}


System.out.println();

}
}
}