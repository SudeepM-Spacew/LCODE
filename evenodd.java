import java.util.Scanner;
class Main{
public static void main(String[]args)
{
  int a[]=new int[5];
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the array elements:");
  for(int i=0;i<a.length;i++)
{
   a[i]=sc.nextInt();
   System.out.println(a[i]);
}
System.out.println("Even numbers in the given array are:");
for(int i=0;i<a.length;i++)
{
  if(a[i]%2==0)
{
  System.out.println(a[i]);
}
}
System.out.println("Odd numbers in the given array are:");
for(int i=0;i<a.length;i++)
{
  if(a[i]%2!=0)
{
  System.out.println(a[i]);
}
}
sc.close();
}
}
  
