import java.util.Scanner;
class Main{
public static void main(String[]args)
{	
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter a String:");
  String str=sc.nextLine();
  String rev="";
  int len=str.length();
  for(int i=len-1;i>=0;i--)
{
 rev=rev+str.charAt(i);
}
 System.out.println("Reversed string is:"+rev);
 sc.close();
}
}