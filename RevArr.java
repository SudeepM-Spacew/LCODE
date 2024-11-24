import java.util.Scanner;
class Main{
    public static void main(String[]args)
{
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of an array");
    int n=sc.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++)
{
    System.out.println("Enter array elements "+(i+1));
    a[i]=sc.nextInt();
}
  System.out.println("Elements of an array are:");
  for(int i=0;i<n;i++)
{
    System.out.print(a[i]+" ");
}
  System.out.println();
  System.out.println("Reversed array elements are:");
  for(int i=n-1;i>=0;i--)
{
   System.out.print(a[i]+" ");
}
  System.out.println();
  sc.close();
}
}
    
