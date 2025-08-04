import java.util.Scanner;
public class Assign2intermdiate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int sum1=0;
        int sum2=0;
        int sum3=0;
        while(true){
            System.out.println("Enter an a number(integer): ");
            n=sc.nextInt();
             if (n<0) {
                sum1=sum1+n;
            } else if (n>0&&n%2==0) {
                sum2=sum2+n;
            } else if (n>0&&n%2!=0) {
                sum3=sum3+n;
            }
             if(n==0){
                 System.out.println("The list is terminated now");
                 if(sum1!=0){
                     System.out.println("The sum of negative numbers is: "+sum1);
                 }
                if(sum2!=0){
                    System.out.println("The sum of positive even numbers is: "+sum2);
                }
                if(sum3!=0){
                    System.out.println("The sum of positive odd numbers is: "+sum3);
                }
                 break;
             }
       }
    }
}
