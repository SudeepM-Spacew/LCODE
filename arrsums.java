import java.util.Scanner;
class Main{
    public static void main(String[]args){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the size of an array");
      int n=sc.nextInt();
      int a[]=new int[n];
      int sum1=0;
      for(int i=0;i<n;i++){
        System.out.println("Enter the elements of an array "+(i+1)+":");
        a[i]=sc.nextInt();
        sum1=sum1+a[i];
        }
        System.out.println("Sum1 of elements in the given array are :"+sum1); 
        int sum2=n*(n+1)/2;
        System.out.println("Sum2 of the numbers in the sequential manner from 1 to "+n+" are "+sum2);
        System.out.println("Missing number in the given seqeunce of array is :"+(sum2-sum1));
    }
    }
