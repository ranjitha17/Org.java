import java.io.*;
import java.util.Scanner;
import java.util.Arrays;
class Dup
{
public static void main(String args[])
{int i;
  Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
 int a[]=new int[n];
 for(i=0;i<n;i++)
 {
     a[i]=sc.nextInt();
 }
 int t=0;
 for(i=0;i<n;i++)
 {
    t=t ^a[i];
 }
 System.out.println(t);
}
}
 



