import java.io.*;
class Fact
{
public static void main(String[] args) 
{
      Scanner s=new Scanner(System.in);
      int f=s.nextInt();
      int fact = 1;
      for(int i=1;i<=f;i++)
      {
          fact=fact*i;
      }
      System.out.println(fact);
    }
    }
    
  
