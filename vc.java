import java.util.Scanner;
class Main{
    public static void main(String[]args)
{
    String s=new String();
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a String:");
    s = sc.nextLine();
    s=s.toUpperCase();
    int i,vowel,cons;
    vowel=cons=0;
    for(i=0;i<s.length();i++)
  {
      char c=s.charAt(i);
      if(c!=' ')
{
      if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
       {
              vowel++;
        }
      else{
          cons++;
          }
        }
      }
      System.out.println("\nTotal no.of Vowels="+vowel+"\nTotal no.of Consonants="+cons);
 }
}
