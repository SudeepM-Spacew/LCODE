import java.util.Scanner;
class Main{
  public static void main(String[]args)
  {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter a number:");
    int n=sc.nextInt();
    int temp1=n;
    int length=0;;
    while(temp1!=0)
      {
        temp1=temp1/10;//To remove the last digit and move to the next for future reference
        length++;
      }
    int temp2=n;
    int rem;
    int arms=0;
    while(temp2!=0)
      {
          rem=temp2%10;//to extract the last digit for future reference
          int mult=1;
        for(int i=0;i<length;i++)
          {
            mult=mult*rem;
          }
         arms=arms+mult;
        temp2=temp2/10;
      }
    if(arms==n)
    {
      System.out.println(n +" Given no. is Armstrong");
        }
    else{
      System.out.println(n +" Given no. is not an Armstrong");
    }
    sc.close();
  }
}
    
